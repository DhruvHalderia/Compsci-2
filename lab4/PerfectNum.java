

public class PerfectNum
{
    public static void main(String[] args){
      System.out.println(perfectNum(496));    
      System.out.println(perfectNum(45));
      System.out.println(perfectNum(6));
      System.out.println(perfectNum(14));
      System.out.println(perfectNum(8128));
      System.out.println(perfectNum(1245));
      System.out.println(perfectNum(33));
      System.out.println(perfectNum(28));
      System.out.println(perfectNum(27));
      System.out.println(perfectNum(33550336));
    }
    
    public static String perfectNum(int num){
    String answer = "";
    int divisorsum = 0; 
    int x = 1;
    
    while(x < num){
     if(num%x == 0)
      divisorsum = divisorsum + x; 
     x++;
    }
    if(divisorsum==num)
     answer = num+ " is perfect";
     else
     answer = num+ " is not perfect";
    return answer+ "\n";
    }
}
