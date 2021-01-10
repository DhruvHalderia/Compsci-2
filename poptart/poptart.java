

public class poptart
{
   private String Flavor;
   private int poison;
   
   public poptart(){
    Flavor = "na";
    poison = 0;
    }
   public poptart(String Fl, int Fr){
    Flavor = Fl;
    poison = Fr;
    }
   public void setFlavor (String Fl){
       Flavor = Fl;
    }
   public void setPoison (int Fr){
       poison = Fr;
    }
   public String getFlavor(){
    return Flavor;
    }
   public int getPoison(){ 
     return poison;  
    }
   public String toString (){
    return "this is "+Flavor+" with "+poison+" = poison";
    }
}
