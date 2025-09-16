import java.util.Scanner;

class Student {
    String name;
    int id;
    int marks;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Marks: " + marks);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student();
        s.input();
        s.display();
    }
}
