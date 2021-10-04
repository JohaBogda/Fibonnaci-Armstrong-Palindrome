package UserInput;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
//		// checking if Scanner is working: 
//		System.out.println("Enter your name: ");
//		String userName = myObj.nextLine(); // read user input in next line
//		System.out.println("My name is " + userName);
		
		// 1. Write Fibonnaci series between the user entered start and end values
		
		System.out.println("Choose a starting number larger than 0: ");
		int startingNumber = myObj.nextInt(); 
				
		int n1 = 0;
		int n2 = 1;
		
		 
		for(int i=0;i<startingNumber;++i)  
		 {  
		 int n3=n1+n2; 
	
	  System.out.print(n1+ " ");  
		  n1=n2;  
		  n2=n3; 
		 }
		
//		2. Determine whether a user entered number is an Armstrong number
		
//		System.out.println("Type a number to check if it's an Armstrong: ");
//		int number = myObj.nextInt();
//		int temp = number;
//		int remainder = 0;
//		int sum = 0;
//		
//		while(number >0) {
//			remainder = number%10; 
//			sum = sum+(remainder*remainder*remainder);
//			number = number/10;
//		} if (temp==sum) {
//			System.out.println("It's an Armstrong number");
//		} else {
//			System.out.println("It's not an Armstrong number");
//		}

//		3. Write a program to see if a user entered string is a palindrome or not
		//System.out.println("Enter a string to check if it's palindrome: ");
		String str = myObj.next();
		String org_str=str;
		
		String reverse = "";
		
		int len = str.length();
		
		for(int ix=len-1; ix>=0; ix--) {
			reverse=reverse+str.charAt(ix);
		}
		
		 // System.out.println(reverse); prints the word reversed
		
		if(org_str.equals(reverse)) {
			System.out.println(org_str+ " is a Palindrome String");
		} else {
			System.out.println(org_str+ " is not a Palindrome String");
		}
		
	}

}
