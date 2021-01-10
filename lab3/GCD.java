

public class GCD
{
    public static void main(String[] args){
     System.out.println(gcd(5,25));   
     System.out.println(gcd(4,400));
     System.out.println(gcd(8,80));
     System.out.println(gcd(15,45));
     System.out.println(gcd(6,66));
     System.out.println(gcd(9,9));
     System.out.println(gcd(3,543));
    }
    
    public static String gcd(int one, int two){
     String str ="";
     int gcd = 0;
     for(int i = 1; i<=one; i++){
        if(one%i==0 && two%i==0)
          gcd = i;
         }
     str ="the gcd of "+one+" and "+two+" is "+gcd+"\n";
        
      return str;  
    }
}
