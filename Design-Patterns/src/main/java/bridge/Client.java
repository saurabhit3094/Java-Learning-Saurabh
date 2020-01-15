package bridge;

public class Client {
    public static void main(String[] args) {
        Triangle tr = new Triangle(new Blue());

        tr.applyColor();

        Rectangle rec = new Rectangle(new Red());
        rec.doSomething();
    }
}
