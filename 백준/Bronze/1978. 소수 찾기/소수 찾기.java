import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = 0;

        for (int i=0;i<N;i++) {
            int a = Integer.parseInt(st.nextToken());
            List<Integer> list = new ArrayList<Integer>();
            if(a==1) continue;
            for (int j=1;j<=a;j++) {
                if (a%j==0) {
                    list.add(j);
                }
            }
            if(list.size()==2) {
                cnt++;
            }

        }
        System.out.println(cnt);
    }
}