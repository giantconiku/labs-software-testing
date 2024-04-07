package com.giant.javabasics.Exercise10;

import java.util.Arrays;

public class Company {

    private String companyName;
    private Employee[] employees;

    public Company() {}

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public double getAverageAge() {
        int totalAge = 0;
        for(Employee employee : this.employees) {
            totalAge += employee.getAge();
        }
        return (double) totalAge / this.employees.length;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
