import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int cnt=0;
        int a = in.nextInt();
        
        for (int i=0;i<5;i++) {
            
               int b = in.nextInt();
            if (a==b) {
                cnt++;
            }
            
        }
        System.out.println(cnt);
    }
}