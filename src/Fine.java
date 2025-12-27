import java.time.LocalDate;

public class Fine {
    //--------------------------Fields-------------------------
    private Loan loan;
    private int daysOverDue;


    //-----------------------Constructors----------------------
    public Fine(Loan loan) {
       setLoan(loan);
    }


    //-------------------------Setters-------------------------
    public void setDaysOverDue(int daysOverDue) {
        this.daysOverDue = daysOverDue;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }


    //-------------------------Getters-------------------------
    public int getDaysOverDue() {
        return daysOverDue;
    }

    public Loan getLoan() {
        return loan;
    }


    //-------------------------Methods-------------------------
    public void checkOverDue() {
        int daysOverDue = 0;
        if (loan.getLoanEndDate().isBefore(LocalDate.now())) {
            daysOverDue = LocalDate.now().compareTo(loan.getLoanEndDate());
        }
        setDaysOverDue(daysOverDue);
    }

    public void setFine() {
        if(daysOverDue > 0) {
            loan.getMember().setFineCount(loan.getMember().getFineCount() + 1); //اضافه کردن یکی به تاریخچه جریمه های فرد
        }
    }

    public void generateBill() {
        double fine = 0;
        if(daysOverDue > 0) {
            fine = daysOverDue * 50_000; //به ازای هر روز تاخیر 5 هزار تومان جریمه
        }
        System.out.println("--------------------------");
        System.out.println("Name: " + loan.getMember().getName());
        System.out.println("ID: " + loan.getMember().getId());
        System.out.println("Days over due: " + daysOverDue);
        System.out.println("Fine: " + fine + "IRR");
        System.out.println("--------------------------");
    }
}
