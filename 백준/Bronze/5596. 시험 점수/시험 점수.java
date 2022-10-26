import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int sum=0;;
    	
    	
    	for (int i=0;i<2;i++) {
    		int a = in.nextInt();
    		int b = in.nextInt();
    		int c = in.nextInt();
    		int d = in.nextInt();
        	
        	if (sum<(a+b+c+d)) {
        		sum=a+b+c+d;
        	}
    	}
    	System.out.println(sum);
	}
	
}