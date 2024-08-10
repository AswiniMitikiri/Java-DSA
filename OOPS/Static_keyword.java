public class Static_keyword {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.schoolName = "DAV";

        Student1 s2 = new Student1();
        System.out.println(s2.schoolName);

        Student1 s3 = new Student1();
        s3.schoolName = "Narayana";

    }
}



class Student1{
    String name;
    int roll;

    static String schoolName;

    static int returnPercentage(int math, int phy, int chem){
        return (math + phy + chem) / 3;
    }

    void getName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}