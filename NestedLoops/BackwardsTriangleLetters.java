

public class BackwardsTriangleLetters
{
  public static void main(String[] args){
      System.out.println(makeTri(3,"R"));
      System.out.println(makeTri(4,"B"));
      System.out.println(makeTri(5,"X"));
      System.out.println(makeTri(2,"E"));
      System.out.println(makeTri(1,"T"));
    }
  public static String makeTri(int rows, String letter){
     String answer ="";
     for(int i=rows; i>0;i--){
         for(int x =i; x<rows; x++)
          answer+=" ";
         for(int j=i; j>0;j--)
             answer+=letter;     
         answer+="\n";
        }
     return answer;
    }
}
