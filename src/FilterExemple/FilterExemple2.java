package FilterExemple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExemple2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer>integerlist = new ArrayList<Integer>();
		integerlist.add(10); 
		integerlist.add(15); 
		integerlist.add(20); 
		integerlist.add(25); 
		integerlist.stream().filter(i-> i%2==0).forEach(System.out::println);
		
		//insert eventnumber in collection result
		List<Integer>eventlist=integerlist.stream().filter(i-> i%2==0)
				.collect(Collectors.toList());
		System.out.print(eventlist); 
	}

}
