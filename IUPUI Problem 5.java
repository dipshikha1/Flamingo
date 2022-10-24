
import java.util.ArrayList;

public class Runner {	
	public static String moveToEnd(String todo) 
	{	String fixit = todo.substring(1)+todo.substring(0,1);		
		return fixit;
	}
	
	public static String oddsEvens(String todo) 
	{	String fixit = todo.substring(0,1)+todo.substring(2,3)+todo.substring(4,5)+todo.substring(6,7)+todo.substring(8,9)+todo.substring(1,2)+todo.substring(3,4)+todo.substring(5,6)+todo.substring(7,8)+todo.substring(9);
		return fixit;
	}

	public static void main(String[] args)	
	{	String original = "AEFGILMNOS"; 
		
		ArrayList<String> worker = new ArrayList<String>();		
		worker.add(original);
		
		int i = 0;
		
		do
		{	worker.add(moveToEnd(worker.get(i)));
			worker.add(oddsEvens(worker.get(i)));
			
			System.out.println(worker.get(i));
			i++;
		}while(!(worker.get(i-1).equals("FLAMINGOES")));
		
		System.out.println(i);
		
	}
}
