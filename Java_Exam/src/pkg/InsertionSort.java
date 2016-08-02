package pkg;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data ={9,6,5,0,7,2,3,1};
		printNumbers(data);
		int[] result =insertionSort(data);
		printNumbers(result);

		
	}
	
	public static void printNumbers(int[] input){
		for(int i=0; i<input.length; i++){
			System.out.print(input[i]+" ");
			
		}
		System.out.println("\n");
		
		}

	
	
	
	
	public static int[] insertionSort(int[] data){
		for(int j=1; j<data.length; j++){
			int key= data[j];
			int i = j-1;
			while((i>=0) &&(data[i])>key){
				data[i+1] =data[i];
				i--;
			}
			data[i+1] =key;
		}
		return data;
	}

}
