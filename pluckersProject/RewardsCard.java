

public class RewardsCard
{
   private String name; 
   private String accountNum;
   private int totalPoints,transNum; 
   private static int rewardNumber = 1;
   private Transactions transactions;
   private String[] trans; 
   public RewardsCard(){
       name ="na";
       totalPoints = 0;
       transNum = 0;
   }
   public RewardsCard(String na){
      name = na;
      accountNum = String.format("%07d", rewardNumber);
      rewardNumber++;
      transactions = new Transactions();
      trans = new String[10];
    }
    public void setTransactions(int pE, int pU,String ans){
        totalPoints += pE - pU;
        trans[transNum] = ans; 
        transNum++;
    }
    public void setName(String na){
     name = na;  
    }
   public Transactions getTransactions(){
     return transactions;  
    }
   public String toString(){
     String answer =String.format("%-15s %-15s %-13s %15s\n", "date", "total bill", "points used", "points earned");
      for(int i = 0; i<trans.length; i++) {
          if(trans[i]!=null)
           answer+=trans[i]+"\n";
        }
     return "This Plucker's card belongs to "+name+"\nAccount number is: "+accountNum+"\nTheir current rewards points are "+totalPoints+"\nTheir purchase history is:\n"+answer;     
    }
}
