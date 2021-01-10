

public class BoxWord
{
    public static void main(String[] args){
     System.out.println(boxWord("hippo"));   
     System.out.println(boxWord("abcd"));
     System.out.println(boxWord("it"));
     System.out.println(boxWord("a"));
     System.out.println(boxWord("chicken"));
    }
    
    public static String boxWord(String one){
    String answer = "";
    for(int i = 0; i< one.length(); i++)
     answer += one + "\n";
     return answer + "\n";
    }
}
