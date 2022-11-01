import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a=0;
		
		for (int i=0;i<5;i++) {
			a+=in.nextInt();
		}
		System.out.println(a);
	}

}