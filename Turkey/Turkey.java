

public class Turkey
{
    private String name;
    private double weight; 
    private int feathers; 
    
    public Turkey(){
       name = "na";
       weight =1.0;
       feathers =10000;
    }
    public Turkey(String na){
       name = na;
       weight = 1.0;
       feathers = 10000;        
    }
       public void setName(String na){
        name =na;    
    }
    public void setWeight(double w){
     weight = w;
    }
    public String getName(){
     return name;   
    }
    public double getWeight(){
     return weight;     
    }
    
    public String toString(){
     return getName()+" the turkey is "+getWeight()+" ounces\n";      
    }
}
