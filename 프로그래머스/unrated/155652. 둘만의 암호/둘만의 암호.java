import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        Set<Character> set = new HashSet<>();

        for (char c : skip.toCharArray()) set.add(c);

        StringBuilder sb = new StringBuilder();

        for (char i='a';i<='z';i++) {
            if(!set.contains(i)) sb.append(i);
        }

        String a = sb.toString().repeat(3);
        
        for (int i=0;i<s.length();i++) {
            char cur = s.charAt(i);

            answer.append(a.charAt(a.indexOf(cur)+index));
        }
        return answer.toString();
    }
}