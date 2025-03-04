class Student {
    int rollno;
    String name;
    int marks;
    
}


public class Demo5 {

    

    public static void main(String[] args) {
        
        Student s1= new Student();
        s1.rollno=1;
        s1.name="Pankaj";
        s1.marks=95;

        Student s2= new Student();
        s2.rollno=2;
        s2.name="Khushi";
        s2.marks=98;

        Student s3= new Student();
        s3.rollno=3;
        s3.name="Eshan";
        s3.marks=80;

        Student students[] = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name + " : " + students[i].rollno);
        }

        for(Student i : students){//enhanced for loop
            System.out.println(i.name + " : " + i.rollno);
        }

        //printArray(students);

    }
}
