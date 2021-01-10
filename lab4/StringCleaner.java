

public class StringCleaner
{
 public static void main(String[] args){
    System.out.println(stringRemover("xR-MxR-MHelloxR-M","R-M"));
    System.out.println(stringRemover("sxsssxssxsxssexssxsesss","xs")); 
    System.out.println(stringRemover("fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn","qwerty"));
    }
 public static String stringRemover(String one, String two){
    String answer = one;
    int num2 = two.length();
    int spot = 0;
    while(answer.indexOf(two)>=0){
        spot = answer.indexOf(two)-1;
        answer = (answer.substring(0,spot) +answer.substring(num2+spot+1));    
        
    }
    
    return one+ " - String to remove "+two+"\n"+ answer+"\n\n"; 
    }
}
