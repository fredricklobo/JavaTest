package pkg;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int temp =n;
		
		int result = reverse(n);
		System.out.println(result);
		
		boolean flag = armstrongNumber(temp, result);
		if(flag == true){
			System.out.println(n+" is a Armstrong number");
		}else{
			System.out.println(n+" is not a Armstrong number");
		}
	}
	
	public static int reverse(int n){
		int sum=0, rem;
		do{
			
			rem = n%10;
			sum += Math.pow(rem, 3); 
			n = n/10;
		}while(n!=0);
		return sum;
	}
	
	public static boolean armstrongNumber(int temp, int sum){
		if(sum == temp)
			return true;
		else
			return false;
	}
}
