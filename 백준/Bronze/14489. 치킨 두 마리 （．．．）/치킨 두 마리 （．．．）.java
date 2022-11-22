import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt() + in.nextInt();
		int b = in.nextInt();
		int d = 0;
		int e = a;
		
		while (a>=b & d<2) {
			a-=b;
			d++;
		}
		
		
		if (d==1) {
			System.out.println(e);
		} else {
		System.out.println(a);
		}
	}

}