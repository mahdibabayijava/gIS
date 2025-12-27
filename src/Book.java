import java.util.List;

public class Book extends Item {
    //--------------------------Fields-------------------------
    private String description;
    private List<Author> authors;
    private int ISBN;
    private String printEdition;
    private String publisher;
    private Category category;
    private int pageCount;


    //-----------------------Constructors----------------------


    public Book(String itemID, String itemName, String description, List<Author> authors, int ISBN, String printEdition, String publisher, Category category, int pageCount) {
        super(itemID, itemName);
        setDescription(description);
        setAuthors(authors);
        setISBN(ISBN);
    }

    //-------------------------Setters-------------------------
    public void setDescription(String description) {
        this.description = description;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setPrintEdition(String printEdition) {
        this.printEdition = printEdition;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }


    //-------------------------Getters-------------------------
    public String getDescription() {
        return description;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public int getISBN() {
        return ISBN;
    }


    public String getPrintEdition() {
        return printEdition;
    }

    public String getPublisher() {
        return publisher;
    }

    public Category getCategory() {
        return category;
    }

    public int getPageCount() {
        return pageCount;
    }


    //-------------------------Methods-------------------------
}
