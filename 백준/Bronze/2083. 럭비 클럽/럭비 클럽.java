import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			String name = in.next();
			int age = in.nextInt();
			int weight = in.nextInt();
			
			if (name.equals("#")) {
				if (age==0 & weight==0) {
					break;	
				}
				
			}
			if (17<age | 80<=weight) {
				System.out.println(name+" Senior");
			}
			else {
				System.out.println(name+" Junior");
			}
		}

	}

}