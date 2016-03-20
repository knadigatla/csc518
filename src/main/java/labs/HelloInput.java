import java.util.Scanner;
/** 
 * input class
*/ 
public class HelloInput {
	public static void main(String[] args) { 
	    Scanner keyboard = new Scanner(System.in);
	    System.out.println("enter an integer");
	    int myint = keyboard.nextInt();
	    System.out.format(" input an integer as:%d", myint);
	} 
} 
