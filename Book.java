public class Book {
  private int numPages, currentPage;
  
  public Book(int p) {
    numPages = p;
    currentPage = 1;
  }
  public int GetCurrentPage() {
    return currentPage;
  }
  public int GetnumPages() {
    return numPages;
  }
  public void nextPage() {
    if (currentPage < numPages) {
      currentPage ++;
    }
  }
}