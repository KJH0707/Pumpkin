import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<Integer>();
        int cnt=2;

        while(a!=1) {
            if(a%cnt==0) {
                a/=cnt;
                list.add(cnt);
            }
            else {
                cnt++;
            }
        }

        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }
}