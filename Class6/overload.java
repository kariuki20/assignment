package Class6;

public class overload {

	public static void main(String[] args) {
		
		System.out.println(sum1());
		System.out.println(sum(2+2));
		System.out.println(sum(3+2+4));
		
		
		
public static int sum1() {
	
		return 100;
	}

	public  static int sum1( int a ,int b) {
		return a+b;
	}

	public static int sum(int a,int b,int c) {
	
		return a+b+c;
	}
	

}


