package esercizio3;

import java.util.Date;
import java.util.Scanner;

public class Main {
	
	public static final Articolo[]magazzino = {
			new Articolo("A01", 10, "paletta", 6),
			new Articolo("A02", 20, "secchiello", 16),
			new Articolo("A03", 100, "scarpe", 60),
			new Articolo("A04", 40, "bracciale", 30),
	};

	public static void main(String[] args) {
		
		Cliente c = new Cliente("C01", "prova@gmail.com", "Paolo", "Rossi",  new Date());
		Carrello cr = new Carrello(c);
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			System.out.println("Inserire codice prodotto...");
			int cod = sc.nextInt();
			cr.aggiungiArticolo(seleziona(cod));
			System.out.println(cr);
			sc.nextLine();
		}
		
	}
	
	public static Articolo seleziona(int n) {
		for(int i = 0; i < magazzino.length; i++) {
			if(magazzino[i].getCodice().equals("A0"+n)) {
				return magazzino[i];
			}
		}
		return null;
	}

}
