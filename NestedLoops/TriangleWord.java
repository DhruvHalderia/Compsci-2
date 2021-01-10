

public class TriangleWord
{
    public static void main(String[] args){
     System.out.println(getTriangle("WOW"));
     System.out.println(getTriangle("BEN"));
     System.out.println(getTriangle("SAMMY"));
     System.out.println(getTriangle("WILE"));
     System.out.println(getTriangle("APLUSCOMPSCI"));  
    }
    
    public static String getTriangle(String word){
      String answer = "";
      String wordTwo = word.substring(1);
      int wordNum =(word.length()+wordTwo.length())/2; 
      for(int i =0; i<wordNum; i++)
       answer+=" ";
      answer += word.substring(0,1)+"\n";
      for(int i = 0; i<word.length()-2;i++){
          for(int x =0; x<wordNum-(1+i);x++)
           answer+=" ";
          answer+=word.substring(i+1,i+2)+" ";
          for(int y = 0; y<(i*2);y++)
           answer+=" ";
          answer+=word.substring(i+1,i+2)+"\n";
        }      
      for(int i =word.length(); i>1;i--)
       answer+=word.substring(i-1,i);
      return answer+word+"\n";   
    }
}
