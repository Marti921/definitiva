
public class Discente {
		
		// Variabili d'istanza
		private String dnome;
		private String dcognome;
		
		
		// Costruttore della classe
		public Discente(String dnome, String dcognome) {
			this.dnome = dnome;
			this.dcognome = dcognome;
		
		}
		public String getNomeCognome() {
		return this.dnome + " " + this.dcognome;
		}
		

		public void stampaDiscente() {
			System.out.println("Nome: " + dnome);
			System.out.println("Cognome: " + dcognome);
		}
}
