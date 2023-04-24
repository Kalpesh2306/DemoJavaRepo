package LogicalProgram1;

import java.util.HashMap;
import java.util.Set;

public class Example15_Duplicate_Character_from_given_String_using_HashMap {

	public static void main(String[] args) {

		
		String str="abcdaaabc";
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			
			if(map.containsKey(ch))
			{
				map.put(ch,map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
			
		}
		
		Set<Character> keys=map.keySet();
		for(Character key:keys)
		{
			System.out.println(key +": "+map.get(key));
			
		}
		

	}

}
