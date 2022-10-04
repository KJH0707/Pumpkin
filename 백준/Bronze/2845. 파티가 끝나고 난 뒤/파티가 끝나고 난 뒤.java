import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	int h = in.nextInt();
    	int p = in.nextInt();
    	
    	for (int i=0;i<5;i++) {
    		int n = in.nextInt();
    		System.out.println(n-h*p);
    	}
	}
}