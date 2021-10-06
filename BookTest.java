public class BookTest {
  public static void main(String[] args) {
    Book book = new Book(3);
    book.nextPage();
    System.out.println("The current page number is " + book.GetCurrentPage());
    book.nextPage();
    System.out.println("The current page number is " + book.GetCurrentPage());
    book.nextPage();
    System.out.println("The current page number is " + book.GetCurrentPage());
  }
}