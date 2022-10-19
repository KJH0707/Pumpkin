import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		int cnt=0;
		
		for (int i=0;i<=T;i++) {
			String str = in.nextLine();
			
			if(cnt>0) {
			System.out.println(cnt+". "+str);
			}
			cnt++;
		}

	}

}