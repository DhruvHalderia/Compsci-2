

public class tictactoe
{
 public static void main(String args[]){
  String [][] mat = { {"X","X","X","O","O","X","X","O","O"}, {"O","X","O","O","X","O","X","O","X"}, {"O","X","O","X","X","O","X","O","O"}, {"O","X","X","O","X","O","X","O","O"},{"X","O","X","O","O","O","X","X","O"}  };   
  String [][] mat2 = new String[3][3];
  for(int i = 0 ; i<5;i++){
     int y = 0; 
     int x = 0;
     for (int k = 0;k<9; k++){
        if(k == 3){
         y = 1; 
         x = 0;
        }
        if(k== 6){
         y = 2;
         x = 0;
        }
        mat2[x][y] = mat[i][k];
        x++;
        }
     for(int t = 0; t<3; t++){
       for (int r = 0; r<3;r++){
         System.out.print(mat2[r][t]+" ");  
        }
        System.out.println();
        }
     System.out.println(determineWinner(mat2));
     System.out.println();
    }
    }
 public static String determineWinner(String input[][]){
     int countX = 0; 
     int countO = 0; 
     String ans = "";
     for(int i = 0; i<3; i++){
         if(input[0][i].equals("X") && input[1][i].equals("X") && input[2][i].equals("X")){
            countX++; 
            ans ="X wins horizontally!";
            } 
        }
     for(int i = 0; i<3; i++){
         if(input[i][0].equals("X") && input[i][1].equals("X") && input[i][2].equals("X")){
          countX++;
          ans = "X wins vertically!";
        }
    }
     if ((input[0][0].equals("X") && input[1][1].equals("X") && input[2][2].equals("X"))|| (input[2][0].equals("X") && input[1][1].equals("X") && input[0][2].equals("X"))){
         countX++;
         ans = "X wins diagonally! ";
        }
    for(int i = 0; i<3; i++){
         if(input[0][i].equals("O") && input[1][i].equals("O") && input[2][i].equals("O")){
            countO++; 
            ans ="O wins horizontally!";
            }
                }
     for(int i = 0; i<3; i++){
         if(input[i][0].equals("O") && input[i][1].equals("O") && input[i][2].equals("O")){
          countO++;
          ans = "O wins vertically!";
        }
    }
     if ((input[0][0].equals("O") && input[1][1].equals("O") && input[2][2].equals("O"))|| (input[2][0].equals("O") && input[1][1].equals("O") && input[0][2].equals("O"))){
         countO++;
         ans = "O wins diagonally! ";
        }
     if (countO == countX)
      ans = "cat's game - no winner!";
     return ans;
    }
}
