

public class ExpressionSolverRunner
{
   public static void main(String[] args){
    ExpressionSolver inputOne = new ExpressionSolver("3 + 5");
    inputOne.solveExpression();
    System.out.println(inputOne+"\n");
    
    inputOne.setExpression("3 * 5");
    inputOne.solveExpression();
    System.out.println(inputOne+"\n");
    
    inputOne.setExpression("3 - 5");
    inputOne.solveExpression();
    System.out.println(inputOne+"\n");
    
    inputOne.setExpression("3 / 5");
    inputOne.solveExpression();
    System.out.println(inputOne+"\n");
    
    inputOne.setExpression("5 / 5 * 2 + 8 / 2 + 5");
    inputOne.solveExpression();
    System.out.println(inputOne+"\n");
    
    inputOne.setExpression("5 * 5 + 2 / 2 - 8 + 5 * 5 - 2");
    inputOne.solveExpression();
    System.out.println(inputOne+"\n");
    }
}
