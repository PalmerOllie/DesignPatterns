package designPatterns.structural.adapterExample;

import designPatterns.DesignPatternExample;

import java.util.ArrayList;
import java.util.List;

public class AdapterExample extends DesignPatternExample {
    @Override
    protected void run() {
        System.out.println("It's fine if we implement a class from scratch that conforms to our interface such as the EmployeeDB class in this example (implements interface 'Empoyee')");
        System.out.println("However, if we are working with Legacy code, we will probably need to interact with it through an interface still but it may not conform to that interface.");
        System.out.println("If we cannot change the legacy code, the next best alternative is to use the Adapter pattern");
        System.out.println("The adapter is a layer in between our service and the legacy code that wraps the legacy code and specifies how it should implement the interface");

        System.out.println("\nIn this example, our legacy code is an old service that uses LDAP (look at the EmployeeLDAP class)");
        System.out.println("The EmployeeLdapAdapter class wraps the EmployeeLDAP class and now allows us to talk to the legacy code through the interface Employee.");

        getEmployeeList();


        System.out.println("The Adapter allowed us to get employees from legacy code and treat this legacy code in the same way we would with our classes.");
        System.out.println("A new Adapter class is needed for each type of legacy code that we want to interact with. E.g LDAP or CSV files or Excel");
    }


    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();


        //Here we have a database that conforms to our interface Employee
        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "JohnWick@continental.com");
        employees.add(employeeFromDB);
        System.out.println("\nEmployee retrieved from DB: ");
        printEmployee(employeeFromDB);

        //Our legacy EmployeeLDAP does NOT conform to our interface Employee so we wrap it in an adapter class
        Employee employeeFromLdap = new EmployeeLdapAdapter( new EmployeeLdap("chewie","Solo","Han", "Han@Solo.com"));
        employees.add(employeeFromLdap);
        System.out.println("\nEmployee retrieved from LDAP: ");
        printEmployee(employeeFromLdap);

        return employees;
    }

    private void printEmployee(Employee employee) {
        System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName() + "\nEmail: " + employee.getEmail() + "\nID: " + employee.getId());
    }
}
