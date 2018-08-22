public class Conditionals {
	public static void main(String[] args) {
		System.out.println(parameter(0,2, false));
	}
	public static int parameter(int n, int i, boolean bool ){
			
		if (bool == true) {
				return n + i;
			} else if( n == 0 ) {
				return i;
			}else if(i == 0) {
				return n;
			}
		
		return n * i;	
			
	}
}









