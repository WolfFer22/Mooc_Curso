
class BookInformation {
    private String bookTitle;
    private int pages;
    private int year;

    public BookInformation(String bookTitle, int pages, int year) {
        this.bookTitle = bookTitle;
        this.pages = pages;
        this.year = year;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getPages() {
        return pages;
    }
    
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return bookTitle + ", " + pages + ", " + year;
    }    
    
}
