
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolver
{
	private ArrayList <String> expressionList;
	private ArrayList <String> originalList;
        private String ans; 
	public ExpressionSolver(String s)
	{
	    expressionList = new ArrayList<String>(Arrays.asList(s.split(" ")));
	    originalList = new ArrayList<String>(Arrays.asList(s.split(" ")));
	}

	public void setExpression(String s)
	{
	    expressionList = new ArrayList(Arrays.asList(s.split(" ")));
	    originalList = new ArrayList(Arrays.asList(s.split(" ")));
	}

	public void solveExpression()
	{
	    while(expressionList.size()>1){
	      for(int i = 0; i<expressionList.size(); i++){
	         if(expressionList.get(i).equals("/")){
	           int num1 = parseInt(expressionList.get(i-1), 10); 
	           int num2 = parseInt(expressionList.get(i+1), 10);
	           int ans = num1 / num2;
	           expressionList.remove(i+1);
	           expressionList.remove(i);
	           expressionList.remove(i-1);
	           String ans1 = ""+ans;
	           expressionList.add(i-1,ans1);
	           i--;
	           }
	         if(expressionList.get(i).equals("*")){
	           int num1 = parseInt(expressionList.get(i-1), 10); 
	           int num2 = parseInt(expressionList.get(i+1), 10);
	           int ans = num1 * num2;
	           expressionList.remove(i+1);
	           expressionList.remove(i);
	           expressionList.remove(i-1);
	           String ans1 = ""+ans;
	           expressionList.add(i-1,ans1);
	           i--;
	           }
	          
	       }
	        for(int i = 0; i<expressionList.size(); i++){
	            if(expressionList.get(i).equals("+")){
	           int num1 = parseInt(expressionList.get(i-1), 10); 
	           int num2 = parseInt(expressionList.get(i+1), 10);
	           int ans = num1 + num2;
	           expressionList.remove(i+1);
	           expressionList.remove(i);
	           expressionList.remove(i-1);
	           String ans1 = ""+ans;
	           expressionList.add(i-1,ans1);
	           i--;
	          }
	          if(expressionList.get(i).equals("-")){
	           int num1 = parseInt(expressionList.get(i-1), 10); 
	           int num2 = parseInt(expressionList.get(i+1), 10);
	           int ans = num1 - num2;
	           expressionList.remove(i+1);
	           expressionList.remove(i);
	           expressionList.remove(i-1);
	           String ans1 = ""+ans;
	           expressionList.add(i-1,ans1);
	           i--;
	           }
	           }
	        
	  }
	  ans = "";  
	  for(int i = 0; i<originalList.size(); i++)
	     ans += originalList.get(i)+" ";
	}

	public String toString( )
	{
	  return ans+"= "+expressionList.get(0);
	}
}
