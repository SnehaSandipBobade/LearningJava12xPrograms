package Java_Test;

public class Employee {
    private int id;
    private String name;
    private Double salary;
    public void SalaryDetais(int id, String name, double salary) {
        // 'this' keyword refers to the current object's instance variables
        this.id = id;
        this.name = name;
         this.salary = 0.0;
        System.out.println("Employee object created: " + name + " (ID: " + id + ")"+"Salary: "+salary);
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public void setDetails(int id,String name,double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        }
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id + ", Name: " + name + ", Salary: $" + String.format("%.2f", salary));
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.SalaryDetais(1001, "Kritvik", 50000);
    }
}