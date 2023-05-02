import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int sum = a+b+c;
        int cnt = 0;

        if (a==b) cnt++;
        if (a==c) cnt++;
        if (b==c) cnt++;

        if (sum!=180) {
            System.out.println("Error");
        } else if(cnt==0) {
            System.out.println("Scalene");
        } else if(cnt==1) {
            System.out.println("Isosceles");
        } else if(cnt==3) {
            System.out.println("Equilateral");
        }
    }
}