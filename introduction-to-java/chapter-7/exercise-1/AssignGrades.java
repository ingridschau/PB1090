import java.util.Scanner;

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