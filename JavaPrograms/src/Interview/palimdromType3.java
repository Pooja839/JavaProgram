package Interview;

public class palimdromType3 {

	public static void main(String[] args) {
		
		int n =123;
		int rev =0;
		int temp = n;
		
		while(temp > 0) {
			int reminder = temp%10;
			
			rev = (rev*10)+reminder;
			temp = temp/10;
			
		}
		if(n == rev) {
			System.out.println(n + " is a palimdrom");
		}
		else {
			System.out.println(n + " is not a palimdrom");
		}

	}

}
