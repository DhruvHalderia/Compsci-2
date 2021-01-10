

public class GamePlayer
{
   private String name;
   private int gamePlayed;
   private static int highScore =0; 
   private static String hiScoreName = "na";
   private static int totalPlayers =0;
   public GamePlayer(){
     name = "bob"; 
     gamePlayed =0;
     totalPlayers++;
   }
   
   public void setName(String na ){
      name =na; 
    }
   public void setHiScore(int hs){
      highScore =hs; 
    } 
   public String getName(){
     return name;   
    }
    
    
}
