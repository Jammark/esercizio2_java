package esercizio2;

import java.util.Arrays;

public class SIM {
	
	public static final float tariffa = 0.20f;
	
	private String numeroDiTelefono;
	private double creditoDisponibile = 0.0;
	private Chiamata[] ultimeChiamate = new Chiamata[5];
	
	public SIM(String numeroDiTelefono) {
		this.numeroDiTelefono = numeroDiTelefono;
	}

	@Override
	public String toString() {
		return "SIM [numeroDiTelefono=" + numeroDiTelefono + ", creditoDisponibile=" + creditoDisponibile
				+ ", ultimeChiamate=" + Arrays.toString(ultimeChiamate) + "]";
	}
	
	public void chiama(String numero, float durata) {
		if(creditoDisponibile > tariffa * durata) {
		Chiamata c = new Chiamata(numero, durata);
		
		for(int i = 0; i < ultimeChiamate.length - 1; i++) {
			
			
				ultimeChiamate[i] = ultimeChiamate[i+1];
			
		}
		
		ultimeChiamate[4] = c;
		creditoDisponibile-= tariffa * durata;
		}else {
			System.out.println("Credito non disponibile");
		}
	}
	
	public void ricarica(double credito) {
		this.creditoDisponibile+= credito;
	}

}
