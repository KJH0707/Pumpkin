import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o',
    			'p','q','r','s','t','u','v','w','x','y','z'};
    	int[] answer= {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
    			,-1,-1,-1,-1,-1,-1};
    	
    	
    	String str = in.next();
    	
    	for (int i=0;i<str.length();i++) {
    		char b = str.charAt(i);
    		for (int j=0;j<alphabet.length;j++) {
    			if (alphabet[j]==b & answer[j]==-1) {
    				answer[j]=i;
    				break;
    			}
    		}
    		
    	}
    	for (int i=0;i<alphabet.length;i++) {
			System.out.print(answer[i]+" ");
		}
	}
}