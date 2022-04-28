public class Book {

    private String title;
    private int year;
    private int page;

    public Book(String title, int page, int year){
        this.title = title;
        this.page = page;
        this.year = year;
    }

    public int getPage() {
        return page;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String toString() {

        return this.title + ", " + this.page + " pages, " + this.year;
    }
}
