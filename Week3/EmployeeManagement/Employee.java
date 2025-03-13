package Week3.EmployeeManagement;


// Create a derived class Employee that extends Person with:
// employeeId (String)
// department (String)
// salary (double)
// Override toString() to display employee details
// Create a final method getAnnualSalary() that returns the yearly salary

public class Employee extends Person{
    private String employeeId;
    private String department;
    private double salary;

    
    
    public Employee(String name, int age, String contactNumber,String employeeId, String department, double salary) {
        super(name,age,contactNumber);
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

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

    @Override
    public String toString() {
        return  super.toString() +" Employee [employeeId=" + employeeId + ", department=" + department + ", salary=" + salary + "]";
    }

    public final double getAnnualSalary(){
        return salary*12;
    }

    
    @Override
    public boolean equals(Object obj) {
        Employee other = (Employee) obj;
        if (employeeId == null) {
            if (other.employeeId != null)
                return false;
        } else if (!employeeId.equals(other.employeeId))
            return false;
        return true;
    }

    
   

    

}
