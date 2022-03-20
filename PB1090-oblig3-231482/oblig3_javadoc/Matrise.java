import java.io.File; 
import java.io.FileNotFoundException;  
import java.util.*;
//import jdk.javadoc.internal.doclets.toolkit.taglets.SummaryTaglet;


class Matrise {

    Rad rader[] = new Rad[8];
    int maksSum;
    int maksSumRadNr;

    /** genererer matrisen
     * @param   
     * @return       
     */

    public Matrise(String filnavn) {
		fyllRaderFraFil(filnavn);
		maksSum = finnMaksSumAvRader();
		skrivUtMatrise();
    }

    /** skriver ut matrisen ved å skrive ut alle verdiene i de to arrayene, rader og verdier(kolonner)
     * @param  none
     * @return none
     */

    public void skrivUtMatrise() {
		System.out.println("Matrisen: \n");
			for (int i=0; i<rader.length; i++) {
		    	for (int j=0; j<rader[i].verdier.length; j++) {
		           	System.out.print(rader[i].verdier[j] + " ");
		       	}
		        System.out.println("");
            }
    }

    /** fyller radene opp med tallene i matrisen i filen
     * @param  Hvilken parameter tar den i signaturen 
     * @return      Hvilken verdi blir returnert dersom metoden har en retur type 
     */

    public void fyllRaderFraFil(String filnavn) {

            File testdata = new File(filnavn);
            if (!testdata.exists()){
				System.out.println("Filen finnes ikke.");
			    System.exit(1);
    		}

            try(Scanner scanner = new Scanner(testdata);){

            	int[] temp = new int[8];
            	int radTeller = 0; // teller for plasser i rader array
            	int teller = 0; // teller for plasser i "temp" array

            	while (scanner.hasNext()) {
					if(teller < 8){
						temp[teller] = scanner.nextInt();
						teller++;
					}
					if(teller==8){
						rader[radTeller] = new Rad(temp);
						radTeller++;
						teller = 0;
					}

	        	}
			}
	        catch (Exception ex) {
            	System.out.println("Feilmelding");
            	ex.printStackTrace();
        	}

    }

    

     /** metoden finner maks sum av rader ved å iterere gjennom hver rad sin sum og sjekke om den er større enn den største funnet
     * @param  none
     * @return summen av raden med høyest sum 
     */

    public int finnMaksSumAvRader() {
		int sum = 0;

		for (int i=0; i<rader.length; i++) {
			if(rader[i].sum > sum){
				sum = rader[i].sum;
				maksSumRadNr = i;
            }
    	}

        return sum;
    }


}