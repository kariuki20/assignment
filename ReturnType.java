
public class ReturnType {

	public static void main(String[] args) {
		int result=sum(5,6);
	System.out.println( sum(5,6)+100);
    System.out.println(result);
	}

	public static int sum(int a, int b) {
		return a+b;
	}
public static void sumA(int a,int b) {
	System.out.println(a+b);
}
public static  String x () {
	return "hello";
}
}
