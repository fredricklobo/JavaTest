package pkg;

public class DuplicateCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter;
		String str = "aaabbccccccd";
		char[] ch = str.toCharArray();
		int sz = ch.length;
		
		for(int i=0; i<sz; i++){
			counter =0;
			for(int j=0; j<sz; j++){
				
				if(j<i && ch[i]==ch[j])
					break;
				
				if(ch[i]==ch[j])
					counter++;
				
				if(j==sz-1)
					System.out.println(ch[i]+ " --> "+counter);
				
				
			}
		}
		

	}

}
