package digit;

public class pattern2 {
	public static void main(String[] args) {
		int n =3;
		for(int r = 1;r<=n;r++) {
			for(int c = 1 ;c<=n;c++) {
				if(r==1 || c==1|| c==n ||r==n)
					System.out.print("* ");
					else
						System.out.print("  ");
			}
			System.out.println();
		}
	}	
}
