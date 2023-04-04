import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] a = new int[N];
        int b = Integer.parseInt(st.nextToken());
        for (int i=0;i<b;i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            for (int j=x;j<=y;j++) {
                a[j-1]=z;
            }
        }
        for (int i=0;i<N;i++) {
            System.out.print(a[i]);
            if (i<N-1) {
                System.out.print(" ");
            }
        }

    }
}