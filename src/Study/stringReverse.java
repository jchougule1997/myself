package Study;

public class stringReverse {

	public static void main(String[] args) {
		
		
		
		
		String name="jalindar";
		int a=name.length();
		
		String rev="";
		
		
		for(int i=a-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println("Reverse of          "+    name  +"      is    " +rev);
	}

}
