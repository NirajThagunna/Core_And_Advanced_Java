package generics;

// We use < > to specify parameter type
class Test<T, U> {
    // An objects of type T and U are declared
    T obj1;
    U obj2;

    // Constructor
    public Test(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    // Getter
    public T getObj1() {
        return obj1;
    }

    public U getObj2() {
        return obj2;
    }

    // Setter
    public void setObj1(T obj1) {
        this.obj1 = obj1;
    }

    public void setObj2(U obj2) {
        this.obj2 = obj2;
    }

    // Method
    public void print() {
        System.out.println(getObj1() + ", " + getObj2());
    }

    // Generic method
    public static <T, U> void display(T ele1, U ele2) {
        System.out.println(ele1.getClass().getName() + " = " + ele1);
        System.out.println(ele2.getClass().getName() + " = " + ele2);
    }
}
public class GenericClass {
    public static void main(String[] args) {
        Test iObj = new Test(1, "Niraj Thagunna");
        iObj.print();
        iObj.setObj1(279884939.9878748);
        iObj.setObj2("Ohh Awesome!");
        iObj.print();
        iObj.setObj1('N');
        iObj.setObj2("Yeah, all right bro! You will do it.");
        iObj.print();
        Test.display("last",399770938.8757900);

        Student student = new Student(6317080, "Niraj Thagunna");
        iObj.setObj1(student.getRoll_no());
        iObj.setObj2(student.getName());
        iObj.print();
    }
}
