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

        for (int i=0;i<N;i++) {
            a[i]=i+1;
        }

        for (int i=0;i<b;i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = a[x-1];
            int z2 = a[y-1];
            a[x-1] = z2;
            a[y-1] = z;

        }
        for (int j=0;j<N;j++) {
            System.out.print(a[j]);
            if (j<N-1) {
                System.out.print(" ");
            }
        }
    }
}