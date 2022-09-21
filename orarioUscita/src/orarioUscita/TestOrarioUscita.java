package orarioUscita;

import java.util.Date;

public class TestOrarioUscita {

	public static void main(String[] args) {
		// creare oggetto Date e recuperare e calcolare determinate info
		
		int orarioUscita = 18;
		
		// creo l'istanza date
		Date date = new Date();
		
		
		//
		
//		PER TESTARE L'ORARIO PRIMA DELLE 9
		
//		date.setHours(8);
		

// 		PER TESTARE L'ORARIO DOPO LE 18
		
//		date.setHours(19);
		
		System.out.println(date);
		
		// se l'orario corrente...
		
		// è inferiore, quindi prima delle ore 9
		if(date.getHours() < 9) { 
			
			// messaggio 
			System.out.println("Dormi ancora un po', la lezione non è ancora iniziata");
			
			
		// altrimenti, se è dopo le 18	
		}else if(date.getHours() > orarioUscita) {

			// messaggio 
			System.out.println("Grande, la lezione è finita! Buon riposo");
			
		} else {
			
			// altrimenti, calcola i minuti mancanti da ora alla fine della lezione 
			
			int minutiMancanti = calcoloMinuti(date, orarioUscita);
			
			System.out.println("Mancano " + minutiMancanti + " minuti all'uscita");
		}
		
		
	}
	
	public static int calcoloMinuti(Date d, int uscita) {
		
		int oreMancanti = uscita - d.getHours();
		
		int minuti1 = 60 * oreMancanti;
		
		int minutiMancanti = minuti1 - d.getMinutes();
		
		return minutiMancanti;
		
	}

}
