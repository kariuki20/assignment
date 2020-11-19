package overLoad;

public class LearningOverload {

	public static void main(String[] args) {
		sum();
		sum(4);
		sum(4,4);
		sum(3,2,4);
	//System.out.println(sum1());
	
	System.out.println(sum(5,5));
	 System.out.println();
	
	
	}
public  static void sum(int i) {
		System.out.println(2+2);

			
		}
		

//overload uses the concept of polymophysis:overloading methods.having multiple methods with same 
	//name
	
	//polymorphism involves multiple methods with same name ie sum(),sum(nta,intb),sum(string a,5)
	
	
	public static  int sum(int i, int j, int k) {
	
		System.out.println(3+2+4);
		return 30;
	}

	public static int sum(int i, int j) {
		
		return  i+j;
	}

	public static int sum() {
		return 200;
	}

}
