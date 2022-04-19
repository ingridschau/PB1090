
public class oblig4_246748{
    public static void main(String[] args) {
        int radLengde = 8000;

        System.out.println("Antall datapunker totalt: " + radLengde +"*"+radLengde + " = "+ radLengde*radLengde);
        //tid_start:
        long startTidGenerering = System.nanoTime();
        Matrise matrise = new Matrise(radLengde);
        //tid_stopp:
        long sluttTidGenerering = System.nanoTime();
        //tid_totalt:
        long totalTidGenerering = (sluttTidGenerering - startTidGenerering)/(1000*1000);  //divide by 1000*1000 to get milliseconds.

        System.out.println("Generering av data: "+totalTidGenerering + "ms");
        System.out.println("Generering av data: "+totalTidGenerering/1000 + "sek");

        //Sekvensiell del:
        long startTidSekvensiell = System.nanoTime();
        //denne skal ta alle rader = [0-7999], dersom radLengde=8000:
        int maksSumSekvensiell = matrise.finnMaksSumAvRader(matrise.rader,0,radLengde);
        long sluttTimeSekvensiell = System.nanoTime();
        long totalTidSekvensiell = (sluttTimeSekvensiell - startTidSekvensiell)/(1000*1000);  //divide by 1000*1000 to get milliseconds.

        System.out.println("Sekvensiell algoritme tok: "+totalTidSekvensiell + "ms");
        System.out.println("Sekvensiell algoritme tok: "+totalTidSekvensiell/1000 + "sek");

        System.out.println("Maks sum av rad: "+maksSumSekvensiell);



        System.out.println("Oblig4 start");
        
        long startTidParallelt = System.nanoTime();

        int cores = Runtime.getRuntime().availableProcessors();
        int raderMaksSum[] = new int[cores];
        for(int traa = 0; traa<cores; traa++){
           ArbeiderTrad[] arbeidstad = new ArbeiderTrad[cores];
           Thread[] threads = new Thread[cores];
          
            arbeidstad[traa] = new ArbeiderTrad(traa, matrise);
            threads[traa] = new Thread(arbeidstad[traa]);
            threads[traa].start();
            try{ 
                
                
                threads[traa].join();
                
            }
            catch (InterruptedException ie){
                System.out.println(ie);
            }
           raderMaksSum[traa] = arbeidstad[traa].maksSumRad;
        }  
        System.out.println("høyeste sum er: " + finnBesteSumFraAlleTrader(raderMaksSum));
        long sluttTidParallelt = System.nanoTime();
        System.out.println("parallele tok " + (sluttTidParallelt-startTidParallelt)/(1000*1000) + " milisek");
        
        testResultatSekvensiellParallel(maksSumSekvensiell, finnBesteSumFraAlleTrader(raderMaksSum));

        
    }
    
    static public void testResultatSekvensiellParallel(int sekvensieltResultat, int paralleltResultat){
        if(sekvensieltResultat==paralleltResultat){
            System.out.println("Test OK");
        }
        else{
            System.out.println("Sekvensielt resultat er ikke det samme som parallelt resultat...");
        }
    }

    static int finnBesteSumFraAlleTrader(int[] raderMaksSum){
        int antThreads = 16;
        int bestsum = 0;
        for (int cor=0; cor<antThreads; cor++){
            if ( raderMaksSum[cor]> bestsum){
                bestsum = raderMaksSum[cor];
            }
        }
        return bestsum;
    }

}