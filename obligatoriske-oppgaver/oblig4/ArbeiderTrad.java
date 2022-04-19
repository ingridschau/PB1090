public class ArbeiderTrad implements Runnable {
    int antall;
    int start;
    int stop;
    int maksSumRad = 0;
    Matrise matrise;

    public ArbeiderTrad(int start, Matrise matrise){
        this.start=start;
        this.matrise=matrise;
    }

    public void run(){
        finnMaksSumRader(matrise.rader, start*500, 8000-1/16-start);
    }

    public int finnMaksSumRader(Rad[] rader, int start, int stop){
        for(int indeks = start; indeks<stop; indeks++){
            if(rader[indeks].sum>maksSumRad){
                maksSumRad=rader[indeks].sum;
            }
        }
        return maksSumRad;
    }

}
