public class Member extends Person {
    private double salary;

    public Member(int id, String name, String phone) {
        super(id, name, phone);
    }

    @Override
    public String getRole() {
        return "Member";
    }
}