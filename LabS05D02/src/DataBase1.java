public class DataBase1 {
	public static void main(String[] args) {
		User[] nizUsera = new User[3];

		for (int i = 0; i < nizUsera.length; i++) {

			User db = new User();

			System.out.println("Unesite ime");
			db.ime = TextIO.getWord();

			System.out.println("Unesite prezime");
			db.prezime = TextIO.getWord();

			System.out.println("Unesite broj godina");
			db.brojGodina = TextIO.getInt();

			nizUsera[i] = db;
		}

		//System.out.println(db.ime + " " + db.prezime + " " + db.brojGodina);
		for(int i=0; i<nizUsera.length;i++){
			System.out.println(nizUsera[i].ime +" " +nizUsera[i].prezime +" " +nizUsera[i].brojGodina);
		}

	}
}