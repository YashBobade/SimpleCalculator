import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
 
// Driver class
public class BasicCalculator {
    // main function
    public static void main(String[] args)
    {
		System.out.println("\t\t\tWelcome to world of Maths");
		System.out.println("\t\t\t=========================");
		System.out.println();
		System.out.println("Now start your calculation");
        // Stores two numbers
        double number1, number2;
 
        // Take input from the user
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("\t\t\tEnter the numbers:");
		System.out.println("\t\t\t==================");
 
        // Take the inputs
        number1 = scanner.nextDouble();
        number2 = scanner.nextDouble();
 
        System.out.println("\t\t\tEnter the operator (+,-,*,/):");
		System.out.println("\t\t\t=========================");
 
        char operation = scanner.next().charAt(0);
        double answer = 0;
 
        switch (operation) {
        // case to add two numbers
        case '+':
            answer = number1 + number2;
            break;
 
        // case to subtract two numbers
        case '-':
            answer = number1 - number2;
            break;
 
        // case to multiply two numbers
        case '*':
            answer = number1 * number2;
            break;
 
        // case to divide two numbers
        case '/':
            answer = number1 / number2;
            break;
 
        default:
            System.out.println("\t\t\tYou enter wrong input");
		System.out.println("\t\t\t======================");
        }
 
        System.out.println("\t\t\tThe final result is given below:");
        System.out.println();
 
        // print the final result
        System.out.println(number1 + " " + operation + " " + number2 + " = " + answer);
		System.out.println("\t\t\tThank You for using!");
    }
}