package FilterExemple;

import java.util.Arrays;
import java.util.List;

public class FilterExemple3 {
	
	public static void main(String[] args) {
		
		List<String>names = Arrays.asList("sofien","zied","zayety", "khalil");
		names.stream().filter(s->s.contains("i")).forEach(System.out::println);
		
	}
	
	


}
