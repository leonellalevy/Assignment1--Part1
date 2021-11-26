package personalinfo;
import java.util.Scanner;
 //@Leonella Levy Martel
public class PersonalInfo {
    public static void main(String[] args){
    //Create a new Scanner object  
    Scanner Bob= new Scanner(System.in); 
        System.out.print("Please enter your name: ");
        //Read the name input by user
        String name = Bob.nextLine();
        System.out.print("Please enter your age: ");
        //Read the age input by user
        String age = Bob.nextLine();
        System.out.print("Please enter your gender: ");
        //Read the gender input by user
        String gender = Bob.nextLine();
        System.out.print("Please enter your department: ");
        //Read the department input by user
        String department = Bob.nextLine();
        System.out.print("Please enter the value of PI (3.1415926): ");
        //Read PI input by user
        Double PI = Bob.nextDouble();
    System.out.println("");
    //Output the name
    System.out.printf("Name \t\t: %s %n",name);
    //Output the age
    System.out.printf("Age \t\t: %s %n",age);
    //Output the gender
    System.out.printf("Gender \t\t: %s %n",gender);
    //Output the department
    System.out.printf("Department \t: %s %n",department);
    //Output PI
    System.out.printf("PI \t\t: %.2f %n", PI);
    }
}
