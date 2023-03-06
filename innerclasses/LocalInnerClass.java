package innerclasses;
class OuterClass {
    public void outerMethod() {
        System.out.println("Inside outer method ,Outside inner class");
        class InnerClass {
            public void innerMethod() {
                System.out.println("Inside inner method");
            }
        }
        InnerClass innerObj = new InnerClass();
        innerObj.innerMethod();
    }
}
public class LocalInnerClass {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.outerMethod();
    }
}
//Inside outer method ,Outside inner class
//Inside inner method
//
//Process finished with exit code 0