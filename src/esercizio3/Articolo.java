package esercizio3;

public class Articolo {
	
	private String codice;
	private float prezzo;
	private String descrizione;
	private int disponibilità;
	
	public Articolo(String codice, float prezzo, String descrizione, int disp) {
		this.codice = codice;
		this.prezzo = prezzo;
		this.descrizione = descrizione;
		this.disponibilità = disp;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public String getCodice() {
		return codice;
	}

	@Override
	public String toString() {
		return "Articolo [codice=" + codice + ", prezzo=" + prezzo + ", descrizione=" + descrizione + ", disponibilità="
				+ disponibilità + "]";
	}
	
	

}
