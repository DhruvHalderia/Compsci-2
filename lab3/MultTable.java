

public class MultTable
{
   public static void main(String[] args){
       System.out.println(multiTable(5,5));
       System.out.println(multiTable(3,7));
       System.out.println(multiTable(1,6));
       System.out.println(multiTable(9,9));
       System.out.println(multiTable(7,8));      
    }
    public static String multiTable(int num1, int num2){
      String answer = "";   
      for(int i= 1; i<(num2+1); i++){
        answer = answer+(i+"\t"+(i*num1)+"\n");   
        }
        
        return "multiplication table for "+num1+"\n"+ answer+"\n";
    }
}
