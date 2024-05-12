package Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 25, "New York"));
        people.add(new Person("Jane", 30, "Los Angeles"));
        people.add(new Person("Alice", 20, "New York"));
        people.add(new Person("Bob", 35, "Chicago"));

        Collections.sort(people, (p1, p2) -> p1.getAge() - p2.getAge());

        people.removeIf(p -> !p.getCity().equals("New York"));

        for (Person person : people) {
            System.out.println(person.getName() + ", " + person.getAge() + ", " + person.getCity());
        }
    }
}