import java.util.Scanner;

public class reverseDigit {
    //Write a program to reverse the digits of a number
    public static void main(String[] args){
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        while(num !=0){
            int remainder =  num%10;
            reversed = reversed * 10 + remainder;
            num /= 10;

        }
        System.out.println("REverse order " + reversed);
        input.close();


    }
}
