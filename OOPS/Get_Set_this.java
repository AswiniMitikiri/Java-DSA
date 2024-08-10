public class Get_Set_this {
    public static void main(String[] args){
        //main function has be public and static as well(mandatory)
        Pen p1 = new Pen();  // created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getcolor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        //p1.setColor("yellow");
        p1.setColor("yellow"); 
        System.out.println(p1.getcolor());
    }
    
}
   
class Pen{
    private String color;
    private int tip;

    String getcolor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int tip){
        this.tip = tip;
    }

}


