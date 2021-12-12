import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class CalcR {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter number");

	    String input = myObj.nextLine();
	    int in = Integer.parseInt(input);
		int nbRep = 1 ;
	while(calRep(in)>=10) {
		System.out.println(calRep(in));
		nbRep +=1 ;
		
		calRep(calRep(in)) ;
		System.out.println(calRep(calRep(in)));
		if (calRep(calRep(in))<10) break  ; 
	}
     System.out.println(nbRep);
		
		  
}
	public static  int calRep(int input) {
		String inputTostring = String.valueOf(input) ; 
		List<Integer> table = new ArrayList<>(); 
		for(int i =0 ;i< inputTostring.length() ;i++ ) {
			table.add(Character.getNumericValue(inputTostring.charAt(i))) ; 
		}
		for (int i = 0 ; i<table.size()-1 ; i++) {
			 int res = table.get(i)*table.get(i+1);
			 table.set(i+1, res);
		}
		
		return table.get(table.size()-1) ; 
	}
	
}
