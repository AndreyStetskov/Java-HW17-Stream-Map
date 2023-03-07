import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Fraction of odd numbers is " + String.format("%.2f", RandomNumberStream.oddNumberFraction(10000)) + "%");

        System.out.println("------------------------------------------");

        List<Employee> staff = new ArrayList<>();
        Employee first = new Employee("Sam", "Smith", 40, "Retail Sales Representative", new BigDecimal("30.824"));
        Employee second = new Employee("Christopher", "Johnson", 25, "Office Clerk", new BigDecimal("27.617"));
        Employee third = new Employee("Jenifer", "Williams", 18, "Customer Service Representative", new BigDecimal("29.624"));
        Employee fourth = new Employee("Katherine", "Miller", 38, "Accountant", new BigDecimal("52.548"));
        Employee fifth = new Employee("John", "Wilson", 29, "Marketing managers", new BigDecimal("103.440"));
        Employee sixth = new Employee("Jason", "Davis", 60, "CEO", new BigDecimal("413.020"));
        Employee seventh = new Employee("Bruce", "Jackson", 47, "Computer and Information Systems Manager", new BigDecimal("162.930"));
        Employee eighth = new Employee("Gabriel", "Thompson", 21, "Lawyer", new BigDecimal("127.990"));
        Employee ninth = new Employee("Mia", "Robinson", 33, "Software developer", new BigDecimal("93.948"));
        Employee tenth = new Employee("Alisa", "Torres",42, "Administrative assistant", new BigDecimal("48.092"));
        Employee eleventh = new Employee("Elliott", "Adams",56, " Mechanic", new BigDecimal("57.110"));

        staff.add(first);
        staff.add(second);
        staff.add(third);
        staff.add(fourth);
        staff.add(fifth);
        staff.add(sixth);
        staff.add(seventh);
        staff.add(eighth);
        staff.add(ninth);
        staff.add(tenth);
        staff.add(eleventh);

        Maping.countOfAverageInPosition(staff);
        Maping.countOfAverageInPosition(staff).forEach((k, v) -> System.out.print("Position: " + k + ", average salary: " + v + "  "));

        System.out.println();
        System.out.println("------------------------------------------");

        Maping.countOfEmployeesInPosition(staff);
        Maping.countOfEmployeesInPosition(staff).forEach((k, v) -> System.out.print("Position:" + k + ", number of employees: " + v + "  "));

        System.out.println();
        System.out.println("------------------------------------------");

        Maping.countOfEmployeesInAgeRange(staff);
        Maping.addRange(staff, Maping.countOfEmployeesInAgeRange(staff));
        Maping.addRange(staff, Maping.countOfEmployeesInAgeRange(staff)).forEach((k, v) -> System.out.print("Number of employees: " + v + " in age range " + k + "  "));

        System.out.println();
        System.out.println("------------------------------------------");
        Maping.fractionOfEmployeesInAgeRange(staff);
        Maping.addFraction(staff, Maping.fractionOfEmployeesInAgeRange(staff));
        Maping.addFraction(staff, Maping.fractionOfEmployeesInAgeRange(staff)).forEach((k, v) -> System.out.print("Fraction of employees: " + v + "% in age range " + k + "  "));
    }
}