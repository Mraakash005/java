package digit;

public class pattern4 {
	public static void pattern(int num) {
		for(int i = 1; i <= num ; i++) {
			char ch = (char) ('a' + (i-1) * 4);
			for(int j = 1; j<=i;j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
			}
		}
		public static void main(String[] args) {
		
		pattern(5);
	}
}