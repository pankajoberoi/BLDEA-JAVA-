package Week3.EmployeeManagement;

// In Main class:
// Create an array of 5 Employee objects
// Create at least one Manager object
// Find and display all employees with a salary greater than 50,000
// Compare two Employee objects using equals()

public class Demo {
    public static void main(String[] args) {
        
        Employee employees[] = new Employee[3];

        employees[0]=new Employee("Pankaj", 25, "8360001234","cap123" ,"Sales", 100000);
        employees[1]=new Employee("Rajat", 29, "90909090","adv123" ,"Testing", 40000);
        employees[2]=new Employee("Eshan", 22, "202020202","ire123" ,"Development", 80000);


        Manager manager= new Manager("Anuj", 40, "202020202", "cap9090", "FS", 50000, 3);

        // for(Employee e:employees){
        //     System.out.println(e);
        //     System.out.println();
        // }


        // System.out.println("Annual salaries of my Employees");
        // for(Employee e : employees){
        //     System.out.println("Annual salary of " + e.getName() + " is " + e.getAnnualSalary());
        // }

        // System.out.println("Manager Details..");
        // System.out.println(manager);


        // System.out.println("Annual salary of : " + manager.getName() + " is " + manager.getAnnualSalary());
        

        // Find and display all employees with a salary greater than 50,000
        // System.out.println("Employess with salary > 50000");
        // for(Employee e : employees){
        //     if(e.getSalary()>50000){
        //         System.out.println(e.getName());
        //     }
        // }

        Employee emp1=employees[0];
        Employee emp2=employees[2];

        if(emp1.equals(emp2)){
            System.out.println("Both the employees are same");
        }
        else{
            System.out.println("They are different Employees");
        }


    }
}
