
import java.util.Arrays;

public class TheRace
{
	private int one;
	private int two;
	private int oneCount;
	private int twoCount;
	private int[] track;
	private int turn;
	private int winner;
	
	public TheRace()
	{
	    track = new int[18];
	    int randomNum = (int)(Math.random() * (17 - 0)) + 0;
	    one = randomNum;
	    int randomNum2 = (int)(Math.random() * (17 - 0)) + 0;
	    two = randomNum2;
	   if (one==two)
	     two++;
	   if(one>17){
	     one-=18;
	     oneCount++;
	       }
	    if(two>17){
	     two-=18;
	     twoCount++;
	   }
	   track [one] = 1;
	   track [two] = 2;
	   oneCount = 0; 
	   twoCount = 0;
	   turn = 1; 
	   winner=0; 
	}
	
	public boolean turn()
	{
	   boolean ans = true;
	   if (oneCount == 5)
	    winner = 1;
	    if (twoCount == 5)
	     winner = 2;
	   if(oneCount==5 || twoCount==5)
	     return false;
	    
	     
	    
	    
	   if (turn==1){
	     track [one] = 0;  
	     one +=(int)(Math.random()*6)+1;
	   if(one>17){ 
	    one =0; 
	    oneCount++;
	   }
	       if (one==two){ 
	     two++;
	     track [two] = 2;
	   }
	     track [one] = 1;
	     turn++;
          } 
	   if(turn == 2)
        {
            track[two] = 0;
            two += (int)(Math.random()*6)+1;
            if(two > 17)
            {
                two = 0;
                twoCount++;
            }
            if(two == one)
            {
                one = 0;
                track[one] = 1;
            }
            if(two == 0 && one == 0)
                two = 1;
            track[two] = 2;
            turn--;
        }
	  
	   return ans;
	}
	
	public String getWinner()
	{
	  if(oneCount==5) return ""+winner; 
	  return ""+winner ;
  	} 
  	
  	public String toString()
  	{
  	 return Arrays.toString( track ) + " one count = " + oneCount + " twoCount = " + twoCount;
  	}
}
