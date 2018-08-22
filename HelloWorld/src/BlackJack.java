
public class BlackJack {
	public static void main(String[] args) {
		System.out.println(parameter1(21, 22));
	}

	public static int parameter1(int a, int b) {
		if (a < 0 | b < 0) 
			return 0;
		
		if (a >= b && a < 22 | (a < 22 & b < 21)) 
				return a;
				
		if ((b > a) && (b < 22) | (b < 22 & a > 21)) 
			
				return b;
			else 
				return 0;
			
		
	}

}
