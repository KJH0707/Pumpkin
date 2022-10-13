import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		int size=15;
		int[][] apart = new int[size][size];		
		
		for (int i=0;i<size;i++) {
			apart[i][0]=1;
			apart[0][i]=i+1;
		}
		
		for (int i=1;i<size;i++) {
			for (int j=1;j<size;j++) {
				apart[i][j]=apart[i-1][j]+apart[i][j-1];
			}
		}
		
		for (int i=0;i<T;i++) {
			System.out.println(apart[in.nextInt()][in.nextInt()-1]);
		}
	}

}