class Student{
    private int attendance;

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public void showAttendance(){
        System.out.println(this.attendance + " is your attendance");
    }

    

}
class Teacher extends Student{
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public void updateAttendance(int days){
        setAttendance(days);
    }

    public void showSalary(){
        System.out.println(this.salary + " is your salary");
    }


}
class Director extends Teacher{

    public void IncrementSalary(int inc){
        int salary=getSalary();
        setSalary(salary+inc);
    }

}






public class Demo15{
    public static void main(String[] args) {
        
    }
}