package pkg;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A={1,2,2,3,17,17};
		printArray(A);
		int [] out=removeDuplicates(A);
		printArray(out);


	}
	
	public static void printArray(int a[]){
		for(int i=0;i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}


	
	public static int[] removeDuplicates(int[] input){
		int i=1;
		int j=0;
		if(input.length<2)
			return input;
		
		while(i<input.length){
			if(input[i]==input[j]){
				i++;
			}else{
				input[++j]=input[i++];
			}	
			
		}
		
		int[] output = new int[j+1];
		for(int k=0; k<output.length; k++){
			output[k]= input[k];
		}
		return output;
	}
	

}
