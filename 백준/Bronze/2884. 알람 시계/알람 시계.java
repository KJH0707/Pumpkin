import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
        int c = b-45;
        if (0>c & a!=0) { 
            a-=1;
            c+=60;
        }
        else if (a==0 & 0>c) {
        	a+=23;
    		c+=60;
        }
        
        System.out.printf("%d %d", a,c);
	}
}