

public class Ripper
{
    public static void main(String[] args){
     String one = "chicken";
     System.out.println(getRipper(one,3,6)); 
     System.out.println(one);
     
     System.out.println();
     System.out.println();
     
     String two = "Alligator";
     System.out.println(getRipper(two,3,8)); 
     System.out.println(two);
     
     System.out.println();
     System.out.println();
     
     String three = "COMPUTER SCIENCE IS THE BEST!";
     System.out.println(getRipper(three,9,12));
     System.out.println(getRipper(three,0,12));
     System.out.println(getRipper(three,5,12));
     System.out.println(three);
     
     System.out.println();
     System.out.println();
     
     String four = "I like fried chicken and mashed potatoes!";
     System.out.println(getRipper(four,0,7));
     System.out.println(getRipper(four,7,15));
     System.out.println(getRipper(four,15,26));
     System.out.println(getRipper(four,22,26));
     System.out.println(four);
    }
    public static String getRipper(String word,int num1, int num2){
     return(word.substring(num1,num2));
    }
}
