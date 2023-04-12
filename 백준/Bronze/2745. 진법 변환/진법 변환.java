import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        int jin = Integer.parseInt(st.nextToken());
        int total = 0;
        int b=1;
        for (int i=a.length()-1;i>=0;i--) {
            int n = a.charAt(i);

            if(n<59) {
                n-=48;
            }
            else {
                n-=55;
            }

            total+=n*b;
            b*=jin;
        }
        System.out.println(total);
    }
}
