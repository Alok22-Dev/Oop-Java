public class Person {
    // Private fields
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the Person class
        Person person = new Person();

        // Using the setters to set the values
        person.setName("Alok Sarmah");

        // Correcting the age assignment by using an integer value
        person.setAge(20);

        // Using the getters to retrieve and print the values
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
