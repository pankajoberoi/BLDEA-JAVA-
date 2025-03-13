package Week3.EmployeeManagement;


// Create a Manager class that extends Employee with:
// teamSize (int)
// Use super to call the parent class constructor

public class Manager extends Employee{
    private int teamSize;

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
    
    Manager(String name, int age, String contactNumber,String employeeId, String department, double salary,int teamSize){

        super(name, age, contactNumber, employeeId, department, salary);

        this.teamSize=teamSize;
    }

    @Override
    public String toString() {
        return  super.toString() + " Manager [teamSize=" + teamSize + "]";
    }

    
    


    
}
