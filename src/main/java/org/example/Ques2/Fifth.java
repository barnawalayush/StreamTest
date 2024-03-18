package org.example.Ques2;

import java.util.List;
import java.util.stream.Collectors;

public class Fifth {

    public static void main(String[] args) {

        List<Address> addressList1 = List.of(
                new Address("Bob", "Hyderabad", "123")
        );

        List<Address> addressList2 = List.of(
                new Address("John", "Aurangabad", "143"),
                new Address("John", "New York", "333")
        );

        List<Address> addressList3 = List.of(
                new Address("Sherlock", "Allahabad", "143"),
                new Address("Sherlock", "Hyderabad", "333")
        );

        Person p1 = new Person("1", "Bob", addressList1);
        Person p2 = new Person("2", "John", addressList2);
        Person p3 = new Person("3", "Sherlock", addressList3);

        List<Person> personList = List.of(
                p1, p2, p3
        );

//        sort all person by their name, city in descending order

        List<String> address = List.of();
//        personList.stream().collect(Collectors.groupingBy(Person::getAddresses, Person::getName))

    }
}
