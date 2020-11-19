package homework;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		//q.4 ask the user for a string and print if  the string is palindrome ie hello==olleh
		System.out.println("give me a string ");
		Scanner userInput =new Scanner (System.in);
		String word= userInput.next();
		//hbirthday=word
		//yadtrib=reverse word
		
		char[] wordCharArray=word.toCharArray();
		String reversedWord="";
		for(int i=word.length()-1;i>=0; i--) {
			reversedWord=reversedWord+wordCharArray[i];
		}
		System.out.println(reversedWord);

//	if(word.equalsIgnoreCase(reversedWord)) {
//System.out.println("palindrome");
//}
	//else {
	//	System.out.println("not a palindrome");
	//}
}

	private static String wordCharArray(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
}