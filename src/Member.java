public class Member extends Person {
    //--------------------------Fields-------------------------
    private String membership = "Basic";
    private int fineCount = 0;


    //-----------------------Constructors----------------------
    public Member(int id, String name, String phone, String membership) {
        super(id, name, phone);
        setMembership(membership);
    }
    public Member(int id, String name, String phone) {
        super(id, name, phone);
    }


    //-------------------------Setters-------------------------
    public void setMembership(String membership) {
        if (membership != null && (membership.equals("Basic") || membership.equals("Advanced"))) {}
        this.membership = membership;
    }

    public void setFineCount(int fineCount) {
        this.fineCount = fineCount;
    }

    //-------------------------Getters-------------------------
    public String getMembership() {
        return membership;
    }

    public int getFineCount() {
        return fineCount;
    }


    //-------------------------Methods-------------------------
    @Override
    public String getRole() {
        if (membership.equals("Basic"))
            return "Basic-Member";
        else
            return "Advanced-Member";
    }
}