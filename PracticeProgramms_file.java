import java.util.Scanner;

public class PracticeProgramms_file {

    // Method to calculate the square of a number
    public static int square(int number) {
        return number * number; // multiply the number by itself
    }

    public static void main(String[] args) {
        int num = 5;                           // store 5
        int result = square(num);              // call method → 25
        System.out.println("Square of " + num + " is " + result); // print result

        System.out.println("Hello, Gerva!");   // greeting message

        int age = 20;                          // store age
        if (age > 18) {                        // check condition
            System.out.println("You can vote!");
            System.out.println("This file is for Practing purpose");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int userAge = input.nextInt();
        System.out.println("You entered age: " + userAge);
        if (userAge >= 30) {
            System.out.println("You are nyokuru");
        } 
        else if (userAge <= 20) {
        System.out.println("You are young or A teen");
        }
        
        
        input.close();
    }
}
