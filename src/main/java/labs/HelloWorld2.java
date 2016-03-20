/** 
 * The HelloWorld class 
 * prints "Hello World!" to the standard output 
*/ 
public class HelloWorld {
	public static void main(String[] args){ 
		// Display "Hello World!" 
		System.out.println("Hello World-1!");
		HelloWorld2.main(null);
	}
} 

public class HelloWorld2 {
	public static void main(String[] args){ 
		// Display "Hello World!" 
		System.out.println("Hello World-2!");
	}
}
