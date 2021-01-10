

public class ClassVariableExample
{
    // instance variables - replace the example below with your own
    private int x;
    private static int numObjects = 0;
    
    public ClassVariableExample(int a)
    {
        // initialise instance variables
        x = a;
        numObjects++;
    }

    
    public static int getNumObjects()
    {
        // put your code here
        return numObjects;
    }
    
    public int getX()
    {
        // put your code here
        return x;
    }
    
    public String toString()
    {
        return "x is: " + x + "  and numObjects is: " + numObjects;
    }
}
