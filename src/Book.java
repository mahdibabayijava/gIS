import java.util.List;

public class Book extends Item {
    //--------------------------Fields-------------------------
    private String description;
    private List<Author> authors;
    private int ISBN;
    private String publisher;


    //-----------------------Constructors----------------------
    public Book(String itemID, String itemName, String description, List<Author> authors, int ISBN, String publisher) {
        super(itemID, itemName);
        this.description = description;
        this.authors = authors;
        this.ISBN = ISBN;
        this.publisher = publisher;
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

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    //-------------------------Getters-------------------------
    public String getDescription() {
        return description;
    }

    public List<Author> getAuthor() {
        return authors;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getPublisher() {
        return publisher;
    }


    //-------------------------Methods-------------------------
}
