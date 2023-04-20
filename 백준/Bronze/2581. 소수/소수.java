import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int total = 0;
        int min = 10000;

        List<Integer> list = new ArrayList<Integer>();

        for (int i=a;i<=b;i++) {
            int cnt = 0;
            for (int j=2;j<=i;j++) {
                if (i%j==0) cnt++;
            }
            if (cnt==1) {
                total+=i;
                if(min>i) min=i;
            }
        }
        if (total==0) {
            System.out.println(-1);
        }else {
            System.out.println(total);
            System.out.println(min);
        }
    }
}