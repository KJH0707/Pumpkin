import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		int h = 0;
		
		while(true) {
			if (1<a && b>0) {
				a-=2;
				b-=1;
				h++;
			}
			else {
				break;
			}
		}
		System.out.println(h);
	}

}