package CommonlyASK;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		  int num;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter a number: ");
		  num=sc.nextInt();
		  if (isPrime(num)) {
			System.out.println("Number is Prime");
		} else {
			System.out.println("Number is not prime");

		}
		 
	}
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i <Math.sqrt(num);i++) {
			if (num % i==0) {
				return false;
			}
		}
		
		return true;
	}

}
