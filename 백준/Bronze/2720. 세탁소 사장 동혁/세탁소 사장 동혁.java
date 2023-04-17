import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        for (int i=0;i<N;i++) {
            int a = Integer.parseInt(br.readLine());
            StringBuffer sb = new StringBuffer();

            if(a/25>0) {
                sb.append(a/25+" ");
                a-=25*(a/25);
            }else {
                sb.append("0 ");
            }

            if(a/10>0) {
                sb.append(a/10+" ");
                a-=10*(a/10);
            }else {
                sb.append("0 ");
            }

            if(a/5>0) {
                sb.append(a/5+" ");
                a-=5*(a/5);
            }else {
                sb.append("0 ");
            }

            if (a/1>0){
                sb.append(a);
            }else {
                sb.append("0");
            }
            System.out.println(sb.toString());
        }

    }
}