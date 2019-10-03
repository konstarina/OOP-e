public class Main {

    public static void main(String[] args){
        //creating object of a class
        Student ana = new Student("Ana", "20", 10.0);
        Student arina = new Student("Arina", "19", 9.9);
        Student mark = new Student("Mark", "23", 10.0);
        Student harry = new Student("Harry", "21", 10.0);
        Student ron = new Student("Ron", "21", 9.9);
        Student hermione = new Student("Hermione", "20", 10.0);

        Student[] Hogwarts = {harry, ron, hermione};
        Student[] Technical = {ana, arina};
        Student[] Harvard = {mark};

        University magic = new University("Hogwarts", "3", Hogwarts);
        University tech = new University("UTM", "2", Technical);
        University eng = new University("Harvard", "1", Harvard);

        System.out.println("Average of grades of Hogwarts University: "+magic.average());

        System.out.println("Average of grades of Technical University: "+tech.average());

        System.out.println("Average of grades of Harvard University: "+eng.average());

        System.out.println("Average of grades of all Universities: "+(magic.average()+tech.average()+eng.average())/3);
    }
}
