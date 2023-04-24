package string;

public class StringPractice1 {

	public static void main(String[] args) {
		
System.out.println("-----------------------------------IndexOf method--------------------------------");
		
			
		String s1="hoiahikjahiqklwqjehi";
		
		System.out.println(s1.indexOf('q'));
		System.out.println(s1.indexOf('a',3));
		System.out.println(s1.indexOf("kj"));
		System.out.println(s1.indexOf("hi",7));
		
System.out.println("-----------------------------------Substring method--------------------------------");
		
		String S2="JAMESGOSLING";
		System.out.println(S2.substring(5));
		System.out.println(S2.substring(3,7));
		
		System.out.println("-----------------------------------Split  method--------------------------------");
		
		String S3="Hi how are you ?";
			String [] ch=	S3.split(" ");
		for (int i=0;i<ch.length ;i++)
		{
			
			System.out.println("value of index  :"+i+ " is " +ch[i]);
		}
		
		
		System.out.println("-----------------------------------Split  method--------------------------------");

	}

}
