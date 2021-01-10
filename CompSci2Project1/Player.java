
public class Player
{
  private String name;
  private int wins,losses,betMoney;
  private Wallet wallet;
  public Player(){
    name = "NA"; 
    wins = 0; 
    losses = 0;
    betMoney = 0; 
    wallet = new Wallet();
    }  
  public Player(String Name, int totalMoney){
      wallet = new Wallet();
      name = Name;
      wallet.addMoney(totalMoney);
    }
  public void setName(String x){
     name = x;   
        }
  public String getName(){
      return name;  
    }
   public void setBet(int x, int y){
    wallet.addMoney(y+=x);      
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
  public Wallet getWallet(){
     return wallet;      
    }
  public String toString(){
      return name+" has "+wins+" wins and "+losses+" losses with "+wallet.getMoney()+" dollars"; 
    }
}
