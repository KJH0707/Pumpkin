import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for (int i=0;i<T;i++) {
			int h = in.nextInt();
			int w = in.nextInt();
			int g = in.nextInt();
			
			if (g%h==0) {
				System.out.println((h*100)+g/h);
			}
			else {
				System.out.println(((g%h)*100)+((g/h)+1));
			}
		}
	}
}