package FilterExemple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Produit{
	
	 int id ; 
	 String name ; 
	 long prix ;
	
	 public Produit(int id , String name ,long prix) {
		 this.id=id ;
		 this.name = name ; 
		 this.prix = prix ; 
	 }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrix() {
		return prix;
	}

	public void setPrix(long prix) {
		this.prix = prix;
	}
	 
	
}

public class FilterExemple1 {
	
	public static void main(String[] args) {
		List<Produit>productlist = new ArrayList();
		productlist.add(new Produit(1 , "dell" , 2500));
		productlist.add(new Produit(2 , "sony" , 3500));
		productlist.add(new Produit(3 , "lenovo" , 1500));
		productlist.add(new Produit(4 , "hp" , 2500));
		
		for(Produit p:productlist) {
			System.out.println("nom : "+p.name+" , le prix et : "+p.prix);
		}
		System.out.println("---------");
		
		productlist.stream().dropWhile(p->p.getName().equals("dell"))
		.filter(p->p.getPrix()>=1500 && p.getPrix()<=3000)
		.forEach(p->System.out.println("nom : "+p.name+" , le prix et : "+p.prix));
		System.out.println("----------");
		
		List<Produit>resultList = productlist.stream().dropWhile(p->p.getName().equals("dell"))
				.filter(p->p.getPrix()>=1500 && p.getPrix()<=3000)
				.collect(Collectors.toList()); 
		for(Produit p:resultList) {
			System.out.println("nom : "+p.name+" , le prix et : "+p.prix);
		}
		
	}

}
