import java.util.Scanner;

public class doEven {
        //Write a program to print 10 even numbers and 10 odd numbers
        public static void main (String[] args){
        int num, a;
        a = 1;
        Scanner sc= new Scanner(System.in);{
        
            num = sc.nextInt();
            a =1;
            System.out.print("Numbers are:" + " ");
        do{
            a= a%2==1 && a%2==0){
            System.out.print( a+ " ");
            
            }
            a++;
        }
        while(a<=num);
        
    
        
        sc.close();
}
        }
    }