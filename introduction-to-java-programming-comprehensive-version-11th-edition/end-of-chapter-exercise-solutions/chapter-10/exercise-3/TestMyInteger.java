import java.util.Scanner;

public class TestMyInteger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        MyInteger myInteger1 = new MyInteger(123);

        MyInteger myInteger2 = new MyInteger(24);

        String str = "";

        if (myInteger1.isEven()) {
            str += "Even";
        } else if (myInteger1.isOdd()) {
            str += "Odd";
        } else if (myInteger1.isPrime()) {
            str += "Prime";
        }

        System.out.println("The first MyInteger test object " + myInteger1.getValue() + " is found to be " + str);

        String str2 = "";

        if (myInteger2.isEven()) {
            str2 += "Even";
        } else if (myInteger2.isOdd()) {
            str2 += "Odd";
        } else if (myInteger2.isPrime()) {
            str2 += "Prime";
        }

        System.out.println("The second MyInteger test object " + myInteger2.getValue() + " is found to be " + str2);

        System.out.println("Please enter an integer number to compare with test object one:");

        String str3 = "";

        int j = input.nextInt();

        if (myInteger1.equals(j)) {

            str3 += "equal";
        } else if (!myInteger1.equals(j)) {
            str3 += "not equal";
        }


        System.out.println("Integer " + j + " and test object one " + myInteger1.getValue() + " are found to be " + str3);

        char[] testArray = {1, 2, 3, 4, 5};

        System.out.println("The test array of numeric characters 1 2 3 4 5 "
                + "has an sum integer value of: " + parseInt(testArray));
        System.out.println("Enter a string to convert to an Integer: ");

        String testString = input.next();

        System.out.println("The test string 54321 is now the integer number " + parseInt(testString));

        input.close();
    }
}