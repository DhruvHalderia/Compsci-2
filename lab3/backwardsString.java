

public class backwardsString
{
  public static void main(String[] args){
    System.out.println(backwards("Hello"));
    System.out.println(backwards("World"));
    System.out.println(backwards("JukeBox"));
    System.out.println(backwards("TCEA"));
    System.out.println(backwards("UIL"));
    }
    
  public static String backwards(String one){
    String word = "";
      for(int i = 0;i<=one.length()-1; i++){
       word =one.substring(i,i+1)+word;     
         
         
        }
     String answer =one.substring(0,1)+"\n"+one.substring(one.length()-1,one.length())+"\n"+word+"\n"+one+"\n";
     return answer+"\n";   
    }
}
