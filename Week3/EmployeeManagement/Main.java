package EmployeeManagement;

// Base class Person
class Person {
    private String name;
    private int age;
    private String contactNumber;

    // Constructor
    public Person(String name, int age, String contactNumber) {
        this.name = name;
        this.age = age;
        this.contactNumber = contactNumber;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    // toString() method to display person details
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Contact: " + contactNumber;
    }
}

// Derived class Employee from Person
class Employee extends Person {
    private String employeeId;
    private String department;
    private double salary;

    // Constructor using super keyword
    public Employee(String name, int age, String contactNumber, String employeeId, String department, double salary) {
        super(name, age, contactNumber);
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

    // Getters and Setters
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Overriding toString() to display employee details
    @Override
    public String toString() {
        return super.toString() + ", Employee ID: " + employeeId + ", Department: " + department + ", Salary: " + salary;
    }

    // Final method to calculate annual salary
    public final double getAnnualSalary() {
        return salary * 12;
    }

    // equals() method to compare two employees based on employeeId
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return this.employeeId.equals(employee.employeeId);
    }
}

// Derived class Manager from Employee
class Manager extends Employee {
    private int teamSize;

    // Constructor using super keyword
    public Manager(String name, int age, String contactNumber, String employeeId, String department, double salary, int teamSize) {
        super(name, age, contactNumber, employeeId, department, salary);
        this.teamSize = teamSize;
    }

    // Getters and Setters
    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    // Overriding toString() to display manager details
    @Override
    public String toString() {
        return super.toString() + ", Team Size: " + teamSize;
    }
}

// Main class to execute the program
public class Main {
    public static void main(String[] args) {
        // Creating an array to store Employee objects
        Employee[] employees = new Employee[3];

        // Hardcoded employee data
        employees[0] = new Employee("John Doe", 30, "1234567890", "E101", "IT", 60000);
        employees[1] = new Employee("Jane Smith", 28, "0987654321", "E102", "Finance", 55000);
        employees[2] = new Employee("Michael Johnson", 35, "1122334455", "E103", "HR", 65000);

        // Hardcoded manager data
        Manager manager = new Manager("Sarah Wilson", 40, "6677889900", "M101", "Operations", 80000, 5);

        // Display all employees
        System.out.println("===== Employee Details =====");
        for (Employee e : employees) {
            System.out.println(e);
            System.out.println("Annual Salary: " + e.getAnnualSalary());
            System.out.println("------------------------------");
        }

        // Display manager details
        System.out.println("\n===== Manager Details =====");
        System.out.println(manager);
        System.out.println("Annual Salary: " + manager.getAnnualSalary());
        System.out.println("------------------------------");

        // Find employees with salary greater than 55000
        System.out.println("\n===== Employees with Salary Greater than 55000 =====");
        for (Employee e : employees) {
            if (e.getSalary() > 55000) {
                System.out.println(e);
            }
        }

        // Comparing two employees using equals()
        System.out.println("\n===== Comparing Two Employees =====");
        Employee emp1 = employees[0];
        Employee emp2 = employees[2];

        if (emp1.equals(emp2)) {
            System.out.println("Both employees are the same.");
        } else {
            System.out.println("Employees are different.");
        }
    }
}

