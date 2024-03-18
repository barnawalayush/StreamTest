package org.example.Quest1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Second {

    public static void main(String[] args) {
        List<Employee> employeeList = List.of(
                new Employee(1, "Bob", 40, 1_000_00L, "male", Department.DEV),
                new Employee(2, "Jessica", 28, 1_000_0, "female", Department.MGR),
                new Employee(3, "Sherlock", 48, 50_000, "male", Department.HR),
                new Employee(4, "Nerissa", 34, 2_000_00, "female", Department.DEV),
                new Employee(5, "Antonio", 40, 30_000, "male", Department.FINANCE)
        );

        Map<Boolean, List<Employee>> genderWise = employeeList.stream().collect(Collectors.groupingBy(employee -> employee.getGender() == "male"));

        System.out.println("Female");
        genderWise.get(false).forEach(employee -> System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getAge() + " " + employee.getSalary() + " " + employee.getGender() + " " + employee.getDeptName()));

        System.out.println();
        System.out.println("Female");
        genderWise.get(true).forEach(employee -> System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getAge() + " " + employee.getSalary() + " " + employee.getGender() + " " + employee.getDeptName()));

    }
}
