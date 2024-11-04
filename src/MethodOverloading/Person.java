package MethodOverloading;

public class Person {
    String name;
    int age;
    String address;

    public String toString() {
        return name + "  " + age + "  " + address;
    }

    Person(String name) {
        this.name = name;
    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Nimalesh");
        Person person2 = new Person("Nirmal", 22);
        Person person3 = new Person("Monish", 26, "123/5,Karpaga Nagar, Pudhur, Madurai - 625007");

        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
    }
}
