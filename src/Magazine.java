import java.time.LocalDate;
import java.time.LocalTime;

public class Magazine extends Item{
    //--------------------------Fields-------------------------
    private String description;
    private int serialNumber;
    private String publisher;
    private LocalDate publicationDate;
    private Category category;


    //-----------------------Constructors----------------------
    public Magazine(String itemID, String itemName, String description, int serialNumber, String publisher, LocalDate publicationDate, Category category) {
        super(itemID, itemName);
        setDescription(description);
        setSerialNumber(serialNumber);
        setPublisher(publisher);
        setPublicationDate(publicationDate);
        setCategory(category);
    }


    //-------------------------Setters-------------------------
    public void setDescription(String description) {
        this.description = description;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        if (LocalDate.now().isBefore(publicationDate))
            throw  new IllegalArgumentException("Publication date is not valid!");
        this.publicationDate = publicationDate;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


    //-------------------------Getters-------------------------
    public String getDescription() {
        return description;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getPublisher() {
        return publisher;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public Category getCategory() {
        return category;
    }


    //-------------------------Methods-------------------------
}
