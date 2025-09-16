class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    String subject;
    double salary;

    Teacher(String name, int age, String subject, double salary) {
        super(name, age); // call parent constructor
        this.subject = subject;
        this.salary = salary;
    }

    void displayTeacher() {
        display(); // from Person
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Teacher t = new Teacher("Ravi", 40, "Maths", 50000);
        t.displayTeacher();
    }
}
