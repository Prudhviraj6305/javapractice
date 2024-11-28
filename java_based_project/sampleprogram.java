package java_based_project;

public class sampleprogram {
	public static void main(String[] args) {
		System.out.println("enter a program to print");
		print((float) 10.0);
		seen("karan","kiran");
		unseen(10);
		dontwo(50,30);
		
	}

	private static void unseen(int a) {
		System.out.println("this is an casual methods");
	}

	private static void seen(String a,String b) {
	int a1=10;
	System.out.println(a1*8+"=times ");
	clear();
	}

	private static void clear() {
		System.out.println("nothing to clear thats it");
	}

	private static void dontwo(int a,int b) {
		System.out.println("here some integers both");
	}

	private static void print(float b ) {
		System.out.println("here float points");
	}
	

}
