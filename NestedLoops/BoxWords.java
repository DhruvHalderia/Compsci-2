

public class BoxWords
{
 public static void main(String[] args){
  System.out.println(getBox("SQUARE"));
  System.out.println(getBox("BOX")); 
  System.out.println(getBox("A")); 
  System.out.println(getBox("IT")); 
  System.out.println(getBox("TOAD")); 
    }
 public static String getBox(String word){
  String answer = "";   
  if(word.length()==1) 
    return word+"\n";
  if(word.length()==2) {
   answer= word+"\n"; 
   for(int i = word.length();i>0;i--)
    answer+=word.substring(i-1,i);
   return answer+"\n";
    }
  answer = word+"\n";
  for(int i = 0; i<word.length()-2; i++){
     answer+= word.substring(i+1,i+2);
     for(int x = 0; x<word.length()-2; x++)
     answer+=" ";
     answer+=word.substring(word.length()-(i+2),word.length()-(i+1))+"\n"; 
    }
  for(int i = word.length();i>0;i--)
    answer+=word.substring(i-1,i);
  return answer+"\n";  
    }
}
