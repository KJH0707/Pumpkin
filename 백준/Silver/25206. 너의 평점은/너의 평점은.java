import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String,Float> hs = new HashMap<String,Float>();
        hs.put("A+", 4.5F);
        hs.put("A0", 4.0F);
        hs.put("B+", 3.5F);
        hs.put("B0", 3.0F);
        hs.put("C+", 2.5F);
        hs.put("C0", 2.0F);
        hs.put("D+", 1.5F);
        hs.put("D0", 1.0F);
        hs.put("F", 0.0F);

        float totalG = 0;
        float total = 0;

        for (int i=0;i<20;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            Float b = Float.parseFloat(st.nextToken());
            String c = st.nextToken();

            if (!(c.equals("P"))) {
                total+=b;
                totalG+=hs.get(c)*b;
            }
        }
        br.close();
        System.out.println(totalG/total);
    }
}