import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int lank = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<Integer>();

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        list.sort(Comparator.reverseOrder());

        System.out.println(list.get(lank-1));
    }
}