package pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> list = new ArrayList<String>();
		
		list.add("India");
		list.add("USA");
		list.add("UK");
		list.add("China");
		
		for(String l:list){
			System.out.println(l);
		}
		
		List<String> immutablelist = Collections.unmodifiableList(list);
		//immutablelist.add("China");
		System.out.println(immutablelist.contains("India"));
		


	}
	
}
