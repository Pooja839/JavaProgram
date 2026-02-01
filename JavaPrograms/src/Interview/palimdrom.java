package Interview;

public class palimdrom {

	public static void main(String[] args) {
		
		String input ="peep";
		String reversed ="";

		for(int i=0; i<input.length();i++){
			reversed = input.charAt(i)+input;
			
		}
		if(input.equals(reversed)) {
			System.out.println(input+" is a palimdrom");
		}
		else {
			System.out.println(input + " not a palimdrom");
		}
	}

}
