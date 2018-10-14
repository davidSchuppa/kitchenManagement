import java.text.SimpleDateFormat;
import java.util.Date;


public class Employee {

    private String name;
    private String birthDate;
    private double salary;

    public Employee(String name, String birthDate, double salary)   {
        this.name = name;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    private double getTax(){
        return salary * 0.99;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name= '" + name + '\'' +
                ", birthDate= " + birthDate +
                ", salary= " + salary +
                ", tax= " + getTax() +
                '}';
    }
}
