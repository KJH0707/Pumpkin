import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
                Map<String,Integer> map = new HashMap<String,Integer>();
                
                for (int i=0;i<name.length;i++) map.put(name[i],yearning[i]);

                for (int i=0;i<photo.length;i++) {
                    int a = 0;
                    for (String b : photo[i]) {
                        if(map.get(b)!=null) a+=map.get(b);
                    }
                    answer[i]=a;
                }

                return answer;
    }
}