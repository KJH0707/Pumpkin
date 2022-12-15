import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        int f = in.nextInt();
        
        int sum = 0;
        if(d>a) {
            sum+=d-a;
        }
        if(e>b) {
            sum+=e-b;
        }
        if(f>c) {
            sum+=f-c;
        }
        System.out.println(sum);
    }
}