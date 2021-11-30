import java.util.Scanner;
public class doReverse {
  
    public static void main (String[] args){
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        do{
            int remainder =  num%10;
            reversed = reversed * 10 + remainder;
            num /= 10;
            System.out.println("REverse order " + reversed);
        }
        while(num !=0);
        
        
        input.close();
}
        
    }

