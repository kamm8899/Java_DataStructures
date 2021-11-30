
import java.util.*;
public class factorialNumber {
    //Write a program to find factorial of a number
    public static void main (String[] args){
        //intializing variables
        int fact = 1;
        int i=1;

        //creating object of Scanner class
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();

        //couting the factorial using while loop
        while(i <= num){
            fact = fact * i;
            i++;
        }
        System.out.println("\nFactorial of " + num + "is" + fact);
        sc.close();
    }
    
}
