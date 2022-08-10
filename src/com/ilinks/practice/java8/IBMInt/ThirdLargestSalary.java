package com.ilinks.practice.java8.IBMInt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ThirdLargestSalary {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Employee> employees = Arrays.asList(
                new Employee("A", 5000, 24),
                new Employee("B", 8500, 26),
                new Employee("C", 17500, 28),
                new Employee("D", 28000, 30),
                new Employee("E", 40000, 32)
                );
        
        String thirdEmp = employees.stream().sorted((e1, e2)-> e2.getSalary() - e1.getSalary()).skip(2).findFirst().map(Employee::getName).get();
        
        System.out.println("Third largest salaried Employee : "+thirdEmp);
        
        
        
        List<Integer> randoms = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 7, 1, 4, 5);
        
        Map<Integer, Long> rsult = randoms.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        System.out.println("Occurence of the numbers : "+rsult);
    }

}
