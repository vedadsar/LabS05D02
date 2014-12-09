public class DataBase1 {

	public static User[] dataBase() {

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
		return nizUsera;
	}

	public static void ispisDataBase(User[] nizUsera) {

		for (int i = 0; i < nizUsera.length; i++) {
			System.out.println(nizUsera[i].ime + " " + nizUsera[i].prezime
					+ " " + nizUsera[i].brojGodina);
		}
	}

	public static void najstarijiUser(User[] nizUsera) {
		int min = nizUsera[0].brojGodina;
		String ime = "";
		for (int i = 1; i < nizUsera.length; i++) {

			if (nizUsera[i].brojGodina < min) {
				min = nizUsera[i].brojGodina;
				ime = nizUsera[i].ime;
			}
		}
		System.out.println("Najmladji user je " + ime + " i ona ima " + min
				+ " godina.");
	}

	public static void main(String[] args) {

		// ispisDataBase(dataBase());
		najstarijiUser(dataBase());

	}
}