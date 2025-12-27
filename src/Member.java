public class Member extends Person {
    private String membership = "Basic";

    public Member(int id, String name, String phone, String membership) {
        super(id, name, phone);
        setMembership(membership);
    }
    public Member(int id, String name, String phone) {
        super(id, name, phone);
    }

    public void setMembership(String membership) {
        if (membership != null && (membership.equals("Basic") || membership.equals("Advanced"))) {}
        this.membership = membership;
    }

    public String getMembership() {
        return membership;
    }

    @Override
    public String getRole() {
        if (membership.equals("Basic"))
            return "Basic-Member";
        else
             return "Advanced-Member";
    }
}