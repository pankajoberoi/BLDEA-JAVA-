import java.util.Scanner;

class Student{

    String name;//instance varibale -> actual property of obejct
    int rollno;
    double marks;

    Student(){//default constructor
        name="xxxxx";
        rollno=00;
        marks=0.0;
        System.out.println("i am constructorrrrrr");
    }
    Student(String n,int rn,double m){//parameterized constructor
        name=n;
        rollno=rn;
        marks=m;
        // System.out.println(" i am in parameter wala constructor");
    }



}


public class Demo7 {
    public static void main(String[] args) {
        //Array of Objects
        // Student s1= new Student("Chutki",3,33.3);
        // Student s2 = new Student("Bheem",2,90.2);

        // System.out.println(s1.name + " " + s1.rollno + " " + s1.marks);
        // System.out.println(s2.name + " " + s2.rollno + " " + (s2.marks+10.0));


        // System.out.println(s1.name + " " + s1.rollno + " " + s1.marks);


        // Student Students[] = {s1,s2};

        // for(Student i:Students){
        //     System.out.println(i.name+ " "+ i.rollno + " "+ i.marks);
        // }

        Student student[]= new Student[3];
        Scanner sc= new Scanner(System.in);

        for(int i=0;i<student.length;i++){
            System.out.println("Enter name for " + (i+1) + " student");
            String name=sc.nextLine();
            

            System.out.println("Enter Roll No. for " + (i+1) + " student");
            int rollno=sc.nextInt();
            

            System.out.println("Enter marks for " + (i+1) + " student");
            double marks=sc.nextDouble();
            sc.nextLine();

            Student s= new Student(name,rollno,marks);

            student[i]=s;

        }

        System.out.println("printing details of students entered......");

        for(Student i:student){
            System.out.println(i.name+ " "+ i.rollno + " "+ i.marks);
        }




        


    }
}
