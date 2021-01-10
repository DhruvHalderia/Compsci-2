
public class coolNumber
{
  public static void main(String[] args){    
      System.out.println(countCoolNumbers(250));
      System.out.println(countCoolNumbers(1250));
      System.out.println(countCoolNumbers(2250));
      System.out.println(countCoolNumbers(5500));
      System.out.println(countCoolNumbers(9500));
      System.out.println(countCoolNumbers(23500));
      System.out.println(countCoolNumbers(32500));
    }
   public static boolean isCoolNum(int num){
     if((num%3)==(1) && (num%4 ==1) &&(num%5 == 1)&& (num%6 == 1)) 
         return true;
     return false;
    }
  public static String countCoolNumbers(int num){
     String answer = "";
     int answerNum = 0;    
     for(int i = 6; i<=num; i++){
       if(isCoolNum(i)==true){
        answerNum++;   
        }
        }
      answer = (answerNum+" cool numbers between 6 - "+num);
        return answer;
    }
}
