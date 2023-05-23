class Solution {
    public int[] solution(String[] wallpaper) {
        int rdx = 0;
        int rdy = 0;

        int lux = 51;
        int luy = 51;

        char[][] files = new char[wallpaper.length][wallpaper[0].length()];

        for (int i=0;i<wallpaper.length;i++) {
            String a = wallpaper[i];
            for (int j=0;j< wallpaper[0].length();j++) {
                char b = a.charAt(j);

                if(b=='#') {
                    if(i<lux) lux=i;
                    if(j<luy) luy=j;
                    if(i>rdx) rdx=i;
                    if(j>rdy) rdy=j;
                }
            }
        }

        int[] answer = {lux,luy,rdx+1,rdy+1};
        return answer;
    }
}