

public class Farm
{
    private Turkey [] farm; 
    private int numbersTurkey;
    public Farm (){
     farm = new Turkey [20]; 
     numbersTurkey=0;
    }
    public void addTurkey(String name){
     farm [numbersTurkey]= new Turkey(name) ;
     numbersTurkey++;
    } 
    public void removeTurkey(int num){
       int x = 0;
       for(int i = num; i<=numbersTurkey; i++){
       farm[i] = farm[i+1];
      }
      farm[numbersTurkey]=null;
      numbersTurkey--; 
    }
    public Turkey getTurkeys(int index){
      return farm[index];  
    }
    public String toString(){
      String ans = "";
      for(int i = 0; i<numbersTurkey; i++){
        ans += i+" "+farm[i].toString();  
        }  
      return ans;   
    }
}
