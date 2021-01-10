

public class Player
{
    private String name;
    private int wins,losses; 
    private EnergyLevels energyLevels;
    public Player(String Name){
     energyLevels = new EnergyLevels();
     name = Name; 
     wins = 0;
     losses = 0;
   }
   public void setName(String x){
     name = x;   
        }
   public String getName(){
      return name;  
    }
   public void setWin(int win){
        wins = win;
    }
   public void setLoss(int loss){
        losses = loss;
    }
    public int getWin(){
     return wins;   
    }
    public int getLoss(){
        return losses;
    }
    public EnergyLevels getEnergyLevels(){
     return energyLevels;   
    }
    public String toString(){
     return name+": "+wins+" wins, "+losses+" losses, "+energyLevels.getEnergyLevels()+" energy-levels";   
    }
}
