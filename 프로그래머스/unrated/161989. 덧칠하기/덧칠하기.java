class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] wall = new boolean[n];

        for(int i=0;i<section.length;i++) {
            wall[section[i]-1] = true;
        }

        for (int i=0;i<wall.length;i++) {
            boolean a = wall[i];

            if(a) {
                for(int j=i;j<i+m;j++) {
                    if(j>wall.length-1) break;

                    wall[j]=false;
                }
                answer++;
            }
        }

        return answer;
    }
}