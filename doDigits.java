import java.util.Scanner;

public class doDigits {
    public static void main (String[] args){
        int num, digit, sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        num = input.nextInt();
        do{
            digit= num%10;
            sum= sum + digit;
            num/=10;
           
        }
        while(num >0);
        System.out.print("\n Sum of digits " + sum);
        
        input.close();
}
        
    }

