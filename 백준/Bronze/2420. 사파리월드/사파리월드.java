import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        long a = in.nextInt();
        int b = in.nextInt();
        
        if (a<=b) {
        	System.out.println(b-a);
        }
        else {
        	System.out.println(a-b);
        }
        
	}
}