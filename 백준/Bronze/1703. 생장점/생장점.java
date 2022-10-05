import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		
		while(true) {
			int T = in.nextInt();
			int leaf =1;
			if (T==0) {
				break;
			}
			for (int j=0;j<T*2;j++) {
				int a = in.nextInt();
				if (j%2==0) {
					leaf*=a;
				}
				else {
					leaf-=a;
				}
			}
			System.out.println(leaf);
		}
	}

}