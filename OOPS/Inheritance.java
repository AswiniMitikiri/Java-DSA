public class Inheritance {
    public static void main(String[] args) {

        //Singe level Inheritance
        // Fish tuna = new Fish();
        // tuna.eat();   
        //extended the properties of base class in derived class

        // Multilevel Inheritance
        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);

        //Hierarchial Inheritance

    }
}

//Base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

//Derived class - Single level Inheritance

// class Fish extends Animal {
//     int fins;

//     void swim() {
//         System.out.println("swim in water");
//     }
// }

//------------------------------------------------------------------------------

//Derived class - Multilevel Inheritance

// class Mammals extends Animal {
//     int legs;
// }

// class Dog extends Mammals {
//     String breed;
// }

//---------------------------------------------------------

//Derived class - Hierarchial Inheritance

class Mammals extends Animal {
    void walk(){
        System.out.println("walks");
    }
}

class Fish extends Animal {
    void swim(){
        System.out.println("swim");
    }
}

class Bird extends Animal {
    void fly(){
        System.out.println("fly");
    }
}