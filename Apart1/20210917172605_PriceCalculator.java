package pricecalculator;
//@Leonella Levy Martel
import java.util.Scanner; 
public class PriceCalculator {
    public static void main(String[] args) {
    //Create a new Scanner object  
    Scanner Bob= new Scanner(System.in); 
    System.out.print("Please enter the item price:");
    //Read price input by user
    double price = Bob.nextDouble();
    System.out.print("Please enter the discount ratio(5 for 5%):");
    //Read discount ratio input by user
    double discount = Bob.nextDouble();
        //Calculate the price before tax
        double price_without_tax = price * (1 -(discount / 100) );
        //Calculate the federal tax
        double federal_tax = price_without_tax*0.05;
        //Calculate the provincial tax
        double provincial_tax = price_without_tax*0.09975;
        //Calculate the final price
        double final_price = price_without_tax + federal_tax + provincial_tax;
    System.out.println("");
    //Output the original price
    System.out.printf("Original Price \t\t: %s %n",price);
    //Output the discount ratio
    System.out.printf("Discount ratio \t\t: %.2f%%\n",discount);
    //Output the prec before tax
    System.out.printf("Price Before Tax\t: %.2f \n",price_without_tax);
    System.out.println("------------------------------------");
    //Output the federal tax
    System.out.printf("Federal Tax \t\t: %.2f\n",federal_tax);
    //Output the provincial Tax
    System.out.printf("Provincial Tax \t\t: %.2f\n",provincial_tax);
    //Output the final price
    System.out.printf("Final Price \t\t: %.2f\n",final_price);
    }
}
   