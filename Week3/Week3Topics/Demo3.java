package Week3Topics;

class Student extends Object{
    int rollno;
    String name;
    String designation;

    
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + ", designation=" + designation + "]";
    }


    
    


    
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (designation == null) {
            if (other.designation != null)
                return false;
        } else if (!designation.equals(other.designation))
            return false;
        return true;
    }
    
    
    // public String toString() {
    //     return "Student [rollno=" + rollno + ", name=" + name +  "]";
    // }
   
    // public boolean equals(Student that){

    // //    boolean result= this.name.equals(that.name) && this.rollno==that.rollno;

    //     boolean result=this.designation.equals(that.designation);

    //     return result;
        

    // }
    

    
    

}

public class Demo3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno=1;
        s1.name="Chinki";
        s1.designation="Developer";
        // System.out.println(s1);

        Student s2 = new Student();
        s2.rollno=2;
        s2.name="Pinki";
        s2.designation="Tester";


        System.out.println(s1.equals(s2)); 

        //s2.equals(s1);

        

        // System.out.println(s1==s2);-> false 

    }
}
