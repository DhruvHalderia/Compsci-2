
public class ExampleRunner
{
        
    public static void main(String[] args)
    {
        ClassVariableExample one = new ClassVariableExample(5);
        ClassVariableExample two = new ClassVariableExample(10);
        ClassVariableExample three = new ClassVariableExample(15);
        
        System.out.println(ClassVariableExample.getNumObjects());
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        
        ClassVariableExample four = new ClassVariableExample(20);
        System.out.println(ClassVariableExample.getNumObjects());
        System.out.println(four);
        
        System.out.println(four.getNumObjects());
    }
}