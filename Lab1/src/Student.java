public class Student {
    //instance variables
    private String name;
    private String age;
    private double grade;

    //constructor declaration
    public Student(String name, String age, double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    //method
    public double getGrade()
    {
        return grade;
    }
}
