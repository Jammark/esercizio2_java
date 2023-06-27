package esercizio3;

import java.util.Arrays;

public class Carrello {
	
	private Cliente cliente;
	private Articolo[] articoli;
	private float totale = 0;
	
	public Carrello(Cliente cliente) {
		this.cliente = cliente;
		this.articoli = null;
	}
	
	public void aggiungiArticolo(Articolo a) {
		this.totale+=a.getPrezzo();
		if(this.articoli != null) {
			int l = this.articoli.length;
			Articolo arr[] = new Articolo[l + 1];
			for(int i = 0; i < l; i++) {
				arr[i] = this.articoli[i];
			}
			arr[l] = a;
			this.articoli = arr;
		}else {
			Articolo arr[] = {a};
			this.articoli = arr;
		}
	}

	@Override
	public String toString() {
		return "Carrello [articoli=" + Arrays.toString(articoli) + ", totale=" + totale + "]";
	}

	
}
