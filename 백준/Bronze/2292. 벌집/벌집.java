import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int room = in.nextInt();
		int first = 1;
		int cnt=1;
		
		while (room>first) {
			first+=6*cnt;
			cnt++;
		}
		System.out.println(cnt);
	}
}