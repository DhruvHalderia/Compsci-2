
import java.util.Arrays;
public class FunHouse2
{
   public static void main(String[] args){
     int[] arrayOne = {1,2,3,4,5,6,7,8,9,10};
     int[] arrayTwo = {1,2,3,9,11,20,30};
     int[] arrayThree = {9,8,7,6,5,4,3,2,0,-2};
     int[] arrayFour = {3,6,9,12,15,18,21,23,19,17,15,13,11,10,9,6,3,2,1,0};
     System.out.println(Arrays.toString(arrayOne));
     System.out.println("is going up ? "+goingUp(arrayOne));
     System.out.println(Arrays.toString(arrayTwo));
     System.out.println("is going up ? "+goingUp(arrayTwo));
     System.out.println(Arrays.toString(arrayThree));
     System.out.println("is going up ? "+goingUp(arrayThree));
     System.out.println(Arrays.toString(arrayFour));
     System.out.println("is going up ? "+goingUp(arrayFour));
     System.out.println();     
     System.out.println(Arrays.toString(arrayOne));
     System.out.println("is going down ? "+goingDown(arrayOne));
     System.out.println(Arrays.toString(arrayTwo));
     System.out.println("is going down ? "+goingDown(arrayTwo));
     System.out.println(Arrays.toString(arrayThree));
     System.out.println("is going down ? "+goingDown(arrayThree));
     System.out.println(Arrays.toString(arrayFour));
     System.out.println("is going down ? "+goingDown(arrayFour));
     System.out.println();
     System.out.println(Arrays.toString(arrayFour));
     System.out.println("first 7 values greater than 9 "+Arrays.toString(greaterThan(arrayFour,7,9)));     
     System.out.println("first 5 values greater than 15 "+Arrays.toString(greaterThan(arrayFour,5,15)));
    }
   public static boolean goingUp(int[] arr){  
     for(int x: arr){
       if (x<arr.length-1){
       if(arr[x]>arr[x+1])
        return false; 
        }
    }
    return true;
    }
   public static boolean goingDown(int[] arr){
     for(int i= 1;i<arr.length;i++){
       if (i<arr.length-1){
       if(arr[i-1]<arr[i])
        return false; 
        }
    }
    return true;
    }
   public static int[] greaterThan(int[] arr, int x, int y){
    int [] newArray = new int[x];
    int num = 0;
    for(int i = 0; i<arr.length; i++){
        if (num<x){
        if (arr[i]>y){
         newArray[num] = arr[i];
         num++;
        }
       }
    }
     return newArray;  
    }
}
