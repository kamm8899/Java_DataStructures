public class Structure {
// write program to use all the data types and given arithmetic operatons 
    public static void main(String [] args){
        ///create Scanner class object
        Scanner in = new Scanner(System.in);

        //Input two numbers from user
        System.out.println("Enter first number");
        int num1 = in.nextInt();
        System.out.println("Enter second number: ");
        int num2= in.nextInt();

        //Perform artihmetic operations
        int sum = num1 + num2;
        int difference = num1 -num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int modulo = num1 % num2;
        
        --num1;
        ++num2;
    }
}
