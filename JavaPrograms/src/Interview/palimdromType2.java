package Interview;

public class palimdromType2 {

	public static void main(String[] args) {

		String input = "madam";
		String reversed =new StringBuilder(input).reverse().toString();
		
		if(input.equals(reversed)) {
			System.out.println(input  +" Palimdrom");
		}
		else {
			System.out.println(input  +" Not a palimdrom");
		}
		
	}

}
