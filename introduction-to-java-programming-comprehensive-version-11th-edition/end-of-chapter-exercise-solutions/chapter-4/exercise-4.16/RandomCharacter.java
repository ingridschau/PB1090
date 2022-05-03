import java.lang.Math;

public class RandomCharacter {

    
    public static void main(String[] args) {

        int max = 123; //123 is the unicode for lowercase 'z'
        int min = 97;  // 97 is unicode for lowercase 'a'

        int range = (max-min) + 1;
        int character = (int)(Math.random() * range) + min;
        char ch = (char)character;

        System.out.println(ch);
    }
}