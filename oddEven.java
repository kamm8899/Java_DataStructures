import java.util.Scanner;

public class oddEven {
    //write a program to check given number is even or odd
    public static void main(String [] args){
        int num;
       System.out.println("Enter a integer number: ");
       Scanner input = new Scanner(System.in);
       num = input.nextInt();
       if(num %2 ==0){
           System.out.println("The number is even");
       }
       else{
           System.out.println("The number is odd");
       }
       input.close();
    
}
}
