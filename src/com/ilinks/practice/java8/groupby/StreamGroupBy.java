package com.ilinks.practice.java8.groupby;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupBy {

    public static void main(String[] args) {
        
        List<Employee> employees = Arrays.asList(
                new Employee("Pradeep Kumar", 4, 35),
                new Employee("Kumar", 3, 34),
                new Employee("Ramesh", 2, 36),
                new Employee("Ramesh", 3, 23),
                new Employee("Kishor", 6, 23));
        
        Map<Object, List<Employee>> emp = employees.stream().collect(Collectors.groupingBy(i -> i.getAge()));
        
        System.out.println("Employees = "+emp);
        
        Map<Object, List<String>> empNames = employees.stream().collect(Collectors.groupingBy(i -> i.getAge(), Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println("Employees by name = "+empNames);
    }

}
