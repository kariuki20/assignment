import java.util.ArrayList;
import java.util.Iterator;

public class New {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Jenn");//Adding object in arraylist  
		list.add("Ronnie");  
		list.add("Dan");  
		list.add("Carol");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
		


	}

