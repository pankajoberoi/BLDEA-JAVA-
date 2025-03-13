package Week3.EmployeeManagement;

public class Person {

    private String name;
    private int age;
    private String contactNumber;

    
    public Person(String name, int age, String contactNumber) {
        this.name = name;
        this.age = age;
        this.contactNumber = contactNumber;
    }


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
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", contactNumber=" + contactNumber + "]";
    }

    
    
        
    
    
}
