import java.io.*;
import static java.lang.System.*;
import java.util.*;

class Main {
  public static void main (String str[]) {
    //The order and amount of parameters matters
    Book b = new Book("I am Malala", "Malala Yousafzai", 2013, 288, true);
    System.out.println(b);

    Book n = new Book("1984", "George Orwell", 1949, 328, false);
    System.out.println(n);
    
    System.out.println("\nPage Count of \"1984\": "+n.getPageCount());
    System.out.println("\"I am Malala\" is a Hardcover: "+b.getHardCover());

    Scanner scan = new Scanner(System.in);
    System.out.print("\nEnter new page count for \"I am Malala\": ");
    int np = scan.nextInt();
    b.setPageCount(np);
    System.out.println("New page count for \"I am Malala\": "+b.getPageCount());
    
    Scanner scan2 = new Scanner(System.in);
    System.out.print("Enter new author name for \"1984\": ");
    String na = scan2.nextLine();
    n.setAuthor(na);
    System.out.println("New author name for \"1984\": "+n.getAuthor());
  
    System.out.println("\n\""+b.getTitle()+"\" and \""+b.getTitle()+"\" are equal: "+b.equals(b));
    System.out.println("\""+b.getTitle()+"\" and \""+n.getTitle()+"\" are equal: "+b.equals(n));

  }
}