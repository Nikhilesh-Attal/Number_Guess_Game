import java.util.Scanner;
import java.util.Random;
public class Number_game{
    public static void main(String args[]){
        while(true){
        System.out.println("Enter 0 to exit the game");
        System.out.println("Enter 1 to continue play the game");
        Scanner no  = new Scanner(System.in);
        int x= no.nextInt();
        switch(x)
        {
            case 0: System.exit(0);
            break;
            case 1:
                Random rand_no = new Random();      //create instance of random number
                int gen_no = rand_no.nextInt(100);    //grntrating random number between 0 to 100
                //System.out.println(gen_no);
                System.out.println("Enter the number between 0 to 100");
                Scanner a = new Scanner(System.in);
                int user_no = a.nextInt();
                int diff;
                if(gen_no>user_no)
                    diff=gen_no - user_no;
                else
                    diff = user_no - gen_no;
                if(diff==0)
                    System.out.println("You won the round! Your guess is correct.");
                else if(diff>0 && diff<=10)
                    System.out.println("Good Luck! next time. Your answer is too close.");
                else if(diff>10 && diff<=20)
                    System.out.println("Good Luck! next time. Your answer is close.");
                else if(diff>20 && diff<=30)
                    System.out.println(" Good Luck next time. Your answer is high.");
                else
                    System.out.println(" Good Luck next time. Your answer is too high.");
            break;
        }
        }
    }
}