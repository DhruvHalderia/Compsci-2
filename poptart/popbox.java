
import java.util.ArrayList;
public class popbox
{
   private String Flavor;
   private int num;
   private ArrayList<poptart>pop;
   public popbox(){
    Flavor = "na";
    num = 0;
    }
   public popbox(String Fl, int n){
    pop = new ArrayList<poptart>();
    Flavor = Fl;
    num = n;
    int number = (int)(Math.random() * (100 - 1)) + 1;
    for(int i = 0; i<num; i++){
     pop.add(new poptart(Flavor,number));  
    }
    }
   public void setFlavor (String Fl){
       Flavor = Fl;
    }
   public void setNum (int n){
       num = n;
    }
   public boolean getPoisoned(){
   
   for (int i =0; i<pop.size(); i++) 
    {
      int numb = pop.get(i).getPoison();
      if (numb == 56 )
       return true;
    }
       return false;
    }
   public String getFlavor(){
    return Flavor;
    }
   public int getNum(){ 
     return num;  
    }
   public String toString (){
    return "this is "+Flavor+" with "+num+" poptarts";
    }
}
