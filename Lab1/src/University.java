public class University {
    //instance variables
    private String name; //name of institution, instance variables
    private String numStud; //number of students
    Student[] student;

    public University(String name, String numStud, Student[] student){
        //constructor declaration of a class
        this.name = name;
        this.numStud = numStud;
        this.student = student;
    }
    public double average(){
        //method 1
        double result = 0;
        for (int i = 0; i < student.length; i++){
            result += student[i].getGrade();
        }

        return result / student.length;

    }

    public double averageUni()
    //method 2
    {
        return average();
    }
}
