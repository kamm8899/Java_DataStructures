

public class Fibonacci {
    public static void main(String[] args){
        //Write a program to generate 10 Fibonacci numbers
        int i =1, n=10, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series til " + n+ " terms");

        while( i <= n){
            System.out.print( firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

            i++;
        }

    }
}
