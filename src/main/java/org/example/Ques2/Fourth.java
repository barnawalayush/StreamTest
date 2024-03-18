package org.example.Ques2;

import java.util.List;
import java.util.stream.Collectors;

public class Fourth {

    public static void main(String[] args) {

        List<Address> addressList = List.of(
                new Address("Bob", "Ballia", "123"),
                new Address("Ayush", "Hyderabad", "133"),
                new Address("Antonio", "Varanasi", "213"),
                new Address("Sherlock", "Prayagraj", "323"),
                new Address("Jessica", "Bhopal", "548")
        );

        Person p1 = new Person("1", "Bob", addressList);
        Person p2 = new Person("2", "Ayush", addressList);
        Person p3 = new Person("3", "Sherlock", addressList);
        Person p4 = new Person("5", "Antonio", addressList);
        Person p5 = new Person("4", "Jessica", addressList);

        List<Person> personList = List.of(
                p1, p2, p3, p4, p5
        );

        personList.stream().map(person -> person.getName().toUpperCase()).forEach(System.out::println);

    }
}
