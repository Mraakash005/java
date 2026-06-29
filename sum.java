package digit;

public class sum {
	public static int digit(int num) {
		int sum =0;
		while(num!=0) {
			int ld = num%10;
			sum=sum+ld;
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
	System.out.println(digit(543));	
	}

}