package numberconverter;
//@Leonella Levy Martel
import java.util.Scanner;
public class NumberConverter {
    public static void main(String[] args) {
    //Create a new Scanner object  
    Scanner Bob = new Scanner(System.in); 
    System.out.print("Please enter a 4-digits Octal number: ");
    //Read octal number input by user
    int OctalNumber1 = Bob.nextInt();
    //Convert octal number to decimal number
    int OctalNumber = OctalNumber1;
    int Decimal = 0;
    int p = 0;
        while(true){
            if(OctalNumber == 0)
        {
            break;
        }
            else
        {
            int temp = OctalNumber%10;
            Decimal += temp*Math.pow(8,p);
            OctalNumber = OctalNumber/10;
            p++;
        }
        }        
   System.out.println(""); 
   //Output the octal number
   System.out.printf("Octal Number\t:%5d%n",OctalNumber1);
   //Output the decimal number
   System.out.printf("Decimal Number\t:%5d%n",+Decimal);
    }
}

        
       