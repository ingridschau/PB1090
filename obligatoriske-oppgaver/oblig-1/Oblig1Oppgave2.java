import java.util.*;

public class Oblig1Oppgave2 {
    public static void main(String[] args) {

        System.out.println("Hvor stor skal matrisen være?");

        //lagrer ønsket verdi på matrisen 
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        //lager matrisen
        Double[][] matrix = new Double[n][n];
        
        //gir tilfeldige verdier til matrisen ved math.random funksjonen
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                matrix [i][j] = Math.random() * 1000;
            }
        }

        //lager et object location for å hente metodene fra klassen
        Location location = new Location();

        location.printMatrix(matrix);

        location.locateLargestElement(matrix);


        input.close();
    }
}

class Location {
    int radNr; 
    int kolonneNr;
    double maksVerdi;
    int maksRadNr;
    int maksKolonneNr;

    //metode for å finne maksverdien ved å iterere gjennom alle elementene og lagre makverdi samt lokasjon
    //printer også, siden det skulle være en void metode
    public void locateLargestElement(Double[][] matrix) {
        maksVerdi = matrix[0][0];
        for (radNr = 0; radNr < matrix.length; radNr++){
            for (kolonneNr = 0; kolonneNr < matrix[radNr].length; kolonneNr++){
                if (matrix[radNr][kolonneNr] > maksVerdi) {
                    maksVerdi = matrix[radNr][kolonneNr];
                    maksRadNr = radNr;
                    maksKolonneNr = kolonneNr;
                }
            }
        }
        System.out.println("\nMaksverdien i matrisen er " + maksVerdi + " med posisjon [" + maksRadNr + "][" + kolonneNr + "]");
    }
    //metode som printer hele matrisen, rad for rad
    public void printMatrix(Double[][] matrix) {
        for (radNr = 0; radNr < matrix.length; radNr++){
            for (kolonneNr = 0; kolonneNr < matrix[radNr].length; kolonneNr++){
                System.out.print( matrix[radNr][kolonneNr] + " ");
            }
            System.out.print("\n");
        }
    }
}