package jc01_2020.avramkov.Atest.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        //StartWork startWork = (name, startDate, years) -> new Employee(name, startDate, years); аналогично тому, что ниже
        StartWork startWork = Employee::new;
        employees.add(startWork.hire("Boris Johnson", LocalDate.of(2019,03,10), 1));


        Date now1 = new Date();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.nextLine().equals("exit")) {
                break;
            }
            List<Employee> fired = new ArrayList<>();

            String result = employees.stream()
                    .filter(employee -> employee.isFire(now1.getNow()))
                    .peek(fired::add)
                    .map(employee -> employee.checkTerm(now1.getNow()))
                    .filter(Objects::nonNull)
                    .collect(Collectors.joining("\n"));
            System.out.println(now1.now);
            System.out.println(result);
            fired.stream().forEach(employee -> employee.notified());
            now1.increment();

        }

    }
}

/*                new StartWork() {
            @Override
            public Employee hire(String name, LocalDate startDate, int years) {
                return null;
            }
        };*/