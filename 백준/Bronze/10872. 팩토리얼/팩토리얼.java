import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println(method1(in.nextInt()));
		
	}
	static int method1(int a) {
		if (a<=1) return 1;
		return a * method1(a-1);
	}
}