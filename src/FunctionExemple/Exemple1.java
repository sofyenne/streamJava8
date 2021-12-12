package FunctionExemple;

import java.util.function.Function;


class Moyenne{
	float noteds  ;
	float noteexam ; 
	int coff ;
	public Moyenne(float ds , float ex , int coff) {
		noteds=ds ; 
		noteexam = ex ; 
		coff = coff ;
	}
}
public class Exemple1 {
	
	public static void main(String[] args) {
		
		
		//abstract methode name apply take 2 arguments value and return type
		Function<String,Integer>fun = (len)->len.length() ; 
		System.out.println(fun.apply("sofien")) ; 
		
		Function<Moyenne , Float > calc = (moy)->{
			float ds=(moy.noteds*100)/20 ; 
			float exam = moy.noteexam*100/80 ; 
			float m = ds+exam*moy.coff ;
			return m ; 
			};
			
        System.out.println("le mayenne de la matiere et" + calc
        		.apply(new Moyenne(10,10,1)));	
			
			
		
	}

}
