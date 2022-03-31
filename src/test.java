import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test{

    	    @SuppressWarnings("null")
			public static void main(String[] args) {
			int i=0;
			List <String> nome = new ArrayList<>();
			List <String> cognome = new ArrayList<>();
			List <Integer> matricola = new ArrayList<>();
			String n;
			String c;
			Integer m;
			Docente mioDocente [] = {null, null, null};
			
			while (i<3) {
				Scanner input = new Scanner(System.in);
				System.out.println("Inserisci il nome del docente: ");
				n = input.next();
				nome.add(n);
				System.out.println("Inserisci il cognome del docente: ");
				c = input.next();
				cognome.add(c);
				System.out.println("Inserisci la matricola del docente: ");
				m = input.nextInt();
				matricola.add(m);
				mioDocente[i] = new Docente(n, c, m);
				i++;
				}
			
			i=0;
			while (i<3) {
				mioDocente[i].stampaDocente();
			i++;
			}
			
			
    	    
			int j=0;
			List <String> dnome = new ArrayList<>();
			List <String> dcognome = new ArrayList<>();
			String nd;
			String cd;
			Discente mioDiscente [] = {null, null};
			
			while (j<3) {
				Scanner input = new Scanner(System.in);
				System.out.println("Inserisci il nome del discente: ");
				nd = input.next();
				dnome.add(nd);
				System.out.println("Inserisci il cognome del discente: ");
				cd = input.next();
				dcognome.add(cd);
				mioDiscente[j] = new Discente(nd, cd);
				j++;
				}
			
			j=0;
			while (j<3) {
				mioDiscente[j].stampaDiscente();
			j++;
			}
			
		}
}
    	    
    	    
    	    
    	    
    	    
    