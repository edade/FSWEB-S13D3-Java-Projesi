public class Main {

    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 20, "edakalaycioglu@gmail.com", true);
        System.out.println(" Firstname: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("isTeen: " + person.isTeen());
        System.out.println("Email: " + person.getEmail());
        System.out.println("isStudent: " + person.isStudent());

        System.out.println("--------------");
        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());

    }

    static class Person {
        private String firstname;
        private String lastName;
        private int age;
        private String email;

        private boolean isStudent;

        //constructor
        public Person(String firstname, String lastName, int age, String email, boolean isStudent ) {
            this.firstname = firstname;
            this.lastName = lastName;
            this.age = age;
            this.email = email;
            this.isStudent = isStudent;
        }

        //constructor2
        public Person(String firstname, String lastName, int age, String address, String email, boolean isStudent) {
            this(firstname, lastName, age,email, isStudent);

        }

        public String getFirstName() {
            return this.firstname;
        }

        public String getLastName() {
            return this.lastName;
        }
        public String getEmail() {
            return this.email;
        }


        public int getAge() {
            return this.age;
        }

        public boolean isTeen() {
            return this.age >= 13 && this.age <= 19;
        }
        public boolean isStudent() {
            return this.isStudent;
        }
    }
}