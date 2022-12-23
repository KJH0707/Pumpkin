import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        Double b = in.nextDouble();
        
        if (a-(a*(b/100))<100) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}