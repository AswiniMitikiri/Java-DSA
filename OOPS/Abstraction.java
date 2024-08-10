public class Abstraction {
    public static void main(String[] args){
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken C = new Chicken();
        C.eat();
        C.walk();

        System.out.println(h.color);

        //Heirarchy of the Mulitlevel Inheritance: Animal -> Horse -> Mustang
        Mustang M = new Mustang();
        
    }
}


//Can not create object of abstract class
abstract class Animal{
    String color;

    Animal(){

        System.out.println("Animal Constructor called");
        color = "brown";
    }

    //Non anstract method
    void eat(){
        System.out.println("animal eats");
    }
    // abstract method as this method does not implement anything
    abstract void walk();   
    // this only gives an idea here
    // implementation of this abstract method depends on horse class and chicken class
}

class Horse extends Animal{    

    Horse(){
        System.out.println("Horse constructor called");
    }

    void changeColor(){
        color = "Dark brown";
    }

    //walk method is mandatory in horse class as it extends animal class
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor called");
    }
}

class Chicken extends Animal{

    void changeColor(){
        color = "yellow";
    }

    //walk method is mandatory in chicken class as it extends animal class
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
