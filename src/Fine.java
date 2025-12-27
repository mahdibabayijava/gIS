import java.time.LocalDate;

public class Fine {
    //--------------------------Fields-------------------------
    private int daysOverDue;


    //-----------------------Constructors----------------------
    public Fine(int daysOverDue) {
        setDaysOverDue(daysOverDue);
    }


    //-------------------------Setters-------------------------
    public void setDaysOverDue(int daysOverDue) {
        this.daysOverDue = daysOverDue;
    }


    //-------------------------Getters-------------------------
    public int getDaysOverDue() {
        return daysOverDue;
    }


    //-------------------------Methods-------------------------
    public void checkOverDue(Loan loan) {
        int daysOverDue = 0;
        if (loan.getLoanEndDate().isBefore(LocalDate.now())) {
            daysOverDue = LocalDate.now().compareTo(loan.getLoanEndDate());
        }
        setDaysOverDue(daysOverDue);
    }

    public void setFine(Member member, Loan loan) {
        if(daysOverDue > 0) {
            member.setFineCount(member.getFineCount() + 1); //اضافه کردن یکی به تاریخچه جریمه های فرد
        }
    }

    public void generateBill(Member member, Loan loan) {
        double fine = 0;
        if(daysOverDue > 0) {
            fine = daysOverDue * 50_000; //به ازای هر روز تاخیر 5 هزار تومان جریمه
        }
        System.out.println("--------------------------");
        System.out.println("Name: " + member.getName());
        System.out.println("ID: " + member.getId());
        System.out.println("Days over due: " + daysOverDue);
        System.out.println("Fine: " + fine + "IRR");
        System.out.println("--------------------------");
    }
}
