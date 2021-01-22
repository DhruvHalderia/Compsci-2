
public class fancywords
{
  public static void main(String args[])
  {
    for(int i = 0; i<6;i++){
       String word = "";
       if (i == 0)
        word = "HELLO"; 
       if (i==1)
        word = "CAT";
       if (i==2)
        word = "A"; 
       if (i==3)
        word = "DOGHOUSE";
       if (i==4)
        word = "ONE";
       if (i==5)
        word = "IT";
       String[][] input = new String[word.length()][word.length()];
       getOutput(input,word);
    }
  }
  public static void getOutput(String mat[][],String word){
    if(word.length()==1){
     mat[0][0] = word;
    }
    else{
    for (int i = 0; i<word.length();i++){
      for(int k = 0; k<word.length();k++){
        mat[k][i]=" ";  
        }
    }
    for(int i = 0; i<2;i++){
      for (int k = 0; k<word.length();k++){
        if (i == 0)
         mat[k][i]= word.substring(k,k+1); 
        else 
         mat[k][word.length()-1] = word.substring(k,k+1); 
        }  
    }
    }
    if(word.length()>2){
      
      for(int i = 0; i<word.length();i++){
        mat[i][i] = word.substring(i,i+1); 
     }
     int t = 0;
     for(int i = word.length()-1;i>0;i--){
     mat[t][i] = word.substring(t,t+1);  
     t++;
      }
    }
    for(int i = 0; i<word.length();i++){
     for (int k = 0; k<word.length(); k++){
        System.out.print(mat[k][i]); 
        }
      System.out.println();
    }
    System.out.println("\n");
   }
}
