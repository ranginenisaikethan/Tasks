package JavaOOPSTask2;

class Employee {
    String name;
    int id;
    static int count;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        count++;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class EmployeeCount {
    public static void main(String[] args) {
        Employee e1 = new Employee("Kethan", 101);
        Employee e2 = new Employee("Rakesh", 102);
        Employee e3 = new Employee("Priya", 103);

        e1.display();
        e2.display();
        e3.display();

        System.out.println("Total number of employees: " + Employee.count);
    }
}
