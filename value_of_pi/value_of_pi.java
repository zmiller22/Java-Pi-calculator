public class value_of_pi {

public static void main(String[] args) {

	double pi = 3.14159;
	double a = 1.00000;
	double ans = 1;

	while (ans != pi) {
		ans = ans - (1/(a+2)) + (1/(a+4));
		a = a + 4;

	String	ansString = (ans*4 + "");
	String cutString = ansString.substring(0,7);
		
	System.out.println("Calculating pi...  " + ans*4);

		if (cutString.equals("3.14159")){
			System.out.println("Confirmed the value of pi is 3.14159");
			break;
		}

		else {}

} }

	
}


