import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int cnt = 0;
        int b = 64;

        if(a==64) System.out.println("1");
        else if(a==32) System.out.println("1");
        else {
            while(a>0) {
                if(a<b) {
                    b/=2;
                }
                else {
                    a-=b;
                    cnt++;
                }
            }
            System.out.println(cnt);
        }

    }
}