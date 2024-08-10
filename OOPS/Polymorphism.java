public class Polymorphism {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println(calc.sum(4, 5));
        System.out.println(calc.sum((float)4.5, (float)5.5));
        System.out.println(calc.sum(4, 5, 6));

        Deer d = new Deer();
        d.eat();
    }
}

//Method Overloading
class Calculator {
    int sum(int a, int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }
}

//Method Overriding

class Animal{
    void eat(){
        System.out.println("eats food");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}