package esercizio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		SIM s1 = new SIM("3485673542");
		
		System.out.println("Quanto vuoi ricaricare?");
		Scanner sc = new Scanner(System.in);
		double ricarica = sc.nextDouble();
		 sc.nextLine();
		s1.ricarica(ricarica);
		
		for(int i =0; i < 10; i++) {
			System.out.println("Inserisci numero da chiamare e durata in minuti");
			
			String numero = sc.nextLine();
			float durata = sc.nextFloat();
			System.out.println("Chiamata al: " + numero + "\n di minuti: " + durata);
			s1.chiama(numero, durata);
			System.out.println(s1);
			 sc.nextLine();
		}
		
		sc.close();

	}

}
