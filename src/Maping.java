import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

@SuppressWarnings("OptionalGetWithoutIsPresent")
public class Maping {

    public static Map<String, Double> countOfAverageInPosition(List<Employee> staff) {
        Map<String, Double> positionCount = new HashMap<>();

       staff.stream().map(Employee::getPosition).forEach(position -> {
           if (!positionCount.containsKey(position)) {
               positionCount.put(position, (double) staff.stream().filter(p -> p.getPosition().equals(position)).mapToDouble(salary -> salary.getSalary().doubleValue()).average().getAsDouble());
           }
       });
        return positionCount;
    }

    public static Map<String, Integer> countOfEmployeesInPosition(List<Employee> staff) {
        Map<String, Integer> positionCount = new HashMap<>();

        staff.stream().map(Employee::getPosition).forEach(position -> {
            if (!positionCount.containsKey(position)) {
                positionCount.put(position, (int) staff.stream().filter(e -> e.getPosition().equals(position)).count());
            }
        });

        return positionCount;
    }

    public static Map<String, Integer> countOfEmployeesInAgeRange(List<Employee> staff) {
        Map<String, Integer> ageCount = new HashMap<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter, please, at what age to start");
        int ageFrom = scan.nextInt();
        System.out.println("Enter, please, at what age to complete");
        int ageTill = scan.nextInt();

        String key = "Age range " + String.valueOf(ageFrom) + "-" + String.valueOf(ageTill) + " years";

        if (ageTill >= ageFrom) {
            ageCount.putIfAbsent(key, (int) staff.stream().filter(age -> age.getAge() >= ageFrom && age.getAge() < ageTill).count());
        } else {
            System.out.println("Values are incorrect");
        }

        return ageCount;
    }

    public static Map<String, Integer> addRange(List<Employee> staff, Map<String, Integer> ageCount) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to add next range? Y/N");
        String choose = scan.nextLine();

        while (choose.equalsIgnoreCase("Y")) {
            System.out.println("Enter, please, at what age to start");
            int ageFrom = scan.nextInt();
            System.out.println("Enter, please, at what age to complete");
            int ageTill = scan.nextInt();

            String key = "Age range " + String.valueOf(ageFrom) + "-" + String.valueOf(ageTill) + " years";

            if (ageCount.containsKey(key)) {
                System.out.println("These ages are available");
            }

            if (ageTill >= ageFrom) {
                ageCount.put(key, (int) staff.stream().filter(age -> age.getAge() >= ageFrom && age.getAge() < ageTill).count());
            } else {
                System.out.println("Values are incorrect");
            }

            addRange(staff, ageCount);
        }

        return ageCount;
    }

    public static Map<String, Integer> fractionOfEmployeesInAgeRange(List<Employee> staff) {
        Map<String, Integer> fractionAge = new HashMap<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter, please, at what age to start");
        int ageFrom = scan.nextInt();
        System.out.println("Enter, please, at what age to complete");
        int ageTill = scan.nextInt();

        String key = String.valueOf(ageFrom) + "-" + String.valueOf(ageTill);

        if (ageTill >= ageFrom) {
            fractionAge.put(key, (int) staff.stream().filter(age -> age.getAge() >= ageFrom && age.getAge() < ageTill).count() / staff.size() * 100);
        } else {
            System.out.println("Values are incorrect");
        }

        return fractionAge;
    }

    public static Map<String, Integer> addFraction(List<Employee> staff, Map<String, Integer> fractionAge) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to add next range? Y/N");
        String choose = scan.nextLine();

        while (!choose.equalsIgnoreCase("Y")){
            System.out.println("Enter, please, at what age to start");
            int ageFrom = scan.nextInt();
            System.out.println("Enter, please, at what age to complete");
            int ageTill = scan.nextInt();

            String key = String.valueOf(ageFrom) + "-" + String.valueOf(ageTill);

            if (fractionAge.containsKey(key)) {
                System.out.println("These ages are available");
            }

            if (ageTill >= ageFrom) {
                fractionAge.put(key, (int) staff.stream().filter(age -> age.getAge() >= ageFrom && age.getAge() < ageTill).count() / staff.size() * 100);
            } else {
                System.out.println("Values are incorrect");
            }

            addFraction(staff, fractionAge);
        }

        return fractionAge;
    }
}
