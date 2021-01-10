
import java.util.ArrayList;
import java.util.Arrays;
public class FunHouseList
{
  public static void main(String[] args){
    ArrayList <Integer> listy = new ArrayList<Integer>(Arrays.asList(7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7)); 
    System.out.println(listy);
    System.out.println("sum of spots 3-6 = "+sumSpots(listy, 3, 6));
    System.out.println("sum of spots 2-9 = "+sumSpots(listy, 2, 9));
    System.out.println("# of 4s = "+count(listy, 4));
    System.out.println("# of 9s = "+count(listy, 9));
    System.out.println("# of 7s = "+count(listy, 7));
    System.out.println("new array with all 7s removed = "+(remove(listy, 7)));
    System.out.println("# of 7s = "+count(remove(listy,7), 7));
    System.out.println();
    listy = new ArrayList<Integer>(Arrays.asList(7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7)); 
    System.out.println(listy);
    System.out.println("sum of spots 3-16 = "+sumSpots(listy, 3, 16));
    System.out.println("sum of spots 2-9 = "+sumSpots(listy, 2, 9));
    System.out.println("# of 0s = "+count(listy, 0));
    System.out.println("# of 3s = "+count(listy, 3));
    System.out.println("# of 7s = "+count(listy, 7));
    System.out.println("new array with all 7s removed = "+(remove(listy, 7)));
    System.out.println("# of 7s = "+count(remove(listy,7), 7));
    } 
  public static int sumSpots(ArrayList <Integer> list, int spotOne, int spotTwo){
    int sum = 0;
    for(int i = spotOne; i<= spotTwo; i++){
     sum+=list.get(i);   
    }
     return sum; 
    }
  public static int count(ArrayList <Integer> list, int countNum){
   int count = 0; 
   for(int x : list){
    if(x == countNum)
     count++;
    }
   return count;
    }
  public static ArrayList <Integer> remove(ArrayList <Integer> list, int remove){
    for(int i = 0; i<list.size(); i++){
     if(list.get(i) == remove){
       list.remove(i);
       i--;
        }
    }
    return list;   
    }
}
