  import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the truck race!, will you Race or Spectate!");
    // intro to scanner and user input

    Scanner scan = new Scanner(System.in);
  
    System.out.println("1 for race. 0 for Spectate");
    int confirmation = scan.nextInt();// The if/else statement

    if (confirmation == 1){ // Then the color of the truck
    System.out.println("What color truck do you want?");
    System.out.println("We have 1-purple, 2-blue, 3-red and 4-green");
    int color = scan.nextInt();
      if (color == 2){
       System.out.println("You lose, You got 2nd place");

      }else if(color == 1){
         System.out.println("You Win! You got 1st place");
      }else if(color == 3){
          System.out.println("You lose, You came in dead last.");
      }else if(color == 4){
          System.out.println("You Lose,You came in 3rd place.");
        }  
    
    }else if(confirmation == 0 ){
    System.out.println("Have Fun Watching!");
    System.out.println("Would like food ? 1 for yes 2 for no.");
   }if(food == 1)
    

 }
}


  



    
  
