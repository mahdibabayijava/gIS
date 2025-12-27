import java.time.LocalDate;

public class Loan {
    //--------------------------Fields-------------------------
    private Member member;
    private Book book;
    private LocalDate loanEndDate;


    //-----------------------Constructors----------------------
    public Loan(Member member, Book book, LocalDate loanEndDate) {
        setMember(member);
        setBook(book);
        setLoanEndDate(loanEndDate);
    }

    //-------------------------Setters-------------------------
    public void setMember(Member member) {
        this.member = member;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setLoanEndDate(LocalDate loanEndDate) {
        this.loanEndDate = loanEndDate;
    }


    //-------------------------Getters-------------------------
    public Member getMember() {
        return member;
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getLoanEndDate() {
        return loanEndDate;
    }


    //-------------------------Methods-------------------------
}
