package org.example.Ques2;

import java.util.List;

public class Person {
    private String id;
    private String name;
    private List<Address> addresses;
    public Person(String id, String name, List<Address> addresses) {
        this.id = id;
        this.name = name;
        this.addresses = addresses;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public List<Address> getAddresses() {
        return addresses;
    }
}
