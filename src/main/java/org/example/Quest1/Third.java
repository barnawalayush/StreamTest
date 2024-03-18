package org.example.Quest1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Third {

    public static void main(String[] args) {
        List<Employee> employeeList = List.of(
                new Employee(1, "Bob", 40, 1_000_00L, "male", Department.DEV),
                new Employee(2, "Jessica", 28, 1_000_0, "female", Department.MGR),
                new Employee(3, "Sherlock", 48, 50_000, "male", Department.HR),
                new Employee(4, "Nerissa", 34, 2_000_00, "female", Department.DEV),
                new Employee(5, "Antonio", 40, 30_000, "male", Department.FINANCE)
        );

        List<Employee> employees1 = employeeList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());

        List<Employee> employees2 = employeeList.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).collect(Collectors.toList());

        employees1.stream().forEach(employee -> System.out.println(employee.getName() + " " + employee.getAge()));

        employees2.stream().forEach(employee -> System.out.println(employee.getName() + " " + employee.getAge()));

    }
}
