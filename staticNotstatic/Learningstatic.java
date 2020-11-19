package staticNotstatic;

public class Learningstatic {
	static int a =16;
	 int b=10;
	
	public static void main(String[]args) {
		System.out.println(a);
		
		Learningstatic ls=new Learningstatic();
		System.out.println(ls.b);
		ls.test2();
		System.out.println(ls.b);
	}
public static void test() {
	a=100;	
		
	}
public  void test2() {
	b=500;
}
}
