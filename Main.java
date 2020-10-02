import java.util.Scanner;
import java.util.Random;
/**
 *number guessing game
 * @author  Tolga Nurtekin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
   //make a Scanner
   Scanner input = new Scanner(System.in);
   //create random number generator
   Random rand = new Random();

   //create a number number
   int randNum = rand.nextInt(100) + 1;

   //declare the guess variable
   int guess;
   //game loop
   do{
   //ask user for their guess
   System.out.println("Please guess a number between 1 and 100");
   guess = input.nextInt();
   //is it too high or too low
   if(guess > randNum){
    System.out.println("Too High"); 
   }else if(guess < randNum){
    System.out.println("Too Low");
     
   }
   }while(guess != randNum);
   //outside the loop means that the user won
   System.out.println("Congradulations! You Win");
  
  }
}
