
public class CarRunner extends Car
{
    public static void main(String[] args){
     Car carOne = new Car();
     Car carTwo = new Car("Toyota",12000,15000);
     Car carThree = new Car("Honda",570,30000);
     System.out.println(carOne);
     System.out.println(carTwo);
     carTwo.setCarMiles(786);
     System.out.println(carTwo);
     carOne.setCarBrand("Subaru");
     carOne.setCarMiles(53000);
     carOne.setCarPrice(7000);
     System.out.println(carOne);
     System.out.println(carThree);
    }
}
