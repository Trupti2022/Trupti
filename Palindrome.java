package CommonlyASK;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String str, reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		str=sc.nextLine();
		 int lenght=str.length();
		 for(int i=lenght-1; i>=0;i--) {
			 reverse=reverse + str.charAt(i);
		 }
		 if(str.equals(reverse)) {
			 System.out.println("String is palindrome");
		 }
		 else {
			System.out.println("String is not palindrome");
		}
		

	}

}
