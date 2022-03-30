import java.util.Scanner;
public class test{
	

		public static void main(String[] args) {

			Scanner input = new Scanner(System.in);
			System.out.println("Inserisci il nome del docente: ");
			String nome = input.next();
			System.out.println("Inserisci il cognome del docente: ");
			String livello = input.next();
			System.out.println("Inserisci la matricola del docente: ");
			int stipendio = input.nextInt();
	
			private String nome;
			private String cognome;
			private Integer matricola;
			
			docente mioDocente = new docente(nome, cognome, matricola);
			mioDocente.stampaDocente();
			
	
	public void assegnaValoriAgliAttributi(String nomeDocente, String cognomeDocente, int matricolaDocente) {
			this.nome = nomeDocente;
			this.cognome = cognomeDocente;
			this.matricola= matricolaDocente;
	}
}
