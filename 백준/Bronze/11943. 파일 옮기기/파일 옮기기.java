import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int aSum = 0;
		int bSum = 0;
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		
		aSum = a+d;
		bSum = b+c;
		
		System.out.println((aSum<bSum)?aSum:bSum);
		
	}
}