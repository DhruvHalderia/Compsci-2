import java.util.Arrays;
public class FunHouse1
{
  public static void main(String[] args){
    int[] arrayOne = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};  
    System.out.println(Arrays.toString(arrayOne));
    System.out.println("sum of spots 3-6 = "+sumSpots(arrayOne, 3, 6));
    System.out.println("sum of spots 2-9 = "+sumSpots(arrayOne, 2, 9));
    System.out.println("# of 4s = "+count(arrayOne, 4));
    System.out.println("# of 9s = "+count(arrayOne, 9));
    System.out.println("# of 7s = "+count(arrayOne, 7));
    System.out.println("new array with all 7s removed = "+Arrays.toString(remove(arrayOne, 7)));
    System.out.println("# of 7s = "+count(remove(arrayOne,7), 7));
    System.out.println();
    int[] arrayTwo = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7};  
    System.out.println(Arrays.toString(arrayTwo));
    System.out.println("sum of spots 3-16 = "+sumSpots(arrayTwo, 3, 16));
    System.out.println("sum of spots 2-9 = "+sumSpots(arrayTwo, 2, 9));
    System.out.println("# of 0s = "+count(arrayTwo, 0));
    System.out.println("# of 3s = "+count(arrayTwo, 3));
    System.out.println("# of 7s = "+count(arrayTwo, 7));
    System.out.println("new array with all 7s removed = "+Arrays.toString(remove(arrayTwo, 7)));
    System.out.println("# of 7s = "+count(remove(arrayTwo,7), 7));
    } 
  public static int sumSpots(int[] arr, int spotOne, int spotTwo){
    int sum = 0;
    for(int i = spotOne; i<= spotTwo; i++){
     sum+=arr[i];   
    }
     return sum; 
    }
  public static int count(int[] arr, int countNum){
   int count = 0; 
   for(int x : arr){
    if(x == countNum)
     count++;
    }
   return count;
    }
  public static int[] remove(int[] arr, int remove){
   int x = arr.length - count(arr, remove);
   int[] remover = new int[x];
   int num = 0;
   for(int i = 0; i<arr.length; i++){
    if(arr[i] != remove){
     remover[num] = arr[i]; 
     num++;
    }
    }
      
    return remover;     
    }
}
