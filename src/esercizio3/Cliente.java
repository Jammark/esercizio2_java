package esercizio3;

import java.util.Date;

public class Cliente {
	
	private String codice, email, nome, cognome;
	private Date iscrizione;
	
	public Cliente(String codice, String email, String nome, String cognome, Date iscrizione) {
		this.codice = codice;
		this.email = email;
		this.nome = nome;
		this.cognome = cognome;
		this.iscrizione = iscrizione;
		
	}

}
