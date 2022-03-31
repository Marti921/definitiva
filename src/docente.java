     
public class Docente {
	
	// Variabili d'istanza
	private String nome;
	private String cognome;
	private Integer matricola;
	
	// Costruttore della classe
	public Docente(String nome, String cognome, Integer matricola) {
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
	}
	

	public String getNomeCognomeMatricola() {
	return this.nome + " " + this.cognome + " " + this.matricola;
	}
	

	public void stampaDocente() {
		System.out.println("Nome: " + nome);
		System.out.println("Cognome: " + cognome);
		System.out.println("Matricola: " + matricola);
	}
}