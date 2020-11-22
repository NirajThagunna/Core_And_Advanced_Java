package generics;

public class Student {
    private int roll_no;
    private String name;

    // Default Constructor
    public Student() {
        roll_no = 0;
        name = "";
    }

    // Parameterized Constructor
    public Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
    // This two functions are also called Method overloading or Constructor Overloading

    // Getter
    public int getRoll_no() {
        return roll_no;
    }

    public String getName() {
        return name;
    }

    // Setter
    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return (this.roll_no + " " + this.name);
    }
}
