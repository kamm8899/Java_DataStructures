
import java.util.Scanner;

public class tenEven {
    //Write a program to print 10 even numbers and 10 odd numbers
    int oddNumber, a;
    Scanner sc= new Scanner(System.in);{
    
    oddNumber = sc.nextInt();
    a =1;
    System.out.print("Odd numbers: ");

    while(a<= oddNumber){
        System.out.print( a+ " ");
        a= a + 2;

    }
    sc.close();


}
}



