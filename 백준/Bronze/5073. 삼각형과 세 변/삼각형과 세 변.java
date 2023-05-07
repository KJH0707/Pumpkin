import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a==0 && b==0 && c==0) break;

            int sum = a + b + c;
            int max=0;

            if(max<a) max=a;
            if(max<b) max=b;
            if(max<c) max=c;

            int cnt = 0;

            if (a == b) cnt++;
            if (a == c) cnt++;
            if (b == c) cnt++;

            if (sum-max<=max) System.out.println("Invalid");
            else if (cnt == 0) {
                System.out.println("Scalene");
            } else if (cnt == 1) {
                System.out.println("Isosceles");
            } else if (cnt == 3) {
                System.out.println("Equilateral");
            }
        }
    }
}