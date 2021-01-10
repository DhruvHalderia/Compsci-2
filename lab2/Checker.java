

public class Checker
{
    public static void main(String[] args){
      String main1 = "chicken";
      System.out.println("looking for c "+getCheck(main1, "c")); 
      System.out.println("looking for ch "+getCheck(main1, "ch"));
      System.out.println("looking for x "+getCheck(main1, "x"));
      System.out.println(main1);
      
      System.out.println();
      System.out.println();
      
      String main2 = "alligator";
      System.out.println("looking for g "+getCheck(main2, "g")); 
      System.out.println("looking for all "+getCheck(main2, "all"));
      System.out.println("looking for gater "+getCheck(main2, "gater"));
      System.out.println(main2);
      
      System.out.println();
      System.out.println();
      
      String main3 = "COMPUTER SCIENCE IS THE BEST!";
      System.out.println("looking for U "+getCheck(main3, "U")); 
      System.out.println("looking for COMP SCI "+getCheck(main3, "COMP SCI"));
      System.out.println("looking for SCIENCE "+getCheck(main3, "SCIENCE"));
      System.out.println(main3);
    }
    
    public static boolean getCheck(String main, String search){
     int x = main.indexOf(search);
     if(x<0)
      return false;
      else 
      return true;
    }
}
