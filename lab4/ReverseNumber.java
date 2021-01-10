
public class ReverseNumber
{
 public static void main(String[] args){
  System.out.println(234+" reversed is "+reverse(234)+"\n");   
  System.out.println(10000+" reversed is "+reverse(10000)+"\n");
  System.out.println(111+" reversed is "+reverse(111)+"\n");
  System.out.println(9005+" reversed is "+reverse(9005)+"\n");
  System.out.println(84645+" reversed is "+reverse(84645)+"\n");
  System.out.println(8547+" reversed is "+reverse(8547)+"\n");
  System.out.println(123456789+" reversed is "+reverse(123456789)+"\n");
    }
    
 public static int reverse(int num){
    int ans = 0;
    while(num>0){
     ans = ans*10+num%10;
     num = num/10;
        
    }
   return ans;     
    }
}
