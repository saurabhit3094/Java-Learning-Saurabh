package bridge;


public class Triangle extends Shape {

    Triangle(Color color){
        super(color);
    }

    public void applyColor() {
        System.out.println("Triangle color : " + color.applyColor());
    }
}
