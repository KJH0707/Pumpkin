import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int num2 = in.nextInt();
		int x=num/4;
		int y=num%4;
		int x1=num2/4;
		int y1=num2%4;
		if (num%4==0) {
			x-=1;
		}
		if (num2%4==0) {
			x1-=1;
		}
		
		if (y==0) {
			y=4;
		}
		if (y1==0) {
			y1=4;
		}
		
		num=x-x1;
		num2=y-y1;
		if (num<0) {
			num=-num;
		}
		if (num2<0) {
			num2=-num2;
		}
		System.out.println(num+num2);
	}
}