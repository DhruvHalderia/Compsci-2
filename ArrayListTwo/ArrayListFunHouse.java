import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
	public static ArrayList<Integer> getListOfFactors(int number)
	{
	   ArrayList <Integer> listy = new ArrayList<Integer>();
	   for(int i = 2; i<number; i++){
	    if (number%i == 0){
	       listy.add(i); 
	       }
	   }
	   return listy;
	}
	
	public static void keepOnlyCompositeNumbers( List<Integer> nums )
	{  
	    int count = 0;
	    for(int i = 0; i<nums.size(); i++){
	      count = 0;
	     for(int x = 1; x <= nums.get(i); x++){
	       if(nums.get(i)%x==0){
	         count ++;  
	       }
	       }
	     if(count<3){
	      nums.remove(i);
	      i--;
	     }
	   }
	}
}