package string;

public class StingUsingnNewKeyword {

	public static void main(String[] args) {
String a=new String ("HELLO");
System.out.println(a);

String b="kalpesh";
String c="KALPESH";
String d="";
String S1="Hello world";
String S2="casesensetive";
String S3="Welcome";


System.out.println(b);
System.out.println(b.length());
System.out.println(b.toUpperCase());
System.out.println(a.toLowerCase());

System.out.println(a.equals(b));
System.out.println(b.equalsIgnoreCase(b));
System.out.println(b.contains("pes"));
System.out.println(d.isEmpty());
System.out.println(c.isEmpty());
System.out.println(c.charAt(2));
System.out.println(a.charAt(4));
System.out.println(S1.startsWith("Hel"));
System.out.println(S1.endsWith("rld"));
System.out.println(S1.indexOf(" "));
System.out.println(S1.lastIndexOf("d"));
System.out.println(S2.substring(4));
System.out.println(S2.substring(4,9));
System.out.println(S3.concat(b));
System.out.println(S3.concat(" to earth"));
System.out.println(S1.replace("Hello","hi"));
System.out.println(S2.replace('e', 'i'));


	}

}
