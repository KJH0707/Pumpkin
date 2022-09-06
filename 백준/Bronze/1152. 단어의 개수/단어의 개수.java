import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String a = in.nextLine();
		int cnt=0;
		boolean[] c= new boolean[a.length()];
		int cnt2=0;
		
		for (int i=0;i<a.length();i++) {
			char b= a.charAt(i);
			if (b!=' ') {
				c[cnt]=true;
			}
			else {
				cnt++;
			}
		}
		
		for (int i=0;i<a.length();i++) {
			if (c[i]==true) {
				cnt2++;
			}
		}
		System.out.println(cnt2);
	}

}