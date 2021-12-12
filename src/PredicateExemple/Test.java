package PredicateExemple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test {
	
	public static void main(String[] args) {
		
		Voiture voiture = new Voiture("ibiza", "1234 tunis 2011", 2);
		Predicate<Voiture> pr = v->v.getNumport()>2 ; 
		System.out.println(pr.test(voiture));
		List<Voiture> voiturelist = new ArrayList<>() ; 
		voiturelist.add(voiture) ; 
		voiturelist.add(new Voiture("kia", "tunis220", 4));
		voiturelist.add(new Voiture("golf", "tunis220", 2));
		voiturelist.add(new Voiture("Golf", "tunis221", 4));
		Predicate<Voiture> pp = v->v.getMarque().equalsIgnoreCase("golf")
				&&v.getNumport()>2 ; 
				
		for(Voiture vtest:voiturelist) {
			if(pp.test(vtest)) {
				System.out.print("la marque de voiture et "+vtest.getMarque()+ "la matricule"+vtest.getMatricule());
			}
			 
		}
	
		
		
	}

}
