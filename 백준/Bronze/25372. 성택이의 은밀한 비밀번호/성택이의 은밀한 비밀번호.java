import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for(int i=0;i<T;i++) {
			String a = in.next();
			
			if (6<=a.length() & a.length()<=9) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}

	}

}