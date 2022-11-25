import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int storage=n; // 26
        int f_Num=n/10+n%10; // 8
        
    	f_Num=(storage%10)*10+f_Num%10; // 68, 
    	storage=f_Num/10+f_Num%10; // 14,
        
        
        for (int i=2;;i++) {
        	f_Num=(f_Num%10)*10+storage%10; // 84, 42, 26
        	storage=f_Num/10+f_Num%10; // 12, 6,
        	if (n==0) {
        		System.out.println(1);
        		break;
        	}
        	else if (f_Num==n) {
        		System.out.println(i);
        		break;
        	}
        }
    }
}