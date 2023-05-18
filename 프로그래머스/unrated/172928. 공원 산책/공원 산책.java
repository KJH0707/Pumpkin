import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        char[][] park2 = new char[park.length][];

        for (int i=0;i<park.length;i++) {
            String a = park[i];
            park2[i] = new char[a.length()];
            for (int j=0;j<a.length();j++) {
                park2[i][j]=a.charAt(j);
                if(a.charAt(j)=='S') {
                    answer[0]=i;
                    answer[1]=j;
                }
            }
        }

        for (String a : routes) {
            StringTokenizer st = new StringTokenizer(a);
            String b = st.nextToken();
            int c = Integer.parseInt(st.nextToken());

            int x = answer[1];
            int y = answer[0];

            for (int i = 0; i < c; i++) {
                if ("E".equals(b)) x++;
                else if ("W".equals(b)) x--;
                else if ("S".equals(b)) y++;
                else if ("N".equals(b)) y--;

                if(-1<x && -1<y && park2.length>y && park2[0].length>x) {
                    if (park2[y][x] == 'X') break;
                    else if (i==c-1) {
                        answer[0]=y;
                        answer[1]=x;
                    };
                }
            }
        }
        return answer;
    }
}