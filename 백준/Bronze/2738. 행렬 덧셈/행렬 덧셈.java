import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[][] aa = new int[a][b];
        int[][] bb = new int[a][b];

        for(int i=0;i<a;i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j=0;j<b;j++) {
                aa[i][j]= Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<a;i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j=0;j<b;j++) {
                bb[i][j]= Integer.parseInt(st.nextToken());
            }
        }
        bf.close();
        for(int i=0;i<a;i++) {

            for (int j=0;j<b;j++) {
            System.out.print(aa[i][j]+bb[i][j]);
            if(j<b-1) {
                System.out.print(" ");
            }
            }
            System.out.println();
        }
    }
}
