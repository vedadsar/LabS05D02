public class DataBase {
	public static void main(String[] args) {
		
		
		User db = new User();
		
		System.out.println("Unesite ime");
		db.ime = TextIO.getln();
		
		System.out.println("Unesite prezime");
		db.prezime = TextIO.getln();
		
		System.out.println("Unesite broj godina");
		db.brojGodina = TextIO.getInt();
		
		
		
		
		System.out.println(db.ime + " " + db.prezime + " " + db.brojGodina);

	}
}
