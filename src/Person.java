public abstract class Person {


        protected int id;
        protected String name;
        protected String phone;



    public Person(int id, String name, String phone) {
            this.id = id;
            this.name = name;
            this.phone = phone;
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


