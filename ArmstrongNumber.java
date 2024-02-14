package CommonlyASK;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1=sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2=sc.nextInt();
		int temp,digit,sum;
		for(int i=num1;i<num2;i++) {
			temp=i;
			sum=0;
			while (temp!=0) {
				digit=temp % 10;
				sum=sum + digit * digit * digit;
				temp= temp/10;
			}
			if(sum==i)
				System.out.println(i+" is an Armstrong");
		}

	}

}
