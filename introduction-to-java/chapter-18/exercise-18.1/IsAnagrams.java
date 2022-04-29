import java.util.*;
/*
(Identifying anagrams) Two words are anagrams of each other if they contain the
same letters that are arranged in different orders. Write a recursive method that
can identify if two given words are anagrams of each other. 
*/

public class IdentifyingAnagrams {

    public static boolean isAnagram(String a, String b) {
        return isAnagram(s, 0, s.length() - 1);
    }


    private static boolean isAnagram(String a, String b, int indexA) {
        // Removing white spaces from string 1
        String s1 = a.replaceAll("\\s", "");
        // Removing white spaces from string 2
        String s2 = b.replaceAll("\\s", "");
        boolean status = true;
        //checks the length of both the strings are equal or not
        if (s1.length() != s2.length())
            status = false;
        //executes if lengths of strings are equal
       
        else {
         
            //sorts the strings
            char[] s1Array = s1.toCharArray();
            char[] s2Array = s2.toCharArray();
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            
            if
            else {
                status = isAnagram(s1, s2, indexA + 1);
            }
        }

    }



/*
    public static void sort (double[] list) {
        sort(list, 0, list.length - 1);
    }

    private static void sort (double[] list, int low, int high) {
        if (low < high) {

            // Find the smallest number and its index in list 
            int minIndex = low;
            double min = list[low];
            for (int i = low + 1; i <= high; i++) {
                if (list[i] < min) {
                    min = list[i];
                    minIndex = i;
                }
            }
        }

        // Swap the smallest number with the first element
        list[minIndex] = list[low];
        list[low] = min;

        // Sort the remaining list [low + 1 ... high]
        sort(list, low + 1, high);
    }
    */
}