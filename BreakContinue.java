import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		System.out.println("give me a number");
		Scanner userinput=new Scanner(System.in);
		int n=userinput.nextInt();
		
		for(int i=0; i<=n; i++) {
			if( i==12) {
					continue;
			}
			System.out.println(i);
		}
		System.out.println("after loop");

	}

}
