
public class StringPractice
{
   public static void main(String[] args){
     String name = "Dhruv Halderia";
     String name2 = new String("Dhruv Halderia");
     
     System.out.println(name.substring(0,4)); //dhru
     System.out.println(name.substring(4));  //v halderia
     
     System.out.println(name.indexOf("B"));  //-1
     System.out.println(name.indexOf("a"));  // 7 
     System.out.println(name.indexOf("b"));  //-1
     
     System.out.println(name.length());      // 14
     System.out.println(name.substring(name.length()-1));  //a
     
     
     String name3 = "Ghruv Halderia";
     System.out.println(name.compareTo(name3));   //-3 in ascii code
     System.out.println(name3.compareTo(name));   // 3 
     System.out.println(name.compareTo(name2));   // 0
     
     name3 = "Dhruv Halderia";
     System.out.println(name.equals(name2)); //true
     System.out.println(name.equals(name3)); //true
     
     System.out.println(name==name2);  //false
     System.out.println(name==name3);  //true
     
     
    }
     
    public static String getInitials(String name){
        int space =name.indexOf(" ");
        return name.substring(0,1)+name.substring(space+1, space + 2);  
    }
    
         public static int getCompareTo(String first, String second){
        return first.compareTo(second);
    }
}
