import java.util.*;
import java.util.Arrays;
public class Hangman
{
  private String secretWord,hiddenWord,bodyParts;
  private String guessArr[], bodyPart[],secondArr[];
  private int guessNum, wrongNum, secondNum; 
  public Hangman(){
     secretWord = ""; 
     guessNum =0; 
     hiddenWord = "";
     bodyParts = "head";
     wrongNum = 0;
     secondNum = 1;
    }
  public Hangman(String sW){
     secretWord = sW; 
     for(int i = 0; i<secretWord.length();i++)
      hiddenWord += "?";
      hiddenWord = hiddenWord.substring(4);
     guessArr = new String[secretWord.length()+6];
     for(int i = 0; i<guessArr.length;i++)
      guessArr[i]= "";
     guessNum = 0;
     bodyParts = "rope";
     bodyPart = new String[]{"head","body","leftArm","rightArm","leftLeg","rightLeg"};
     wrongNum=0;
     secondNum = 1;
    } 
   public String guess(String plyrGuess){
       guessArr[guessNum]=plyrGuess;
       String oldWord = hiddenWord;
       guessNum++;
       for(int i = 0;i<hiddenWord.length();i++){
       if(secretWord.substring(i,i+1).equals(plyrGuess)){
          hiddenWord = hiddenWord.substring(0,i)+plyrGuess+hiddenWord.substring(i+1);
        }
        }
       if(oldWord.equals(hiddenWord)){
        bodyParts+=" "+bodyPart[wrongNum];
        wrongNum++;
        return "bad guess";
       }
       return "good guess";
    }
   public boolean gameOver(){
    if(bodyParts.equals("rope head body leftArm rightArm leftLeg rightLeg")) return true;  
    if(hiddenWord.equals(secretWord))return true;
     return false;  
    }
  public String getHint(){
     return hiddenWord; 
    }
  public String toString(){  
      if(guessNum>0){
      secondArr = new String[secondNum-1];
      for(int i = 0;i<secondArr.length;i++)
       secondArr[i] = guessArr[i];
    }
    else{
      secondArr = new String[secondNum];
      for(int i = 0;i<secondArr.length;i++)
       secondArr[i] = guessArr[i];
    }
    secondNum++;
    return Arrays.toString(secondArr)+"\ngallows = "+bodyParts+"\n"+hiddenWord+"\n";
    }
}
