 
import java.util.Arrays;
import java.util.Scanner;
public class HotPepperClient
{
    public static void main(String[] args)
   {
      // This method prints all the statements from the class for each letter (d,g,w,p,s,and q)
     HotPepper [] pepperList = makeArrays();
     Scanner keyboard = new Scanner(System.in);
     System.out.println("0 Jalapeño\n1 Bell \n2 ChilI \n3 Carolina Reaper\n4 Habanero");
     System.out.print("Select the pepper number you want to simulate growth : ");
     int arrayNum = keyboard.nextInt();
     String select = " ";
     
       while(!select.equals("q"))
      {
          System.out.print("\nPepper Data<d>, Grow<g>, Water<w>, Fertilize<f>, Pick<p>, Status<s> or Quit<q>");
         select = keyboard.next();
         if (select.equals("d"))
         {
             System.out.println();
             System.out.println(pepperList[arrayNum]);
             System.out.println(pepperList[arrayNum].getStatus());
             }
         
         else if (select.equals("g"))
       {
            System.out.println("\nGrowing plant 1 day");
         pepperList[arrayNum].grow();     
         System.out.println(pepperList[arrayNum].getStatus());
        }
         else if (select.equals("w")){
             System.out.print("How many ounces of water did you add? ");
             int water1 = keyboard.nextInt();
             pepperList[arrayNum].setWater(water1);
             System.out.println();
             System.out.println(pepperList[arrayNum].getStatus());
            }
         else if (select.equals("f")){
            System.out.print("How many ounces of fertilizer did you add? ");
            int fert1 = keyboard.nextInt();
            pepperList[arrayNum].setNitroLevel(fert1);
            System.out.println();
            System.out.println(pepperList[arrayNum].getStatus());
            }
         else if (select.equals("p")){
             System.out.println(pepperList[arrayNum].pick());
             pepperList[arrayNum].setFruitMaturity(0);
             pepperList[arrayNum].setFruitNum(0);
             pepperList[arrayNum].setColor("no peppers yet");
             System.out.println(pepperList[arrayNum].getStatus());
            }
         else if (select.equals("s")){
             System.out.println(pepperList[arrayNum].getStatus());
            }
           System.out.println();
        System.out.println();
       }
       System.out.println(pepperList[arrayNum].getStatus());
       System.out.println("\n\nGoodBye");
    }
    public static HotPepper[] makeArrays()
    {
      //This method makes the arrays that are used in the code 
       HotPepper [] pepperList = new HotPepper[5];
      String [] pepperName = {"Jalapeño", "Bell", "ChilI", "Carolina Reaper", "Habanero"};
      int [] growthRate = {5,7,1,3,2};
      int [] PlantMaturityRate = {12,13,15,18,16};
      int [] fruitMaturityRate = {1,3,2,2,1};
      for(int i=0; i<5;i++){
        pepperList[i]= new HotPepper(pepperName[i],growthRate[i],PlantMaturityRate[i],fruitMaturityRate[i]);
       }  
       System.out.println("Number of Peppers to simulate growth : 5");
       return pepperList;
    }
}