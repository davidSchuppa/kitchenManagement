import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;
import java.util.zip.DataFormatException;

public class Kitchen {
    public static List<Employee> employees = new ArrayList<Employee>();


    public static void init(){
        /* Enter date in String forma "dd/mm/yyyy" */
            employees.add(new Employee("Sweeney Todd", "02/05/1987", 1000.0));
            employees.add(new Employee("Connan", "06/08/1978", 2000.50));
            employees.add(new Employee("Joan", "29/12/1991", 4000.50));
            System.out.println("Wrong date format");
        for(Employee employee : employees){
            System.out.println(employee.toString());
        }
    }
    public static void main(String[] args) {
        init();

    }
}
