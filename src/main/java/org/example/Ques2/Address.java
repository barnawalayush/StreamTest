package org.example.Ques2;

public class Address {

    private String name;
    private String city;
    private String zipCode;

    public Address(String name, String city, String zipCode) {
        this.name = name;
        this.city = city;
        this.zipCode = zipCode;
    }
    public String getCity() {
        return city;
    }
}
