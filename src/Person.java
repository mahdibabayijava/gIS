public abstract class Person {


    protected int id;
    protected String name;
    protected String phone;


    public Person(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }


    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }


    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }


    // متد abstract برای نمایش نقش
    public abstract String getRole();

    // متد مشترک
    public void showInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Role: " + getRole());
    }
}


