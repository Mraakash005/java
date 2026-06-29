package digit;

public class pattern7 {
	
	    	public static void main(int num) {
	    		for(int i = 1; i<=2* num -1; i++) {
	    			int n;
	    			if(i<= num)
	    				n=i;
	    			else
	    				n=2*num-i;
	    			for (int j = 1; j<= n; j++) {
	    			System.out.print("* ");
	    		}
	    		System.out.println();
	    	}
	    	
	    
	 }
	    	public static void main(String[] args) {
	    		main(4);
	    	}
	}