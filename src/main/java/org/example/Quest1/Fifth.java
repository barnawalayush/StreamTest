package org.example.Quest1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Fifth {

    public static void main(String[] args) {
        List<Employee> employeeList = List.of(
                new Employee(1, "Bob", 40, 1_000_00L, "male", Department.DEV),
                new Employee(2, "Jessica", 28, 1_000_0, "female", Department.MGR),
                new Employee(3, "Sherlock", 48, 50_000, "male", Department.HR),
                new Employee(4, "Nerissa", 34, 2_000_00, "female", Department.DEV),
                new Employee(5, "Antonio", 40, 30_000, "male", Department.FINANCE)
        );

        Map<Department, Optional<Employee>> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

        Employee employee1 = map.get(Department.HR).get();
        System.out.println(Department.HR + " " + employee1.getSalary());

        Employee employee2 = map.get(Department.DEV).get();
        System.out.println(Department.DEV + " " + employee2.getSalary());

        Employee employee3 = map.get(Department.MGR).get();
        System.out.println(Department.MGR + " " + employee3.getSalary());

        Employee employee4 = map.get(Department.FINANCE).get();
        System.out.println(Department.FINANCE + " " + employee1.getSalary());
    }
}
