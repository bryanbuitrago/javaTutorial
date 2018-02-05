package javaTut12DB;
import java.util.Arrays;
import java.util.LinkedList;


public class JavaLessonTwelve {
	
	public static void main(String[] args){
		
		LinkedList linkedListOne = new LinkedList();
		
		LinkedList<String> names = new LinkedList<String>();
		
		names.add("Ahmed Bennani");
		names.add("Ali Syed");
		
		names.addLast("Nathan Martin");
		
		names.addFirst("Joshua Smith");
		
		names.set(2, "Paul Newman");
		
		names.remove(3);
		
		names.remove("Josua Smith");
		
		
		for(String name: names)
		{
			System.out.println(name);
		}
		
		System.out.println("\nFirst Index: " + names.get(0));
		
		System.out.println("\nLast Index: " + names.getLast());
		
		LinkedList<String> nameCopy = new LinkedList<String>(names);
		
		System.out.println("\nnameCopy: " + nameCopy);
		
		if(names.contains("Joshua Smith"))
		{
			System.out.println("\nJosh is Here");
		}
		
		if(names.containsAll(nameCopy))
		{
			System.out.println("\nColletions are the Same");
		}
		
		System.out.println("\nAli index at: " + names.indexOf("Ali Syed"));
		
		System.out.println("\nList Empty: " + names.isEmpty());
	}
}
