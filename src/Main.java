import model.Employee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

        // Print 
        employees.forEach(System.out::println);
    }
}
