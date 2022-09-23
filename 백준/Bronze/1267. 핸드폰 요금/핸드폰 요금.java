import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	int T = in.nextInt();
    	
    	int M =0;
    	int Y =0;
    	
    	int mSum=0;
    	int ySum=0;
    	
    	for (int i=0;i<T;i++) {
    		int sec = in.nextInt();
    		Y = (sec/30 + 1) * 10;
    		M = (sec/60 + 1) * 15;
    		
    		mSum +=M;
    		ySum +=Y;
    	}
    	
    	if (mSum<ySum) {
			System.out.printf("M %d",mSum);
		}
		else if(ySum<mSum) {
			System.out.printf("Y %d",ySum);
		}
		else {
			System.out.printf("Y M %d",mSum);
		}
	}
}