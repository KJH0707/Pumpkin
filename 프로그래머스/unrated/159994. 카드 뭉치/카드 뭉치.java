import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        List<String> c1 = new ArrayList<String>();
        List<String> c2 = new ArrayList<String>();
        String answer = "Yes";

        for (int i=0;i<cards1.length;i++) c1.add(cards1[i]);
        for (int i=0;i<cards2.length;i++) c2.add(cards2[i]);


        for (String a : goal) {
            if (!c1.isEmpty() && a.equals(c1.get(0))) {
                c1.remove(0);
            } else if (!c2.isEmpty() && a.equals(c2.get(0))) {
                c2.remove(0);
            } else {
                answer="No";
                break;
            }

        }
        return answer;
    }
}