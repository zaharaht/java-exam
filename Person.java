
// class defines object properties including a valid range of values, and a default value.
// A class also describes object behavior.

//an object is an instance inside aclass

import java.util.Scanner;

class Person {
    private int age;
    private double salary;

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();

        System.out.print("Enter person's age: ");
        int ageInput = scanner.nextInt();
        person.setAge(ageInput);

        System.out.print("Enter person's salary: ");
        double salaryInput = scanner.nextDouble();
        person.setSalary(salaryInput);

        // Accessing the values using public methods
        System.out.println("Person's age: " + person.getAge());
        System.out.println("Person's salary: " + person.getSalary());
    }
}

