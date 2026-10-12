import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task3  {
    public String namee;
    public String department;
    public int salary;
    public int age;

    public Task3(String namee, String department, int salary, int age) {
        this.namee = namee;
        this.department = department;
        this.salary = salary;
        this.age = age;
    }

    public String getNamee() {
        return namee;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args){
        List<Task3> employee= new ArrayList<>();
        employee.add(new Task3("anna","IT",2200,23));
        employee.add(new Task3("tom","DevOps",1200,27));
        employee.add(new Task3("reacher","Analytics",1800,36));
        employee.add(new Task3("jeame","Cybersecurity",2600,41));
        employee.add(new Task3("jon","Software Development",800,21));
        employee.add(new Task3("kyle","IT",4000,38));
        employee.add(new Task3("jon","Software Development",800,21));
        employee.add(new Task3("nebi","IT",1300,23));

        String topSalary= employee.stream().max(Comparator.comparing(Task3::getSalary)).map(Task3::getNamee).orElse("nothing");
        double avarageSalary = employee.stream().mapToInt(Task3::getSalary).average().orElse(0);
        int total=employee.stream().filter(n->n.getAge()>30).mapToInt(Task3::getSalary).sum();
        System.out.println(topSalary);
        System.out.println(avarageSalary);
        System.out.println(total);

    }
}
