import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        while(true) {
            List<Integer> list = new ArrayList<Integer>();
            int N = Integer.parseInt(br.readLine());
            int a = N;
            if (N==-1) break;
            for (int i=1;i<N;i++) {
                if(N%i==0) {
                    list.add(i);
                    a -= i;
                }
            }
            if (a==0) {
                System.out.print(N+" = ");
                for(int i=0;i<list.size();i++) {
                    System.out.print(list.get(i));
                    if(i<list.size()-1) {
                        System.out.print(" + ");
                    }
                }
                System.out.println();
            } else {
                System.out.println(N + " is NOT perfect.");
            }

        }
        
    }
}