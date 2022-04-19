import java.util.Arrays;

public class Rad{
    int verdier[];
    int sum;
   
    public Rad(int[] verdier){
        this.verdier= new int[verdier.length];
        for(int indeks = 0; indeks < verdier.length; indeks++){
            this.verdier[indeks] =verdier[indeks];
        }

        this.sum = beregnSum(verdier);
    }
 
    public int beregnSum(int[] verdier){
        sum = 0;
        for(int i =0; i<verdier.length; i++){
            sum+= verdier[i];
        }
        //System.out.println("sumen er " + sum);
        return sum;
    }

    public void behandlerDataTilSum(){
        Arrays.sort(verdier);

        
        for(int i = 0 ; i < verdier.length; i++)
        {
            verdier[i] *= 2;
        }


        for(int i = 0 ; i < verdier.length; i++)
        {
            verdier[i] += 5;
        }


        for(int i = 0 ; i < verdier.length; i++)
        {
            verdier[i] -= 1;
        }


        for(int i = 0 ; i < verdier.length; i++)
        {
            verdier[i] /= 2;
        }

        for(int i = 0 ; i < verdier.length; i++)
        {
            verdier[i] += 8;
        }


        for(int i = 0 ; i < verdier.length; i++)
        {
            verdier[i] *= 3;
        }


        for(int i = 0 ; i < verdier.length; i++)
        {
            verdier[i] -= 1;
        }


        for(int i = 0 ; i < verdier.length; i++)
        {
            verdier[i] /= 3;
        }
    }
        
    
}