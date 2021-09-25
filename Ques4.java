import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ques4 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(23,34567.45,"Vaishali"));
        employees.add(new Employee(28,25000.50,"Nidhi"));
        employees.add(new Employee(19,15000.45,"Sonia"));
        employees.add(new Employee(25,22567.45,"Sreyasi"));

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if(e1.getSalary() > e2.getSalary() )
                    return 1;
                else if(e1.getSalary() < e2.getSalary())
                    return -1;
                return 0;
            }
        });

        for(Employee emp:employees){
            System.out.println(emp);
        }
    }
}

class Employee{
    private double age;
    private double salary;
    private String name;

    Employee(){}

    public Employee(double age, double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "age=" + age +
                ", salary=" + salary +
                ", name='" + name ;
    }
}
