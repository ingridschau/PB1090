import java.lang.Math;
public class HeadsOrTails {

    public static void main(String[] args) {

        int headsOrTails = 3;
        int heads = 0;
        int tails = 0;

        for (int i = 0; i < 2000000; i++) {

            headsOrTails = (int)(Math.random() * 2);
            
            if (headsOrTails == 0) {
                
                heads ++;

            } 
            else if (headsOrTails == 1) {
                tails ++;
            }
        }
        System.out.println("Number of heads: " + heads + "\nNumber of tails: " + tails);

    }
}