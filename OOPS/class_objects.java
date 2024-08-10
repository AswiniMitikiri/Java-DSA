public class class_objects{
    public static void main(String[] args){
        //main function has be public and static as well(mandatory)
        Pen p1 = new Pen();  // created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        //p1.setColor("yellow");
        p1.color = "yellow";
        System.out.println(p1.color);
    }

}

    class Pen{
        String color;
        int tip;

        void setColor(String newColor){
            color = newColor;
        }

        void setTip(int newTip){
            tip = newTip;
        }

    }

    class Student{
        String studentName;
        int age;
        float percentage;

        void calcPercentage(int math, int phy, int chem){
            percentage = (math+phy+chem) / 3;
        }
    }
