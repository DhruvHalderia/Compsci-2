

public class BookRunner
{
    public static void main(String[] args){
     Book bookOne = new Book();
     Book bookTwo = new Book("The Hobbit",453,true);
     System.out.println(bookOne);
     System.out.println(bookTwo);
      
     bookOne.setTitle("Return of the Jedi");
     System.out.println(bookOne);
    }
}
