package Java_Test;

public class StudentMgnt {
    String name ,section;
    int rollNo ;

    public void studDetais(int rollNo,String name, String section)
    {
        this.rollNo=rollNo;
        this.name= name;
        this.section=section;
    }
    public void printDetails() {
        System.out.println("Student Name: " + name + ", Roll No: " +rollNo + ", Section: "+section);
    }

    public static void main(String[] args) {
        StudentMgnt sm1 = new StudentMgnt();
        StudentMgnt sm2 = new StudentMgnt();
        System.out.print("Details for Student 1: ");
       sm1.studDetais(2,"Sneha","A");
        sm1.printDetails();


        System.out.print("Details for Person 2: ");
        sm1.studDetais(3,"Sandip","B");
        sm2.printDetails();
    }
}
