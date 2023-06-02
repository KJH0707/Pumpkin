class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";

        for (int i=0;i<s.length();i++) {
            char b = s.charAt(i);
            for(int j=0;j<index;j++) {
                b++;
                if (b>122) b=97;
                if (skip.contains(String.valueOf(b))) j--;
            }
            answer+=b;
        }
        return answer;
    }
}