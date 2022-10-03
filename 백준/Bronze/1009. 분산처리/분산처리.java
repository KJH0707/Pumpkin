import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for(int i=0;i<T;i++) {
			int num = in.nextInt();
			int squared = in.nextInt();
			int fNum=1;
			for (int j=0;j<squared;j++) {
				fNum*=num;
				fNum%=10;
				if (fNum==0) {
					fNum=10;
				}
			}
			System.out.println(fNum);
		}
	}
}