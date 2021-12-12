


class Verifportable implements MyFonctionalInterface {

	@Override
	public boolean test(Ordinateur ordinateur) {
		// TODO Auto-generated method stub
		return ordinateur.isProtable();
	}
	
}
public class Main {
	
	public static void main(String[] args) {
		
		//classique exemple 
		
		Ordinateur ord = new Ordinateur("dell" , "8GB","IntelCoreI5", true,false);
		Verifportable v = new Verifportable();
		System.out.println(v.test(ord));
		//exemple avec lambda expression
		MyFonctionalInterface myfunc = o->o.isBureautique() ;
		System.out.println(myfunc.test(ord));
	}
	
	
	
	
}
