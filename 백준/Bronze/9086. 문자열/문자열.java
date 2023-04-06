import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(br.readLine());

        for (int i=0;i<b;i++) {
            String a = br.readLine();
            System.out.println(a.charAt(0)+""+a.charAt(a.length()-1));
        }

    }

}