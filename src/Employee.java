public class Employee extends Person {

    private String position;

    public Employee(int id, String name, String phone, String position) {
        super( id, name, phone);
        this.position = position;
    }

    @Override
    public String getRole() {
        return "Library Employee";
    }

    public void addBook() {
        System.out.println("Book added to library.");
    }

    public void approveLoan() {
        System.out.println("Loan approved.");
    }
}


