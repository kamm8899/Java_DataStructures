import java.util.Scanner;
public class doFactorial {

    //Write a program to print 10 even numbers and 10 odd numbers
    public static void main (String[] args){
        int fact = 1;
        int i=1;
        //creating object of Scanner class
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        do{
            if(fact * i){
                System.out.println("\nFactorial of " + num + "is" + fact);
            
            }
            i++;
        }
        while(i <= num);
        sc.close();
}
        
}
    
