
public class Car
{
    private String carBrand;
    private int carMiles;
    private int carPrice;
    private boolean newOrUsed;
    
    public Car(){
         carBrand="NA";
         carMiles =0;
         carPrice =0;
         newOrUsed = true;
    }
    
    public Car(String t, int n, int p){
     carBrand =t;
     carMiles = n;
     carPrice = p; 
     if (carMiles >1000)
      newOrUsed = false;
      else
      newOrUsed = true; 
    }
    
    
    public void setCarBrand(String t){
     carBrand = t;    
    }
    public void setCarMiles(int n){
     carMiles =n ; 
     if (carMiles >1000)
      newOrUsed = false;
      else
      newOrUsed = true; 
    }
    public void setCarPrice(int p){
     carPrice = p;    
    }
    public String getCarBrand(){
      return carBrand;  
    }
    public int getCarMiles(){
      return carMiles;  
    }
    
    public int getCarPrice(){
      return carPrice;  
    }
    
    public String toString(){
      if(newOrUsed ==true)
       return carBrand + "\nMiles: "+carMiles+"\nPrice: $"+carPrice+"\nCondition: New\n";
      return carBrand + "\nMiles: "+carMiles+"\nPrice: $"+carPrice+"\nCondition: Used\n"; 
    }
}