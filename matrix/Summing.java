

public class Summing
{
    public static void main(String args[] ){
    int [][] mat = { {1, 2, 3, 4, 5}, {6, 7, 8, 9, 0},{6, 7, 1, 2, 5}, {6, 7, 8, 9, 0}, {5, 4, 3, 2, 1} };
    System.out.println("Matrix values");
    for(int i = 0; i<mat.length;i++){
      for (int x = 0; x<mat.length;x++) 
       System.out.print(mat[i][x]+"  ");
      System.out.println("\n");
    }
    System.out.println("The sum of 2,2 is "+getSum(mat, 2,2)+".");
    System.out.println("The sum of 0,0 is "+getSum(mat, 0,0)+".");
    System.out.println("The sum of 4,3 is "+getSum(mat, 4,3)+".");
    System.out.println("The sum of 4,4 is "+getSum(mat, 4,4)+".");
    System.out.println("The sum of 2,4 is "+getSum(mat, 2,4)+".");
    System.out.println("The sum of 1,3 is "+getSum(mat, 1,3)+".");
}
  public static int getSum(int [][] mat1, int num1, int num2){
      int ans = 0 ;
      if (num1==0 && num2==0){
        ans+=mat1[num1][num2];
        ans+=mat1[num1][num2+1];
        ans+=mat1[num1+1][num2];
        ans+=mat1[num1+1][num2+1];
        return ans;
        }
      if (num1==4 && num2==4){
         ans+= mat1[num1][num2];
         ans+= mat1[num1][num2-1];
         ans+= mat1[num1-1][num2];
         ans+= mat1[num1-1][num2-1];
         return ans;
        }
      if (num1==4){
       ans+=mat1[num1][num2];
       ans+=mat1[num1][num2+1];
       ans+=mat1[num1][num2-1];
       ans+=mat1[num1-1][num2];
       ans+=mat1[num1-1][num2+1];
       ans+=mat1[num1-1][num2-1];
       return ans; 
        }
      if (num2==4){
         ans+=mat1[num1][num2];
         ans+=mat1[num1][num2-1];
         ans+=mat1[num1-1][num2];
         ans+=mat1[num1+1][num2];
         ans+=mat1[num1-1][num2-1];
         ans+=mat1[num1+1][num2-1];
         return ans; 
        }
       ans+=mat1[num1][num2];
       ans+=mat1[num1][num2+1];
       ans+=mat1[num1-1][num2];
       ans+=mat1[num1+1][num2];
       ans+=mat1[num1-1][num2+1];
       ans+=mat1[num1+1][num2+1];
       ans+=mat1[num1][num2-1];
       ans+=mat1[num1+1][num2-1];
       ans+=mat1[num1-1][num2-1];
      return ans;
    }
}
