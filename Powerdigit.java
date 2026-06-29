package digit;

public class Powerdigit {
	public static int Power(int b, int e) {
		int Power=1;
		while(e>0) {
			Power = Power*b;
			e--;
		}
		return Power;
	}
	public static void main(String[] args) {
		System.out.println(Power(3,3));
	}
}