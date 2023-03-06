package innerclasses;
interface Shape{
    void Area();
}
public class AnonymousClass {
    public static void main(String[] args) {
        Shape shape = new Shape() {
            @Override
            public void Area() {
                System.out.println("This is Area of Shape......");
            }
        };
        shape.Area();
    }
}
//This is Area of Shape......
//
//Process finished with exit code 0