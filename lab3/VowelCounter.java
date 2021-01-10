

public class VowelCounter
{
    public static void main(String[] args){
     System.out.println(changeVowels("abcdef"));   
     System.out.println(changeVowels("hhhhhhh"));
     System.out.println(changeVowels("aaaaaaa"));
     System.out.println(changeVowels("catpigdatrathogbogfrogmoosegeese"));
     System.out.println(changeVowels("hhhhhhh1234356HHHHDH"));
     System.out.println(changeVowels("AEIOUaeiou87878alkjdaslwlejrlajflawjkflwj"));
     System.out.println("\n"+changeVowels("x"));
     System.out.println(changeVowels("e"));
    }
    
    public static String changeVowels(String one){
     String answer = "";
     String vowels = "aeiouAEIOU";
     int num = 0;
     int num2 =5;
     for(int i = 0; i< one.length(); i++){
         
         if (num>9)
          num = 0;
         for(int x = 0; x<vowels.length(); x++){
          if(one.substring(i,i+1).equals(vowels.substring(x,x+1))){
            answer = answer + num;  
            num++; 
            num2=4;
            }
                }
          if(num2==5){
           answer = answer +one.substring(i,i+1);
           
        }
        num2=5;
    }
      return answer;   
    }
}
