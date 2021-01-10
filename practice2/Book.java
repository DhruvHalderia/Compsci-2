

public class Book
{
    private String title;
    private int numPages;
    private boolean paperback;
    
    public Book(){
         title="NA";
         numPages =0;
         paperback =false;
    }
    
    public Book(String t, int n, boolean p){
     title =t;
     numPages = n;
     paperback = p;        
    }
    
    
    public void setTitle(String t){
     title = t;    
    }
    public void setNumPage(int n){
     numPages =n ;    
    }
    
   public void setPaperback(boolean p){
     paperback = p;    
    }
    
    public String getTitle(){
      return title;  
    }
    public int getNumPage(){
      return numPages;  
    }
    
    public boolean getPaperback(){
      return paperback;  
    }
    
    public String toString(){
      return title + " pages: "+numPages;  
    }
}
