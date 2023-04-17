import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int jin = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<Integer>();

        while(a!=0) {
            list.add((a%jin));
            a=a/jin;
        }

        StringBuffer sb = new StringBuffer();
        for (int i=list.size()-1;i>=0;i--) {
            int b = list.get(i);
            if(b>9) sb.append((char)(b+55));
            else sb.append(b);
        }

        System.out.println(sb.toString());
    }
}
