

public class Wallet
{
    private int totalMoney;
    
    public Wallet(){
     totalMoney = 0;
    }
    
    public void addMoney(int x){
        totalMoney+= x;    
    }
    
    public int getMoney(){
       return totalMoney; 
    }
}
