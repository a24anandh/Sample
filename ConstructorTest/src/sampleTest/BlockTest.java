package sampleTest;

public class BlockTest {
	
	{
		System.out.println("normal block");
	}
	
	static {
		System.out.println("static block1");
	}
	static {
		System.out.println("static block2");
	}
	
	public static void add(){
		System.out.println("function block");
	}
	
	public BlockTest(){
		System.out.println("constuctor block");
	}
	
	static {
		add();
		System.out.println("static block3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("-----main-----");
		BlockTest b=new BlockTest();// normal and constuctor
		

	}

}
