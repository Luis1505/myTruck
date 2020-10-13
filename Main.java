  import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the truck race!, will you Race or Spectate!");
    // intro to scanner 

    Scanner scan = new Scanner(System.in);
  
    System.out.println("1 for race. 0 for Spectate");
    int confirmation = scan.nextInt();// The if/else statement

    if (confirmation == 1){
    System.out.println("Have a nice race !"); 
    }else if(confirmation == 0 ){
    System.out.println("Have Fun Watching!");
   }

 }
}


  



    
  
