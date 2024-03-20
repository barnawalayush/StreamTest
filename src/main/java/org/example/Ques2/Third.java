package org.example.Ques2;

import java.util.List;
import java.util.stream.Collectors;

public class Third {

    public static void main(String[] args) {

        List<Address> addressList1 = List.of(
                new Address("Bob", "Ballia", "123"),
                new Address("Bob", "Hyderabad", "133"),
                new Address("Bob", "Varanasi", "213"),
                new Address("Bob", "Prayagraj", "323"),
                new Address("Bob", "NewYork", "548")
        );

        List<Address> addressList2 = List.of(
                new Address("John", "Aurangabad", "143"),
                new Address("John", "New York", "333")
        );

        List<Address> addressList3 = List.of(
                new Address("Sherlock", "Allahabad", "143"),
                new Address("Sherlock", "Hyderabad", "333")
                );
        List<Address> addressList4 = List.of(
                new Address("Antonio", "Allahabad", "143"),
                new Address("Antonio", "NewYork", "333")
        );
        List<Address> addressList5 = List.of(
                new Address("Sam", "NewYork", "143"),
                new Address("Sam", "Hyderabad", "333")
        );
        List<Address> addressList6 = List.of(
                new Address("John", "Allahabad", "143"),
                new Address("John", "Hyderabad", "333")
        );
        List<Address> addressList7 = List.of(
                new Address("Shreya", "Allahabad", "143"),
                new Address("Shreya", "Hyderabad", "333")
        );

        Person p1 = new Person("1", "Bob", addressList1);
        Person p2 = new Person("2", "John", addressList2);
        Person p3 = new Person("3", "Sherlock", addressList3);
        Person p4 = new Person("4", "Antonio", addressList4);
        Person p5 = new Person("5", "Sam", addressList5);
        Person p6 = new Person("6", "John", addressList6);
        Person p7 = new Person("7", "Shreya", addressList7);

        List<Person> personList = List.of(
                p1, p2, p3, p4, p5, p6, p7
        );

        List<Person> list1 = personList.stream().
                filter(person -> person.getName().equals("John") || person.getAddresses().stream().anyMatch(address -> address.getCity().equals("NewYork"))).
        limit(3).collect(Collectors.toList());

        list1.stream().forEach(person -> System.out.println(person.getName()));

    }
}
