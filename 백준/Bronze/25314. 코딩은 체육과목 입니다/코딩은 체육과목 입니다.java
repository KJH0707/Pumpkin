import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        br.close();
        StringBuilder b = new StringBuilder();
        b.append("long ");

        for (int i=0;i<(a/4-1);i++) {
            b.append("long ");
        }
        b.append("int");
        System.out.println(b.toString());
    }
}