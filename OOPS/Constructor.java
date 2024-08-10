public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);

        Student s2 = new Student("Aswini");
        System.out.println(s2.name);

        Student s3 = new Student(123);
        System.out.println(s3.roll);
    }
}

class Student{
    String name;
    int roll;

    //Contructor
    Student(){
        System.out.println("Consturctor is called");
        
    }
    //Parameterized Constructor
    Student(String name){
        this.name = name;
    }

    Student(int roll){
        this.roll = roll;
    }
}
