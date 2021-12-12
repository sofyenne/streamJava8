package MapExemple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapExemple1 {
	
	
	public static void main(String[] args) {
		
		
		List<String>vehicules = Arrays.asList("mazda" , "ford" , "fiat") ; 
		
		vehicules.stream().map(name->name.substring(0,1).toUpperCase()+name.substring(1))
		.forEach(System.out::println);
	}

}
