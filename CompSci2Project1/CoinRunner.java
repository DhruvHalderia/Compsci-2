import java.util.Scanner;
public class CoinRunner
{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String name;
    String play = "Y";
    String flip; 
    String headsOrTailsInput;
    int betAmount;
    System.out.print("What is your name? ");
    name = input.next();
    System.out.print("How much money is in your wallet? ");
    Player plyrOne = new Player(name, input.nextInt());
    System.out.println(plyrOne);
    while(play.equals("Y")){
      System.out.print("How much do you want to bet? ");
      betAmount = input.nextInt();
      System.out.print("Do you want to bet on head<H> or tails<T>? ");
      headsOrTailsInput = input.next();
      flip = getFlip();
      System.out.println("Coin flip is: "+flip);
      if(flip.equals(headsOrTailsInput)){
        System.out.println("You win");
        plyrOne.setWin(plyrOne.getWin()+1);
        plyrOne.getWallet().addMoney(betAmount);
        }
        else {
         System.out.println("You lose");
         plyrOne.setLoss(plyrOne.getLoss()+1);
         plyrOne.getWallet().addMoney(-1*betAmount);
        }
      System.out.println(plyrOne);  
      System.out.print("Do you want to play again <Y> or <N>? ");
      play = input.next();
    }
    System.out.println("Thank you for playing");
    }
    public static String getFlip(){
      String answer; 
      int num1 = ((int) (Math.random() * (10-1))+1);
      if (num1>5)
        answer = "H";
       else 
        answer = "T"; 
       return answer; 
    }
}
