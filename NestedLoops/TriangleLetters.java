
public class TriangleLetters
{
    public static void main(String[] args){
     System.out.println(makeTri(3,"A"));   
     System.out.println(makeTri(7,"X"));
     System.out.println(makeTri(1,"R"));
     System.out.println(makeTri(5,"T"));
     System.out.println(makeTri(4,"W"));
    }
    
    public static String makeTri(int rows, String letter){
     String answer ="";
     
     for(int i=0; i<rows;i++){
         for(int j=0; j<=i;j++){
             answer+=letter;
             
            }
         answer+="\n";
        }
     
     
     
     return answer;
    }
}
