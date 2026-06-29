package digit;

public class OctalConversion {
	public static void octalConversion(int num) {
		String bin = "";
		while(num!=0) {
			int ld =num % 8;
			bin = bin + ld;
			num = num /8;
		}
		System.out.println(bin);
	}
	public static void main(String[] args) {
		octalConversion(100);
	}

}
