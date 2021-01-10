
public class Transactions
{
    private int pointsEarned,pointsUsed;
    private String date; 
    private double bill;
    public Transactions (){
     pointsEarned = 0; 
     pointsUsed =0;
     date = "na";
     bill = 0;
    }
    public void addTransaction (double bi,int pU, String d){
     pointsEarned = (int)bi/10;
     pointsUsed = pU;
     date = d;
     bill = bi; 
    }
    public int getPointsEarned(){  
    return pointsEarned;   
    }
    public int getPointsUsed(){  
    return pointsUsed;   
    }
    public String toString(){
     return  String.format("%-15s $%-14.2f %-15d %-15d",date,bill, pointsUsed, pointsEarned);  
    }
}
