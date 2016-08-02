package pkg;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		for(int i=0; i<n; i++){
			System.out.println(fibonacci(i));
		}

	}
	
	public static long fibonacci(int n){
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return fibonacci(n-1)+fibonacci(n-2);
	}

}
