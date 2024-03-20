package org.example.Ques2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Second {

    public static void main(String[] args) {

        // Sample data
        List<Address> addressList1 = List.of(
                new Address("Bob", "Ballia", "123"),
                new Address("Bob", "Hyderabad", "133"),
                new Address("Bob", "Varanasi", "213"),
                new Address("Bob", "Prayagraj", "323"),
                new Address("Bob", "Bhopal", "548")
        );

        List<Address> addressList2 = List.of(
                new Address("John", "Aurangabad", "143"),
                new Address("John", "New York", "333")
        );

        List<Address> addressList3 = List.of(
                new Address("Sherlock", "Delhi", "143"),
                new Address("Sherlock", "Allahabad", "333")
        );

        List<Address> addressList4 = List.of(
                new Address("Bob", "Allahabad", "143"),
                new Address("Bob", "Hyderabad", "333")
        );

        List<Address> addressList5 = List.of(
                new Address("Sherlock", "Jaipur", "143"),
                new Address("Sherlock", "Ahemdabad", "333")
        );

        Person p1 = new Person("1", "Bob", addressList1);
        Person p2 = new Person("2", "John", addressList2);
        Person p3 = new Person("3", "Sherlock", addressList3);
        Person p4 = new Person("4", "Bob", addressList4);
        Person p5 = new Person("4", "Sherlock", addressList5);

        List<Person> personList = List.of(
                p1, p2, p3, p4, p5
        );

        System.out.println(personList);

        List<Person> personList2 = personList.stream().sorted(
                (person1, person2) -> {
                    if(!person1.getName().equals(person2.getName())){
                        return person2.getName().compareTo(person1.getName());
                    }else{
                        String city1 = person1.getAddresses().stream().sorted((s1, s2) -> s2.getCity().compareTo(s1.getCity())).collect(Collectors.toList()).get(0).getCity();
                        String city2 = person2.getAddresses().stream().sorted((s1, s2) -> s2.getCity().compareTo(s1.getCity())).collect(Collectors.toList()).get(0).getCity();
                        return city2.compareTo(city1);
                    }
                }).collect(Collectors.toList());

        System.out.println(personList2);

    }
}
