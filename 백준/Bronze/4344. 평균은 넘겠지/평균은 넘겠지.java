import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	float[] cases = new float[in.nextInt()];
    	
    	for (int i=0;i<cases.length;i++) {
    		int[] numsL= new int[in.nextInt()];
    		double sum = 0;
    		double avg = 0;
    		float cnt = 0;
    		
    		for (int j=0;j<numsL.length;j++) {
    			numsL[j]=in.nextInt();
    			sum+=numsL[j];
    		} 
    		
    		avg=sum/numsL.length; 
    		
    		for (int j=0;j<numsL.length;j++) {
    			if (numsL[j] > avg) {
    				cnt++;
    			}
    		} 
    		cases[i]=cnt/numsL.length;
    		
    	}
    	
    	for (int i=0;i<cases.length;i++) {
    		System.out.printf("%.3f%%\n", cases[i]*100);
    	}
    	in.close();
    }
}