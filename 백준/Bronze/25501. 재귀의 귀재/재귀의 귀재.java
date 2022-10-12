import java.util.Scanner;

public class Main{
	static int cnt = 0;
    public static int recursion(String s, int l, int r){
    	cnt++;
    	if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else {
        	return recursion(s, l+1, r-1);
        }
    }
    public static int isPalindrome(String s){
    	cnt=0;
    	return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
    	
    	int T = in.nextInt();
    	
    	for (int i=0;i<T;i++) {
    		String str = in.next();
    		System.out.printf("%d %d",isPalindrome(str),cnt);
    		System.out.println();
    	}
    }
}