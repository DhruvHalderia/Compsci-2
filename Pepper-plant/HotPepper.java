
public class HotPepper
{
 // my variables for HotPepper class 
  private String pepperName;
 private String fruitColor;
 private int growthRate;
 private int maturityRate;
 private int maturity;
 private int fruitMaturity;
 private int fruitMaturityRate;
 private int waterLevel;
 private int nitroLevel;
 private int fruitNumber;
 private double height;
 private int quantity;
 
 public HotPepper(String pn, int gr, int mr, int fmr){
    // this constructor does instantiation for all the variables used in the program 
    pepperName = pn;
    growthRate = gr;
    maturityRate = mr;
    fruitMaturityRate = fmr;
    fruitColor = "no peppers yet";
    waterLevel = 5;
    nitroLevel = 5;
    fruitNumber = 0;
    height = 1.00;
    fruitMaturity = 0;
    maturity =0;
    quantity = 0;
  }
         public void setNitroLevel(int spn)
   {
     // set the nitro level for fertilizer (f)
       nitroLevel += spn;  
         }
   public void setWater(int sgr)
   {
      // set the water level for water (w)
       waterLevel += sgr;
    }
   public void setFruitNum(int smr)
   {
      //set the fruit number for pick (p) 
       fruitNumber = smr;
    }
   public void setFruitMaturity(int sfr)
   {
      // set fruit maturity for pick (p)     
       fruitMaturity = sfr;  
    }  
    public void setColor(String co)
   {
      // set fruit color for pick (p)
       fruitColor = co;
    }
   public String toString(){
       //return the data (d)
       return "Pepper name: "+pepperName+"\nGrowth rate is: "+growthRate+"\nMaturity rate is: "+maturityRate+"\nFruit maturity rate: "+fruitMaturityRate;  
       
    }
   public String getStatus()
   {
       // returns the status for the pepper dead or alive
       if (!(waterLevel<1 || nitroLevel<1 || waterLevel>10 || nitroLevel>10 || maturity >99))   
       return "\n\n"+pepperName+" Pepper \nPlant Maturity: "+maturity+ "\nFruit Maturity: "+fruitMaturity+ "\nHeight: "+height+"\nWater Level: "+waterLevel+"\nNitro Level: "+nitroLevel+"\nFruitNumber: "+fruitNumber+"\nFruit Color: "+fruitColor;
       else
       return "\n\nPlant is dead";
    }
   public void grow(){
    // grows the plant by the rates and decreases water and nitro levels 
    if (!(waterLevel<1 || nitroLevel<1 || waterLevel>10|| nitroLevel>10 || maturity >99)){  
    maturity+=maturityRate;
     waterLevel-=1;
     nitroLevel-=1;
     height+=growthRate;
    
    if(maturity>50)
      fruitMaturity+=fruitMaturityRate;
     if(fruitMaturity>0){
      double fruitsMade = Math.random() * (10 - 5)+5;
      fruitNumber += (int)fruitsMade;
    }
    if(fruitMaturity >= 1 && fruitMaturity <=3 )
     fruitColor = "Green";
     else if (fruitMaturity >= 4 && fruitMaturity <=6)
     fruitColor = "Yellow";
     else if (fruitMaturity >= 7 && fruitMaturity <=10)
     fruitColor = "Red";
    else if (fruitMaturity >= 11)
     fruitColor = "Rotted";
    }
        }
   public String pick(){
     // return the amount of peppers picked 
     quantity +=fruitNumber;
       if(fruitNumber == 0)      
     return "Picking no peppers yet, peppers quantity = "+quantity;
     else
      return "Picking "+fruitColor+" peppers, quantity = "+quantity; 
          }
}