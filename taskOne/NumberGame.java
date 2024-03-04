import java.util.Random;
import java.util.Scanner;
public class NumberGame{
     int count;
     int rnum; 

     public void start(){
         Random random = new Random();
         rnum = random.nextInt(1,100);
         count = 0;
         guess();    
     }
     public void guess(){
          System.out.println("Guess the number");
          int userinput = new Scanner(System.in).nextInt();
          if(rnum == userinput){
               System.out.println("Congratulations! Your guess is correct.");
               System.out.println("You get correct guess in " + count+ " attempts.");
          }else{
                    if(userinput > rnum){
                         System.out.println("Your guess is too high!!");
                    }else{
                         System.out.println("Your guess is too low!!");
                    }
                    count++;
                    guess();

          }
     }
      
     public void restart(){
          start();
     }
     public static void main(String[] args){
     

          NumberGame ng = new NumberGame();
          System.out.println("1.Start\n2.Restart\n3.Exit");

               System.out.println("Enter your choice:");
               int choice = new Scanner(System.in).nextInt();
               switch(choice){
                    case 1:
                     ng.start();
                     break;
     
                    case 2:
                    ng.restart();
                    break;
                    
                    case 3:
                    System.exit(0);
                    break;
     
                    default:
                    System.out.println("Invalid choice");
               }
         


     
     }

}