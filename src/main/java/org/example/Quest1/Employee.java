package org.example.Quest1;

public class Employee {

    private int id;
    private String name;
    private int age;
    private long salary;
    private String gender;
    private Department deptName;

    public Employee(int id, String name, int age, long salary, String gender, Department deptName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.deptName = deptName;
    }

    public Employee(int id, Department deptName, long salary) {
        this.id = id;
        this.deptName = deptName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Department getDeptName() {
        return deptName;
    }

    public void setDeptName(Department deptName) {
        this.deptName = deptName;
    }
}

enum Department{
    HR,
    FINANCE,
    DEV,
    MGR
}
