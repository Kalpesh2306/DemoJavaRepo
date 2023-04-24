package ArrayList;
import java.util.ArrayList;
public class Example {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();

		//isEmpty() method: it is use to identfy whether the arraylist is empty or not .return type is boolean
		System.out.println(al);
		System.out.println("------isEmpty()------");	
		System.out.println(al.isEmpty());
		System.out.println("------add(value)---return type is Boolean---");	
		//add() : its use to add the object to the array list.
		al.add(1);
		al.add(2);
		System.out.println(al);
		System.out.println("------add(index,value)------");		
		// we can add object at perticular index as well add(index,value)
		al.add(2,4);
		System.out.println(al);
		System.out.println(al.isEmpty());
		//we can add obj of array list to another array list using obj.addAll(obj).
		System.out.println("------adding obj of one array list to another array list--obj.addAll(obj)---return type is collection-");	
		ArrayList al2=new ArrayList();
		al2.addAll(al);
		System.out.println(al);
		System.out.println(al2);
		//to access the value at particular index we use get() return type is object
		System.out.println("-----to access value at perticular index using get()----return type is object------");
		System.out.println(al.get(2));


		//to get the size of the arraylist we user size() return type is int.
		System.out.println("--------to get the size of arraylist using size()---return type is int-----");
		System.out.println(al.size());

		//to check whether the object is present in array list or not we use contains method return type is boolean.
		System.out.println("---------to check whether object is preset or not--contains()--return type is boolean-----");
		al.add(3);
		al.add(5);
		al.add(10);
		al.add(14);
		System.out.println(al.contains(5));

		//it use to get index of the object using indexOf(object e) return type is integer

		System.out.println("----use to get index of the object from array list --indexOf(object e)--- return type is integer----");

		System.out.println(al);
		System.out.println(al.indexOf(10));

		//how to make Arraylist as homegenous using <>
		System.out.println("------------homogenous ArrayList---------------");
		ArrayList<Integer> obj	=new ArrayList();
		obj.add(5);
		obj.add(6);
		obj.add(7);
		obj.add(8);

		System.out.println(obj);
		
		//we can fetch the or access the object rom the arraylist without using the get method.using for each loop.
		System.out.println("---for each loop-------");
		
		for(Object e:obj)
		{
			System.out.println(e);
		}
		
		//Remove object from the arraylist
		System.out.println("---------remove object using remove(int index)------");
		
		System.out.println(obj);
		obj.remove(2);
		System.out.println(obj);
		//removeAll Method 
		System.out.println("---comapre two arraylist and remove object which are common----using removeAll()----");
		System.out.println(al);
		System.out.println(al2);
		al.removeAll(al2);
		System.out.println(al);
		System.out.println(al2);
		
		//retainAll method used to comapr array list and remove the objects which are mot common
		System.out.println("------retainAll()---------");
		al.retainAll(obj);
		System.out.println(al);
		System.out.println(obj);
		//set() is use to update the object at perticular index.
		System.out.println("---------update the object at perticular index---");
		obj.set(2,9);
		System.out.println(obj);
		
		obj.add(null);
		obj.add(null);
		obj.add(null);
		obj.add(null);
		System.out.println(obj);
		
		System.out.println(obj.size());
	}

}
