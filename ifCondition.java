import java.until.*;

public class ifCondition {
    //Write a program to check if a candidate is eligble for voting or not

    public static void main(Strings[] args) {
        sc = new Scanner(System.in);
        System.out.println("Enter the age of person");
        user_age = sc.nextInt();
        System.out.println("The age of person is" + user_age);

        if(user_age >18){
            System.out.println("You are eligble to Vote");
        }
        else{

            System.out.println("You are not eligble to vote ");
        }
        
    }

}
