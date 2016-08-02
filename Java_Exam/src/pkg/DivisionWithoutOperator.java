package pkg;

import java.util.Scanner;

public class DivisionWithoutOperator {
	
	public static void main(String args[]){

		int num,div,res,qui = 0,rem = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num=sc.nextInt();
		System.out.println("Enter a divisor: ");
		div = sc.nextInt();
		
		for(int i=0; i<num; i++){ 
			
			res = div*i;
			
			if(res>num){
				
				res = res-div;
				qui=i-1;
				rem = num-res;
				break;
			}
			
			
		}
		System.out.println("Quotient: "+qui);
		System.out.println("Remainder: "+rem);
		
	 }

}
