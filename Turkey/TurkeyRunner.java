
import java.util.Scanner; 
public class TurkeyRunner
{
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     Scanner keyboard = new Scanner(System.in);
     int entry = 0;
     Farm p1 = new Farm();  
     while(entry != 5){
       System.out.print("Turkey Farm Software\nenter 1 to add a turkey\nenter 2 to remove a turkey\nenter 3 to update weight\nenter 4 to print the list of turkey\nenter 5 to end\n\nEntry:");
       entry = sc.nextInt();
       if(entry == 1){ 
        System.out.println("Enter turkey name: ");
        p1.addTurkey(keyboard.nextLine());
        System.out.println("\n"+p1+"\n");
        }
       if(entry == 2){
         System.out.println("\n"+p1+"\n");
         System.out.println("What turkey do you want to remove");
         p1.removeTurkey(keyboard.nextInt());
         System.out.println("\n"+p1+"\n");
        } 
       if(entry == 3){
         System.out.println("\n"+p1+"\n");
         System.out.println("What turkey do you want to adjust weight");
         int num = keyboard.nextInt();
         System.out.println("What is "+p1.getTurkeys(num).getName()+"'s new weight: ");
         double num1 = keyboard.nextInt();
         p1.getTurkeys(num).setWeight(num1);
         System.out.println("\n"+p1+"\n");
        }  
       if(entry == 4){
          System.out.println("\n"+p1+"\n");             
        }  
        }
    }
}
