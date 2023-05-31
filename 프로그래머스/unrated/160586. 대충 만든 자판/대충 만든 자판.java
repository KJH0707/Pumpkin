import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int[] answer = new int[targets.length];
        for (String a : keymap) {
            for (int j=0;j<a.length();j++) {
                if(map.get(a.charAt(j))==null) map.put(a.charAt(j), j + 1);
                else {
                    if (map.get(a.charAt(j)) > j + 1) {
                        map.put(a.charAt(j), j + 1);
                    }
                }
            }
        }
        for (int i=0;i<targets.length;i++) {
            String a = targets[i];
            int b = 0;
            for (int j=0;j<a.length();j++) {
                if (map.get(a.charAt(j))==null) {
                    b=-1;
                    break;
                }
                b+=map.get(a.charAt(j));
            }
            answer[i]=b;
        }
        return answer;
    }
}