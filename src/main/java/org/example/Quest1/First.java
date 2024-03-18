package org.example.Quest1;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class First {

    public static void main(String[] args) {

        List<Employee> employeeList = List.of(
                new Employee(1, Department.DEV, 1_000_00),
                new Employee(2, Department.MGR, 1_000_0),
                new Employee(3, Department.HR, 50_000),
                new Employee(4, Department.DEV, 2_000_00),
                new Employee(5, Department.FINANCE, 30_000)
        );

        Optional<Employee> employee = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst();

        System.out.print(employee.get().getId());
        System.out.print(" " + employee.get().getDeptName());
        System.out.print(" " + employee.get().getSalary());

    }
}
