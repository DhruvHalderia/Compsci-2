
public class countLetters
{
    public static void main(String args[]){
     String values = "abc79x2"; 
     String[][] input = new String[20][20];
     for(int i = 0; i<20; i++){
         for (int k = 0; k<20;k++){
          int num = (int)(Math.random() * 7); 
          input[i][k] = values.substring(num,num+1); 
            }
        }
     for(int i = 0; i<20; i++){
         for (int k = 0; k<20;k++){
          System.out.print(input[k][i]+" ");  
            }
         System.out.println();
        }
     int most = 0;
     String mostLet = "";
     System.out.println();
     for(int i = 0; i<values.length()-1;i++){
        int val = getCount(values.substring(i,i+1),input);
        System.out.println(values.substring(i,i+1)+" count is "+val);
        if(val > most){
         most= val;
         mostLet = values.substring(i,i+1);
        }
        }
     System.out.println("\n"+mostLet+" occurs the most.");
     
    }
    public static int getCount(String val, String[][] input){
      int count =0 ;
      for(int i = 0; i<20; i++){
       for(int k = 0; k<20; k++){
        if (input[i][k].equals(val)){
          count ++;   
        }
        }
        }
       return count; 
    }
}
