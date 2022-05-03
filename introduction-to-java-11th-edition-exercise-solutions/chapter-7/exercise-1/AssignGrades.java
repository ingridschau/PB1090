import java.util.Scanner;

/*
  Write a program that reads student scores, gets the best score, and then
  assigns grades based on the following scheme:
  Grade is A if score is >= best - 10
  Grade is B if score is >= best - 20
  Grade is C if score is >= best - 30
  Grade is D if score is >= best - 40
  Grade is F otherwise
  The program prompts the user to enter the total number of students, then
  prompts the user to enter all of the scores, and concludes by displaying
  the grades.
*/

class AssignGrades {
    public static void main(String[] args) {

        int best = 0;

        Scanner input = new Scanner(system.in);

        System.out.println("Please enter the number of students: ");

        int amount = input.nextInt();

        int[] students = new int[amount];

        System.out.println("Enter the grades of the students:");

        for (int i = 0; i < amount; i++){
            
            students[i] = input.nextInt();
        }

        for (int i = 1; i < amount; i++){
            if (students[i] > students[i-1]){
                best = students[i];
            }
        }
        int uui = 0;
        for (i = 0; i <= amount; i++ ){

            

            System.out.print("Student " + i + "score is " + students[i] + "and grade is ");

            if (students[i] >= best - 5){
                System.out.println("A");
            }
            if (students[i] >= best - 10){
                System.out.println("B");
            }
            if (students[i] >= best - 15){
                System.out.println("C");
            }
            if (students[i] >= best - 20){
                System.out.println("D");
            }
            else {
                System.out.println("F");
            }

        }


    }
}