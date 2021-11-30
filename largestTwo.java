import java.util.*;

public class largestTwo {
    // Write a program to find largest of two numbers
    private static Scanner sc;
    public static void main(String [] args){
        int num1, num2;
        sc= new Scanner(System.in);
        System.out.print("Please Enter the First Number: ");
        num1= sc.nextInt();
        System.out.print("Enter the Second Number: ");
        num2 = sc.nextInt();

        if (num1 > num2){
            System.out.print("\n The Largest Number is " + num1);
        }
        else if(num2 > num1){
            System.out.print("\n The Largest Number is " + num2);
        }
        else{
            System.out.print("The numbers are equal");
        }
    }

}
