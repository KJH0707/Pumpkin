import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = Integer.parseInt(new StringBuilder().append(s.nextInt()).reverse().toString());
		int b = Integer.parseInt(new StringBuilder().append(s.nextInt()).reverse().toString());
		
		System.out.println((a>b)?a:b);
	}
	
}