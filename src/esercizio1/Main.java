package esercizio1;

public class Main {

	public static void main(String[] args) {
		Rettangolo r1 = new Rettangolo(15, 3.4);
		Rettangolo r2 = new Rettangolo(25, 5.3);
		
		Rettangolo.stampaRettangolo(r1);
		
		Rettangolo.stampaRettangolo(r2);
		
		Rettangolo.stampaRettangoli(r1, r2);

	}

}
