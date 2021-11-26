package balancecalculator;
import java.util.Scanner;
//@Leonella Levy Martel 
public class BalanceCalculator {
public static void main(String[] args) {
    //Create a new Scanner object  
    Scanner Bob= new Scanner(System.in); 
    System.out.print("Please enter the initial balance: $");
    //Read the balance input by user
    float balance = Bob.nextFloat();
    System.out.print("Please enter the annual interest rate (2 for 2%): ");
    //Read the annual interest rate input by user
    float InterestRate = Bob.nextFloat();       
    System.out.print("Please enter the number of years ");
    System.out.print("the client wants to save the money in the bank: ");
        //Read the years saving input by user
        int years = Bob.nextInt();
        //Calculate the balance after the saving years
        float interest = InterestRate / 100 + 1;
        double BalanceAfter_x_Years = balance * Math.pow(interest,years);
    System.out.println("");  
    //Output the initial balance
    System.out.printf("Initial Balance \t: %8.2f \n",balance);
    //Output the Annual Interest
    System.out.printf("Annual Interest Rate\t:%8.2f%%\n",InterestRate);
    //Output the saving years
    System.out.printf("Saving Years\t\t: %8d\n",years);
    System.out.println("---------------------------------");
    //Output the balance after the saving years
    System.out.print("Balance After " + years + " Years");
    System.out.printf("\t: %.2f\n",BalanceAfter_x_Years);
    }
}
