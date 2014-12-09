public class Posiljka {
	
	public static double racunanjeVolumetrisjkeTezine (Dimensions  niz){
		double wV = ((niz.widht *niz.height * niz.length) / 5000);
		return wV;
	}
	
	public static double racunajCijena(Dimensions niz){
				
		double wV = racunanjeVolumetrisjkeTezine(niz);
		double cijena;
		
		if (wV > niz.weight) {
			cijena = wV * 3;
			return cijena;
		} else {
			cijena = niz.weight * 3;
		}
		return cijena;
	}
	
	public static Dimensions unosParametara (){
       Dimensions niz = new Dimensions();
        
		System.out.println("Unesite w");
		niz.widht= TextIO.getDouble();
		
		System.out.println("Unesite h");
		niz.height= TextIO.getDouble();
		
		System.out.println("Unesite l");
		niz.length= TextIO.getDouble();
		
		System.out.println("Unesite stvarnu tezinu");
		niz.weight = TextIO.getDouble();
		
		return niz;
	}
	
	public static void main(String[] args) {
        
		double cijena = racunajCijena(unosParametara());
		System.out.println("Cijena posiljke je " +cijena);
	}
}
