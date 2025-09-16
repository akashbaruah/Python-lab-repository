class PersonBase {
    PersonBase() {
        System.out.println("Person constructor called");
    }
}

class Employee extends PersonBase {
    Employee() {
        super(); // calls PersonBase constructor
        System.out.println("Employee constructor called");
    }
}

class Manager extends Employee {
    Manager() {
        super(); // calls Employee constructor
        System.out.println("Manager constructor called");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Manager m = new Manager();
    }
}
