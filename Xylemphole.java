package digit;

public class Xylemphole {
	public static boolean isXylem(int num) {
		int extremeSum =0;
		int midSum= 0;
		extremeSum = num %10;
		num /= 10;
		while(num >=10) {
			int ld = num % 10;
			midSum +=ld;
			num /=10;
		}
		extremeSum+=num;
		return extremeSum == midSum;
	}
	public static void main(String[] args) {
		System.out.println(isXylem(123456));
	}

}
