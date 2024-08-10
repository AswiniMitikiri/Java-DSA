public class Copy_Constructor {
    public static void main(String[] args) {
        St s1 = new St();
        s1.name = "Aswini";
        s1.roll = 123;
        s1.password = "abcd";
        s1.marks[0]= 100;
        s1.marks[1]= 98;
        s1.marks[2] = 80;

        St s2 = new St(s1);  //copy
        s2.password = "xyz";
        s1.marks[2] = 100;

        for(int i = 0; i < 3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class St{
    String name;
    int roll;
    String password;
    int marks[] = new int[3];

    //Shallow copy constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    //Deep copy constructor
    St(St s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i = 0; i < marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }


    //Contructor
    St(){
        System.out.println("Consturctor is called");
        
    }
    //Parameterized Constructor
    St(String name){
        this.name = name;
        marks = new int[3];
    }

    St(int roll){
        this.roll = roll;
        marks = new int[3];
    }
}
