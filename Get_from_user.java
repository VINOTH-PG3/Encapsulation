package usefultips;

import java.util.Scanner;

public class Get_from_user {
	private static Scanner newobject2;

	public static void main(String[] args) {
		
		  newobject2 = new Scanner(System.in);
	    System.out.println("enter your name");
		String name=newobject2.nextLine(); // for string we will give .nextLine
	   // newobject2.nextLine(); //just empty line to wait to get user if enter it shows empty line 
  
	    System.out.println("hello"+" "+name);

	    //newobject2.nextLine();
	    System.out.println("WHATS UR RATTING OF YOUR COMPANY FROM 1 TO 8");
	    short ratings=newobject2.nextShort();// for others data type we will give data type name.nextshort
	   
	    newobject2.nextLine();
	  
	    System.out.println("Enter your emil id");
	    String Email=newobject2.nextLine();
	    System.out.println("Thank you you rated us  "+ratings);
	   System.out.println("Your Email ID is  "+Email);
	   
	}
	
	

}
