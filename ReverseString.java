package CommonlyASK;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
//		 String str,reverseStr="";
//		 char ch;
//		 Scanner sc=new Scanner(System.in);
//		 System.out.println("Enter the String: ");
//		 str=sc.nextLine();
//		 for(int i=0;i<str.length();i++) {
//			ch=str.charAt(i);
//			reverseStr=ch+reverseStr;
//		
//		 }
//		 System.out.println("reverse string is: "+reverseStr);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String inputStr=sc.nextLine();
		StringBuilder SBStr=new StringBuilder();
		SBStr.append(inputStr);
		SBStr.reverse();
		System.out.println("Reverse string is: "+SBStr);
	}

}
