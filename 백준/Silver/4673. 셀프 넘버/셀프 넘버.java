public class Main {
	
	static int sNum(int a) {
		
		int sum = a;
		
		while (a!=0) {
			sum = sum + (a%10);
			a=a/10;
		}
		return sum;
		
	}
	
	
	public static void main(String[] args) {
		
		boolean[] find = new boolean[10001];
		
		for (int i=1; i<10001;i++) {
			int n = sNum(i);
			if (n<10001) {
				find[n] = true;
			}
		}
		for (int i=1; i<10001;i++) {
			if (!find[i]) {
				System.out.println(i);
			}
		}
		
	}

}