package digit;

public class pattern6 {
	public static void main(String[] args) {
		int n=4;
		int mid =n;
		
		for(int i = 1;i<=n;i++)
		{
			char ch='a';
			for(int j = 1 ;j<=2*n-1;j++) {
				if(i+j>=n+1 && j-i<= n-1)
					if(j < mid)
						System.out.print(ch++ +" ");
				else
					System.out.print(ch-- +" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}