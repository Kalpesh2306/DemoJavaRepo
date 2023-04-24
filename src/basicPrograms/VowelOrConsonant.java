package basicPrograms;

public class VowelOrConsonant {

	public static void main(String[] args) {
		
		char input='Z';
		
		if(input =='a'||input=='e'|| input=='i'||input=='o'||input=='u'||input =='A'||input=='E'|| input=='I'||input=='O'||input=='U')
		{
			System.out.println(input +" number is vowel");
		}
		else {
			System.out.println(input +" number is consonant");
		}
	}

}
