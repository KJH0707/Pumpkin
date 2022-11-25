import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String a = in.next();
		int T = in.nextInt();
		int cnt = 0;
		
		for (int i=0;i<T;i++) {
			String b = in.next();
			
			if(a.equals(b)) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}