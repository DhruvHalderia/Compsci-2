
import java.util.Arrays;
public class ArrayPractice
{
   public static void main (String[] args){
     int[] shoeSize = new int[50];
     shoeSize[0] = 5; 
     shoeSize[2] = -7;
     System.out.println(Arrays.toString(shoeSize)); 
     
     int sum = 0;
     for(int i = 0; i<shoeSize.length; i++)
      sum+=shoeSize[i];
      
     System.out.println(sum);
     
     //for each loop
     sum =0;
     for (int x: shoeSize)
      sum+= x;
      System.out.println(sum);
    }
}
