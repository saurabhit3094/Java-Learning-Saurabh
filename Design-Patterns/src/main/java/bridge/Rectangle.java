package bridge;

public class Rectangle extends Shape {


    public Rectangle(Color color) {
        super(color);
    }

    public void applyColor() {
        System.out.print("Rectangle color is : " + color.applyColor());
    }

    public void doSomething(){
        System.out.print("Color is : " + color.applyColor());
    }
}
