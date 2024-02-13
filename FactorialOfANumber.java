package CommonlyASK;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {
	
		int n,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		if(n<0) {
			System.out.println("Number is negative");
		}
		else 
			for(int i=1;i<=n;i++) {
				fact=fact*i;
			}
		System.out.println("factorial number is: "+fact);
	}

}
