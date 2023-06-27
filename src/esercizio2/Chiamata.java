package esercizio2;

public class Chiamata {
	
	private String numeroChiamato;
	private float durata;
	
	public Chiamata(String numeroChiamato, float durata) {
		this.numeroChiamato = numeroChiamato;
		this.durata = durata;
	}

	public String getNumeroChiamato() {
		return numeroChiamato;
	}

	public float getDurata() {
		return durata;
	}

	@Override
	public String toString() {
		return "Chiamata [numeroChiamato=" + numeroChiamato + ", durata=" + durata + "]";
	}
	
	

}
