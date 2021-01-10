import java.util.Scanner;
public class EnergyRunner
{
    public static void main(String[] args ){
     Scanner kb = new Scanner(System.in);
     System.out.print("Enter gamertag: " );
     Player playerOne = new Player(kb.next());
     System.out.print("How many energy-levels do you have: " );
     playerOne.getEnergyLevels().addEnergyLevels(kb.nextInt()); 
     System.out.println(playerOne);
     String play ="Y";
     while(play.equals("Y") && playerOne.getEnergyLevels().getEnergyLevels()>0){
      int duel = getDuel(playerOne.getEnergyLevels().getEnergyLevels());     
      System.out.print("The enemy requires "+duel+" energy-levels to fight\nDo you want to fight them? <Y> or <N> ");    
      play = kb.next(); 
      if(play.equals("Y")){
        playerOne.getEnergyLevels().addEnergyLevels(-duel);
        if (playDuel()>=7){
         System.out.println("You Won");
         playerOne.setWin(playerOne.getWin()+1);
        }
        else{
         System.out.println("You Lost");
         playerOne.setLoss(playerOne.getLoss()+1);
        }
        System.out.print("Do you want to do a quest? <Y> or <N> ");
        String quest = kb.next();
        if(quest.equals("Y")){
          int questNum = (playDuel()/2);
          playerOne.getEnergyLevels().addEnergyLevels(questNum);
          System.out.println("You earned "+questNum+" energy-level back");
        }
       }
       System.out.println(playerOne);
      }
      System.out.print("Thanks for playing!");
    }
       
    
    public static int playDuel(){
        int num1 = ((int) (Math.random() * (11-2))+2);
        return num1;  
    }
    
    public static int getDuel(int x){
     int num1 = ((int) (Math.random() * ((x/2)-1))+1);   
     return num1;
    }
}
