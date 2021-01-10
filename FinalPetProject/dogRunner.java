import java.util.ArrayList;
import java.util.Scanner;
public class dogRunner
{
    public static void main(String[] args){
      Scanner Key = new Scanner(System.in);
      Scanner keyboard = new Scanner(System.in);
      int entry = 0;
      int index = 0;
      ArrayList<String> checkedInDogs = new ArrayList<String>();
      ArrayList<Owner> owners = new ArrayList< Owner>(); 
      ArrayList<Integer>checkOwners = new ArrayList<Integer>();
      ArrayList<Integer>checkDogsIn = new ArrayList<Integer>();
      owners.add(new Owner("Ben", "101 hill", "8989984989"));
      owners.get(index).addDog("Timmy", 4);
      index++;
      owners.add(new Owner("Cathy","201 hill", "7878787878"));
      owners.get(index).addDog("Lulu", 2);
      owners.get(index).addDog("Patty", 3);
      index++;
      while(entry != 8){
        System.out.println("The Doggy Spa\nEnter 1 to check in pet\nEnter 2 to check out pet\nEnter 3 to wash pet\nEnter 4 to trim pet\nEnter 5 for a status report on checked-in pets\nEnter 6 to print cust bill\nEnter 7 to add a customer\nEnter 8 to end\nEntry: ");
        entry = Key.nextInt();
        if (entry == 1){
         System.out.println();
         for(int i = 0; i<owners.size(); i++){
             System.out.println(i+"  "+owners.get(i).getName()+" owes us "+owners.get(i).getBill()+" dollars");
            }
         System.out.println("\nWhich customer is checking in there dog: ");
         int custCheck = Key.nextInt();
         System.out.println();
         System.out.println(owners.get(custCheck).getName()+" dog(s):\n"+owners.get(custCheck).getDoggos());
         int cDogs = Key.nextInt();
         owners.get(custCheck).unWashed(cDogs);
         owners.get(custCheck).unTrimmed(cDogs);
         checkOwners.add(custCheck);
         checkDogsIn.add(cDogs);
         checkedInDogs.add(owners.get(custCheck).toString(cDogs));
         System.out.println("\nDoggy Spa Dogs: ");
         for(int i = 0; i<checkedInDogs.size();i++)
          System.out.println(i+" "+checkedInDogs.get(i));
         System.out.println();
        }
        if (entry == 2){
         System.out.println("\nDoggy Spa Dogs: ");
         for(int i = 0; i<checkedInDogs.size();i++)
          System.out.println(i+" "+checkedInDogs.get(i));
         System.out.println("\nWhich dog do you want to check out: "); 
         int dogNum = Key.nextInt();
         checkedInDogs.remove(dogNum);
         checkOwners.remove(dogNum);
         checkDogsIn.remove(dogNum);
         System.out.println("\nDoggy Spa Dogs: ");
         for(int i = 0; i<checkedInDogs.size();i++)
          System.out.println(i+" "+checkedInDogs.get(i));
          System.out.println();
        }
        if (entry == 3){
          System.out.println("\nDoggy Spa Dogs: ");
          for(int i = 0; i<checkedInDogs.size();i++)
          System.out.println(i+" "+checkedInDogs.get(i));
          System.out.println("\nWhich dog is getting a wash: ");
          int wNum = Key.nextInt();
          owners.get(checkOwners.get(wNum)).addBill(30);
          owners.get(checkOwners.get(wNum)).washed(checkDogsIn.get(wNum)); 
          checkedInDogs.set(wNum,owners.get(checkOwners.get(wNum)).toString(checkDogsIn.get(wNum)));
          for(int i = 0; i<owners.size(); i++){
             System.out.println(i+"  "+owners.get(i).getName()+" owes us "+owners.get(i).getBill()+" dollars");
            }
          System.out.println();
          System.out.println("Doggy Spa Dogs: ");
          for(int i = 0; i<checkedInDogs.size();i++)
          System.out.println(i+" "+checkedInDogs.get(i));
           System.out.println();
        }
        if (entry == 4){
           System.out.println("\nDoggy Spa Dogs: ");
          for(int i = 0; i<checkedInDogs.size();i++)
          System.out.println(i+" "+checkedInDogs.get(i));
          System.out.println("\nWhich dog is getting a trim: ");
          int wNum = Key.nextInt();
          owners.get(checkOwners.get(wNum)).addBill(50);
          owners.get(checkOwners.get(wNum)).trimmed(checkDogsIn.get(wNum)); 
          checkedInDogs.set(wNum,owners.get(checkOwners.get(wNum)).toString(checkDogsIn.get(wNum)));
          for(int i = 0; i<owners.size(); i++){
             System.out.println(i+"  "+owners.get(i).getName()+" owes us "+owners.get(i).getBill()+" dollars");
            }
          System.out.println(); 
          System.out.println("Doggy Spa Dogs: ");
          for(int i = 0; i<checkedInDogs.size();i++)
          System.out.println(i+" "+checkedInDogs.get(i));
           System.out.println();
        }
        if (entry == 5){
          System.out.println("\nDoggy Spa Dogs: ");
          for(int i = 0; i<checkedInDogs.size();i++)
          System.out.println(i+" "+checkedInDogs.get(i)); 
          System.out.println(); 
        }
        if (entry == 6){
           for(int i = 0; i<owners.size(); i++){
             System.out.println(i+"  "+owners.get(i).getName()+" owes us "+owners.get(i).getBill()+" dollars");
            } 
           System.out.println("\nWho's bill is being paid off :");
           int billNum = Key.nextInt();
           owners.get(billNum).addBill(-(int)owners.get(billNum).getBill());
           System.out.println();
           for(int i = 0; i<owners.size(); i++){
             System.out.println(i+"  "+owners.get(i).getName()+" owes us "+owners.get(i).getBill()+" dollars");
            } 
           System.out.println();
        }
        if (entry == 7){
         System.out.println("Name:");
         String name = Key.next();
         System.out.println("Address:");
         String add = Key.next();
         System.out.println("Phone:");
         String phone = keyboard.next();
         owners.add(new Owner(name,add,phone));
         String another = "y"; 
         while (another.equals("y")){
           System.out.println("Dog name:");
           String dName = Key.next();
           System.out.println("Dog age:");
           int dAge = Key.nextInt();
           owners.get(index).addDog(dName, dAge); 
           System.out.println("Do you have another pet?  y or n : ");
           another = Key.next();
            }
         index++;
         System.out.println();
        }
    }
        
    }
}
