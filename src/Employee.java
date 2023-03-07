import java.math.BigDecimal;
import java.util.Objects;

public class Employee {
    private String name;
    private String lastName;
    private int age;
    private String position;
    private BigDecimal averageAnnualSalary;


    public Employee(String name, String lastName, int age, String position, BigDecimal salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
        this.averageAnnualSalary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public BigDecimal getSalary() {
        return averageAnnualSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(lastName, employee.lastName) && Objects.equals(position, employee.position) && Objects.equals(averageAnnualSalary, employee.averageAnnualSalary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age, position, averageAnnualSalary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", salary=" + averageAnnualSalary +
                '}';
    }

    public void setSalary(BigDecimal salary) {
        this.averageAnnualSalary = salary;
    }
}
