import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int T = in.nextInt();
        
        for (int i=0;i<T;i++) {
            String a = in.next();
            
            System.out.println(a.toLowerCase());
        }
    }
}