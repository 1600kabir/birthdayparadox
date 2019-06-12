
public class BirthdayParadox {

	public static double factorial(double n) {
		if (n == 0 || n == 1) {
			return n;
		}
		else {
			return n * factorial(n-1);
		}
	}
	public static double power(double b, double e) {
		double s = 1;
		for(int i = 0; i<e; i++) {
			s *= b;
		}
		return s;
	}
	public static double BDay(double b) {
		return (factorial(365)/(power(365, b)*factorial(365-b))) * 100;
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(BDay(23));

	}

}
