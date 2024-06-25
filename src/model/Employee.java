package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee extends Person {
    private BigDecimal salary;
    private String position;

    public Employee(String name, LocalDate birthDate, BigDecimal salary, String position) {
        super(name, birthDate);
        this.salary = salary;
        this.position = position;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary: " + salary + ", Position: " + position;
    }
}
