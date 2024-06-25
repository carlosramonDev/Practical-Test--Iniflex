import model.Employee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // 3.1 
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operator"));
        employees.add(new Employee("João", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38"), "Operator"));
        employees.add(new Employee("Caio", LocalDate.of(1961, 5, 2), new BigDecimal("9836.14"), "Coordinator"));
        employees.add(new Employee("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Director"));
        employees.add(new Employee("Alice", LocalDate.of(1995, 1, 5), new BigDecimal("2234.68"), "Receptionist"));
        employees.add(new Employee("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operator"));
        employees.add(new Employee("Arthur", LocalDate.of(1993, 3, 31), new BigDecimal("4071.84"), "Accountant"));
        employees.add(new Employee("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45"), "Manager"));
        employees.add(new Employee("Heloísa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85"), "Electrician"));
        employees.add(new Employee("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93"), "Manager"));

        // 3.2 
        employees.removeIf(employee -> employee.getName().equals("João"));

        // 3.3 
        System.out.println("All employees:");
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        employees.forEach(employee -> {
            String formattedDate = employee.getBirthDate().format(dateFormatter);
            String formattedSalary = employee.getSalary().toString().replace('.', ',');
            System.out.println("Name: " + employee.getName() +
                    ", Birth Date: " + formattedDate +
                    ", Salary: R$ " + formattedSalary);
        });

        // 3.4 
        employees.forEach(employee -> {
            BigDecimal newSalary = employee.getSalary().multiply(new BigDecimal("1.10"));
            employee.setSalary(newSalary);
        });

        // 3.5 
        Map<String, List<Employee>> employeesByPosition = new HashMap<>();
        for (Employee employee : employees) {
            String position = employee.getPosition();
            if (!employeesByPosition.containsKey(position)) {
                employeesByPosition.put(position, new ArrayList<>());
            }
            employeesByPosition.get(position).add(employee);
        }

        // 3.6
        System.out.println("\nEmployees grouped by position:");
        employeesByPosition.forEach((position, empList) -> {
            System.out.println(position + ":");
            empList.forEach(emp -> {
                String formattedSalary = emp.getSalary().toString().replace('.', ',');
                System.out.println("\tName: " + emp.getName() +
                        ", Salary: R$ " + formattedSalary);
            });
        });

        // 3.8 
        System.out.println("\nEmployees with birthdays in October and December:");
        DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("MMMM");
        employees.stream()
                .filter(emp -> emp.getBirthDate().getMonth() == Month.OCTOBER || emp.getBirthDate().getMonth() == Month.DECEMBER)
                .forEach(emp -> {
                    String monthName = emp.getBirthDate().format(monthFormatter);
                    System.out.println(emp.getName() + " - Birthday in " + monthName);
                });
    }
}
