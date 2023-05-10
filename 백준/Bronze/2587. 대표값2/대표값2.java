import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<Integer>();
        int sum = 0;

        for (int i=0;i<5;i++) {
            int a = Integer.parseInt(br.readLine());
            list.add(a);
            sum+=a;
        }
        list.sort(Comparator.naturalOrder());
        System.out.println(sum/5);
        System.out.println(list.get(2));
    }
}