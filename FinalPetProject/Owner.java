
import java.util.ArrayList;
public class Owner
{
   private String name, streetAddress, phone;
   private double bill; 
   private ArrayList<Dog> dog;
  
   public Owner(String Nam, String add,String phon ){
    dog = new ArrayList<Dog>();
    name = Nam;
    streetAddress =  add;
    phone = phon;
    bill = 0.0; 
   
    }
   public void addDog(String dNam, int age){
     dog.add(new Dog(dNam,age));
    }
   public double getBill(){
     return bill;  
    }
   public void addBill(int num){
       bill+=num;
    }
   public String getName(){
     return name;  
    }
   public void removeDog(int index){
     dog.remove(index);  
    }
   public String getDoggos (){
    String ans = "";
    for (int i =0; i<dog.size(); i++){
     ans+=i+"  "+dog.get(i).getName()+"\n";   
    }
    return ans;
    }
   public int getIndex(String na){
     int index = dog.indexOf(na);
     return index;  
    }
   public void unWashed(int index){
     dog.get(index).setReClean();   
    } 
   public void washed(int index){
     dog.get(index).setClean();   
    }
   public void unTrimmed(int index){
     dog.get(index).setReTrim();
    }
   public void trimmed(int index){
     dog.get(index).setTrim();
    }
   public String toString(int index){
     return dog.get(index).toString(); 
    }
}
