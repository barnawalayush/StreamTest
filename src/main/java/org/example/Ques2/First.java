package org.example.Ques2;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class First {

    public static void main(String[] args) {
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
                new Address("Sherlock", "Allahabad", "143"),
                new Address("Sherlock", "Hyderabad", "333")
        );

        Person p1 = new Person("1", "Bob", addressList1);
        Person p2 = new Person("2", "John", addressList2);
        Person p3 = new Person("3", "Sherlock", addressList3);

        List<Person> personList = List.of(
                p1, p1, p2, p2, p3
        );

        Map<Person, Long> map = personList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for(Person person: personList){
            if(map.get(person) == 1) System.out.println(person.getName());
        }


    }
}
