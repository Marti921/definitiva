     // Variabili d'istanza
public class docente {
	private String nome;
	private String cognome;
	private int matricola;
	
	// costruttore della classe
public docente(String nome, String cognome, int matricola) {
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
	}


	public String getNome() {
	return this.nome;
	}

	public String getCognome() {
	return this.cognome;
	}

	public int getMatricola() {
	return this.matricola;
	}

	public void stampaDocente() {
		System.out.println("Nome: " + nome);
		System.out.println("Cognome: " + cognome);
		System.out.println("Matricola: " + matricola);
	}

}