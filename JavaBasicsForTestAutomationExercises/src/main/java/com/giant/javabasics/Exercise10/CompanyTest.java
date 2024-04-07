package com.giant.javabasics.Exercise10;

/*
    🔟 Implement a class named Employee, which consists of three fields: firstName, lastName and age.
    Add a three-argument constructor, which allows initializing field values and getter for age field.
    In the next step, please create class named Company, which consists of the fields:
    name of String type - company name
    employees, which is a 5-element table of Employee type (Employee[]) - table will store all company employees
    In class Company, please also add one-argument constructor, which takes name parameter as an argument,
    create setEmployees() method definition for setting company employees.
    Implement toString() methods for every class (Employee and Company, use Alt+Insert -> toString in IntelliJ),
    which will be returning whole object data.
    Implement also getAverageAge(), which returns the average age of company employees.
    In the last step, please create a test class named CompanyTest. In the main() method,
    create 5 instances of Employee type, which will be a representation of 5 employees working in the company.
    Then add them to the table and create an instance of type Company using one-argument constructor.
    Set employees field values using previously created setter. Next, please display all company data on
    the standard output (hint: toString() methods will be helpful) and average age computed by calling
    getAverageAge() method on Company type instance.
*/

public class CompanyTest {
    public static void main(String[] args) {

        Employee employee1 = new Employee("G", "Ç", 22);
        Employee employee2 = new Employee("S", "Sh", 21);
        Employee employee3 = new Employee("A", "M", 22);
        Employee employee4 = new Employee("A", "P", 23);
        Employee employee5 = new Employee("E", "R", 26);

        Employee[] employees = new Employee[] {employee1, employee2, employee3, employee4, employee5};

        Company company = new Company("Lufthansa");
        company.setEmployees(employees);

        System.out.println(company);
        System.out.println(company.getAverageAge());
    }
}
