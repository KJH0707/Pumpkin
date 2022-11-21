import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		
		int e = (b/d)*(c/d);
		
		if (e<a) {
			System.out.println(e);
		}
		else {
			System.out.println(a);
		}
	}
}