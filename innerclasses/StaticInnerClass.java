package innerclasses;
class OuterClass2 {
    private static String outerField = "Outer field";
    public static class InnerClass {
        public void innerMethod() {
            System.out.println("Accessing outer field: " + outerField);
        }
    }
}
public class StaticInnerClass {
    public static void main(String[] args) {
        OuterClass2.InnerClass innerObj = new OuterClass2.InnerClass();
        innerObj.innerMethod();
    }
}
//Accessing outer field: Outer field
//
//Process finished with exit code 0