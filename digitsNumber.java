import java.util.Scanner;
public class digitsNumber {
    //Write a program to add the digits of a number

    public static void main(String[] args){
        int num, digit, sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        num = input.nextInt();

        while(num >0 ){
            //find the last digit of the given number
            digit = num % 10;

            //add last digit to the sum
            sum = sum + digit;

            //removes the last digit from the number

            num = num/10;

        }
        System.out.print("Sum of Digits: " + sum);
        input.close();

    }
}
