import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		int ball = 1;
		
		
		for(int i=0;i<T;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			if (a!=ball) {
				if (b!=ball) {
					continue;
				}
				else {
					ball=a;
				}
			}
			else if (a!=b){
				ball=b;
			}
		}
		System.out.println(ball);
	}
}