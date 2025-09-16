class AnimalBase {}

class Dog extends AnimalBase {}
class Cat extends AnimalBase {}

public class InstanceOfDemo {
    public static void main(String[] args) {
        AnimalBase a = new Dog();

        if (a instanceof Dog) {
            System.out.println("a is a Dog");
        }

        if (a instanceof AnimalBase) {
            System.out.println("a is an AnimalBase");
        }

        if (!(a instanceof Cat)) {
            System.out.println("a is not a Cat");
        }
    }
}
