import java.util.Scanner;

public class Main {
	
	static int method(int a) {
		if (a==0) return 0;
		if (a==1) return 1;
		return method(a-1)+method(a-2);
		
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println(method(in.nextInt()));
	}
	
}