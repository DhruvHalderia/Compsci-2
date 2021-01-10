import java.util.ArrayList;
import java.util.Arrays;

public class oddEven
{
   public static void main(String[] args){
      ArrayList<Integer> listy = new ArrayList<Integer>(Arrays.asList(7,1,5,3,11,5,6,7,8,9,10,12345,11 ));
      System.out.println(oddEven(listy));
      listy = new ArrayList<Integer>(Arrays.asList(11,9,8,7,6,5,4,3,2,1,-99,7 ));
      System.out.println(oddEven(listy));
      listy = new ArrayList<Integer>(Arrays.asList(10,20,30,40,5,41,31,20,11,7));
      System.out.println(oddEven(listy));
      listy = new ArrayList<Integer>(Arrays.asList(32767,70,4,5,6,7));
      System.out.println(oddEven(listy));
      listy = new ArrayList<Integer>(Arrays.asList(2,7,11,21,5,7));
      System.out.println(oddEven(listy));
      listy = new ArrayList<Integer>(Arrays.asList(7,255,11,255,100,3,2));
      System.out.println(oddEven(listy));
      listy = new ArrayList<Integer>(Arrays.asList(9,11,11,11,7,1000,3));
      System.out.println(oddEven(listy));
      listy = new ArrayList<Integer>(Arrays.asList(7,7,7,11,2,7,7,11,11,2));
      System.out.println(oddEven(listy));
      listy = new ArrayList<Integer>(Arrays.asList(2,4,6,8,8));
      System.out.println(oddEven(listy));
  }
    public static int oddEven(ArrayList <Integer> list){   
     int oddOne = -1; 
     int odd = 0;
     int even = 0;
     int evenOne = list.size();
     int oddCheck = 0; 
     for(int i = 0; i < list.size() ; i++){
       if(list.get(i)%2>0)
        oddCheck++;
        }
     if(oddCheck == 0)
      return -1;
     for(int i = 0; odd <1 ; i++){
       oddOne++;
       if(list.get(i)%2>0)
        odd++;
        }
     for(int i = list.size()-1; even <1; i--){
         evenOne--;
         if(list.get(i)%2==0)
          even++;
        }
     if (oddOne>evenOne)
      return -1;
     return evenOne - oddOne;
  }
}
