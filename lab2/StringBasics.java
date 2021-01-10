

public class StringBasics
{
    public static void main(String[] args){
     String first1 = "hello";
     String last1 = "world";
     System.out.println("first :: "+first1);
     System.out.println("last :: "+last1);
     System.out.println("sum :: "+getAdder(first1,last1));
     
     System.out.println();
     System.out.println();
     
     String first2 = "jim";
     String last2 = "bob";
     System.out.println("first :: "+first2);
     System.out.println("last :: "+last2);
     System.out.println("sum :: "+getAdder(first2,last2));
     
     
     System.out.println();
     System.out.println();
     
     String first3 = "sally";
     String last3 = "sue";
     System.out.println("first :: "+first3);
     System.out.println("last :: "+last3);
     System.out.println("sum :: "+getAdder(first3,last3));
     
     
     System.out.println();
     System.out.println();
     
     String first4 = "computer";
     String last4 = "science";
     System.out.println("first :: "+first4);
     System.out.println("last :: "+last4);
     System.out.println("sum :: "+getAdder(first4,last4));
     
     
     System.out.println();
     System.out.println();
     
     String first5 = "uil";
     String last5 = "contests";
     System.out.println("first :: "+first5);
     System.out.println("last :: "+last5);
     System.out.println("sum :: "+getAdder(first5,last5));
    }
    
    public static String getAdder(String First, String Second){
     return (First+" "+Second);   
    }
    
}
