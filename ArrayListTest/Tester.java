import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class Tester
{
  public static void main(String[] args){
    ArrayList<Integer>list= new <Integer>ArrayList();
    ArrayList<Integer> bigs = new ArrayList<Integer>();
    int cnt = 8 ;
    for(int i=0; i < cnt; i++)
   list.add( list.get(i) + list.get(i) );

System.out.println(list);
    }
}
