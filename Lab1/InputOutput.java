
import java.util.Scanner;
public class InputOutput
{
 public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
    System.out.print("please enter two integers: ");
    int num1 = kb.nextInt();
    int num2 = kb.nextInt();
    System.out.print("the sum is: "+(num1+num2)); 
    System.out.print("\nplease enter two real numbers: "); 
    double rnum1 =kb.nextDouble();
    double rnum2 =kb.nextDouble();
    System.out.print("the sum is: "+(rnum1+rnum2));
    System.out.println("\nplease enter 5 words on the same line: ");
    String word1 = kb.next(); 
    String word2 = kb.next();
    String word3 = kb.next();
    String word4 = kb.next();
    String word5 = kb.next();
    System.out.println(word1);
    System.out.println(word2);
    System.out.println(word3);
    System.out.println(word4);
    System.out.println(word5);
    }
}
