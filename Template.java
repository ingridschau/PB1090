import java.util.Scanner;

//A simple template for most java programs

public class Template {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int variable = input.nextInt();
        
        System.out.println("Variable: " + variable);
        

        input.close();
  
    }
}