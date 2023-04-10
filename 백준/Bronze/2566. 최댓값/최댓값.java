import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int x = 0;
        int y = 0;

        for(int i=0;i<9;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0;j<9;j++) {
                int a = Integer.parseInt(st.nextToken());

                if(a>max) {
                    max = a;
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((x+1)+" "+(y+1));
    }
}