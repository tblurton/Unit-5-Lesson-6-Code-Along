public class Book
{
  //Fields/Instance Data//
  private String title; 
  private String author; 
  private int year; 
  private int pageCount;
  private boolean hardCover;
  //"public" and "private" are visibility modifiers 
  //public means that the programmer can access it from outside the class
  //private means that the programmer cannot access it from outside the class (encapsualtion)
  

  //Constructor//
  public Book(String t, String a, int y, int p, boolean h)
  {
    title = t;
    author = a;
    year = y;
    pageCount = p;
    hardCover = h;
  }
  

  //Accessor Methods//
  public String getTitle()
  {
    return title;
  }
  public String getAuthor()
  {
    return author;
  }
  public int getYear()
  {
    return year;
  }
  public int getPageCount()
  {
    return pageCount;
  }
  public boolean getHardCover()
  {
    return hardCover;
  }


  //Mutator Methods//
  public void setTitle(String s)
  {
    title = s;
  }
  public void setAuthor(String s)
  {
    author = s;
  }
  public void setYear(int i)
  {
    year = i;
  }
  public void setPageCount(int i)
  {
    pageCount = i;
  }
  public void setHardCover(boolean b)
  {
    hardCover = b;
  }


  //Other Methods//
  public boolean equals(Book b)
  {
    if(this.getTitle().equals(b.getTitle()))
    {
      return true;
    }
    else
    {
      return false;
    }
    //"this" refers to the object that called this method from the tester program
  }



  //toString//
  public String toString()
  {
    String str = "";
    str = "\nTitle: "+title+"\nAuthor: "+author+"\nYear Published: "+year;
    str+="\nPage Count: "+pageCount+"\nHard Cover: "+hardCover;
    
    return str;
    //Printing Book object without a toString and return command results in hash code / garbage code -- toString allows us to obtain meaningful information 
  }
}