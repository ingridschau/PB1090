import java.util.*;

class PerfectSquare {
    public int m;

    public static int findN(int m) {
        int counter = 0;
        int n;
        int[] factors = new int [5];
        int[] oddFactors;
        int g = 0;

        for (int h = 1; h < 5; h++) {
            if (m % h == 0) {
                factors[g] = h;
                g++;
            }
        }
        
        for (int i : factors) {
            for (int j : factors) {

                if (factors[i] == factors[j]) {
                    counter = counter + 1;
                }

                if (counter % 2 != 0) {
                    for (int k = 0; k < factors.length; k++) {
                        oddFactors[k] = factors [i];
                    }
                }
            }
        }

        return n;
    }


}