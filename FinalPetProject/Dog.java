

public class Dog
{
  private boolean clean, trim;
  private String name;
  private int age;
  
  public Dog(String name1, int age1){
    name = name1;
    boolean clean = false; 
    boolean trim = false; 
    age = age1; 
}
  public String getName(){
      return name;
    }
  public void setName(String na){
   name = na;     
    }
  public void setReTrim(){
     trim = false; 
    }  
  public void setReClean(){
     clean = false; 
    }
  public void setTrim(){
     trim = true; 
    }
  public void setClean(){
     clean = true; 
    }
    
  public String toString(){
    if (trim == true && clean == true)
    return getName()+"        clean   trimmed";  
    if (trim == true)
     return getName()+"        dirty   trimmed";
    if (clean == true)
     return getName()+"        clean   untrimmed"; 
    return getName()+"        dirty   untrimmed";
    }
}
