
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo{
	public static void main(String args[]){
		SetDemo setDemo = new SetDemo();
		Set hashSetForDemo=setDemo.createHashSet();
		Set linkedHashSetForDemo = setDemo.createLinkedHashSet();
		setDemo.printSet(hashSetForDemo);
		setDemo.printSet(linkedHashSetForDemo);
	}
	
	private Set createHashSet(){
		HashSet<Integer> setOfIntegers= new HashSet<>();
		setOfIntegers.add(130);
		setOfIntegers.add(340);
		setOfIntegers.add(440);
		return setOfIntegers;
		
	}
	
	private Set createLinkedHashSet(){
		LinkedHashSet<Integer>setOfIntegers= new LinkedHashSet<>();
		setOfIntegers.add(100);
		setOfIntegers.add(300);
		setOfIntegers(500);
		return setOfIntegers;
	}
	
	private void printSet(Set setToPrint){
		Iterator setIterator=setToPrint.iterator();
		while(setIterator.hasNext()){
			System.out.println(" Value of element in a set : "+setIterator.next());
		}
	}
}