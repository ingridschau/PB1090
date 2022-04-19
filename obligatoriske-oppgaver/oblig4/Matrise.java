import java.util.Random;



public class Matrise {
    Rad rader[];
    int maksSum;
    int maksSumRadNr;
  
  
   
    Matrise(int lengde){
        this.rader = fyllRaderRandomInt(lengde);

    }
   
    public Rad[] fyllRaderRandomInt(int lengde){
        this.rader = new Rad[lengde];

        Random random = new Random();

        for (int radnr =0; radnr<lengde; radnr++) {
            int[] verdi = new int[lengde];
            for(int i=0; i<lengde; i++){
                verdi[i] = random.nextInt(16);
            }
            rader[radnr] = new Rad(verdi);
        }

        return rader;

    }


    public void skrivutMatrise(){
        for(int i=0; i < rader.length; i++){
            for(int j=0; j < rader[i].verdier.length; j++){
                System.out.print(rader[i].verdier[j] + " ");
            }
            System.out.println();
        }
        
        
    }


    public int finnMaksSumAvRader(Rad rader[], int start, int stop){
        maksSum = 0;
        for(int i=start; i<stop; i++){
            rader[i].behandlerDataTilSum();

            if(maksSum<rader[i].sum){
                maksSum=rader[i].sum;
            }
        }
        return maksSum;
    }

}