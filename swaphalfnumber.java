package digit;

public class swaphalfnumber {
	public static int swapDigits(int num) {
		int result = 0;
		int multi = 1;
		
		while(num!=0) {
			
			int digit1 = num%10;
			num = num/10;
			if(num == 0) {
				result = result + digit1*multi;
				break;
			}
			int digit2 = num%10;
			num = num/10;
			int swappedpair = digit1*10+digit2;
			result = result+swappedpair*multi;
			multi = multi*100;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(swapDigits(1234567890));
}
}
