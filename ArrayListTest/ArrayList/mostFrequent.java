import java.util.ArrayList;
import java.util.Arrays;
public class mostFrequent
{
  public static void main(String[] args){
  ArrayList <Integer> listy = new ArrayList<Integer>(Arrays.asList(-99,1,2,3,4,5,6,6,6,6,6,7,8,9,10,12345,5,5,5,5));
  System.out.println(frequent(listy));
  listy = new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99));
  System.out.println(frequent(listy));
  listy = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,10,10,40,30,20,10));
  System.out.println(frequent(listy));
  listy = new ArrayList<Integer>(Arrays.asList(32767));
  System.out.println(frequent(listy));
  listy = new ArrayList<Integer>(Arrays.asList(255,255));
  System.out.println(frequent(listy));
  listy = new ArrayList<Integer>(Arrays.asList(9,10,-88,100,-555,1000));
  System.out.println(frequent(listy));
  listy = new ArrayList<Integer>(Arrays.asList(10,10,10,11,456,10,10,2,2,2,2,2,2,2));
  System.out.println(frequent(listy));
  listy = new ArrayList<Integer>(Arrays.asList(-111,1,2,3,9,11,20,30));
  System.out.println(frequent(listy));
  listy = new ArrayList<Integer>(Arrays.asList(9,8,7,6,5,4,3,2,0,-2,-989));
  System.out.println(frequent(listy));
  listy = new ArrayList<Integer>(Arrays.asList(12,12,15,18,21,23,1000));
  System.out.println(frequent(listy));
  listy = new ArrayList<Integer>(Arrays.asList(250,19,17,15,13,13,13,13,11,10,9,6,3,2,1,1));
  System.out.println(frequent(listy));
  listy = new ArrayList<Integer>(Arrays.asList(9,10,-8,10000,-5000,1000));
  System.out.println(frequent(listy));
 }
 public static int frequent(ArrayList <Integer> list){
  int ans = 0;
  int counter = 0; 
  int ansCounter = 0; 
  for(int i = 0; i< list.size(); i++){
      for(int x = 0;  x< list.size(); x++){
     if(list.get(i).equals(list.get(x)))
      counter++;      
    }
    if(counter> ansCounter){
     ansCounter = counter; 
     ans = list.get(i);
    }
    counter = 0; 
    }
  return ans; 
    }
}
