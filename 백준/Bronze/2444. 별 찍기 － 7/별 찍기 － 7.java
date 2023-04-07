import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int space = a-1;
        int star = 1;
        for (int i=0;i<a;i++) {

            for (int j=0;j<space;j++) {
                System.out.print(" ");
            }

            for (int k=0;k<star+(i*2);k++) {
                System.out.print("*");
            }
            System.out.println();
            space--;
        }
        space = 1;
        for (int i=a-1;i>0;i--) {
            for (int j=0;j<space;j++) {
                System.out.print(" ");
            }

            for (int k=0;k<star+((i-1)*2);k++) {
                System.out.print("*");
            }
            System.out.println();
            space++;
        }
    }
}