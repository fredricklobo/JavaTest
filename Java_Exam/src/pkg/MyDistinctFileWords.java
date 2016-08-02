package pkg;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MyDistinctFileWords {
	
	public static void main(String[] args) throws IOException {
		
		
		List<String> array = new ArrayList<String>();
		File file = new File("C:\\Users\\Fredrick\\Downloads\\Assignment 2.txt");
		FileInputStream fin = new FileInputStream(file);
		BufferedReader reader = new BufferedReader(new  InputStreamReader(fin));
		
		String line=null;
		while((line = reader.readLine()) != null){
			StringTokenizer st = new StringTokenizer(line, " ,.,:,/");
			while(st.hasMoreTokens()){
				String tmp = st.nextToken().toLowerCase();
				if(!array.contains(tmp))
					array.add(tmp);
			}
		}
		
		for(String str:array){
			System.out.println(str);
		}
	}

}
