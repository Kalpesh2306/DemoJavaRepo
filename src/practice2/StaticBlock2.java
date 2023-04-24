package practice2;

public class StaticBlock2 {
	static {
	
				System.out.println("i am SB 1");
			}
	
	public static void main(String[] args)
			{
				System.out.println("Main method");
			}

	static {

			System.out.println("i am SB 2");
			}
	static {
			System.out.println("i am SB 3");
			}
	
}
