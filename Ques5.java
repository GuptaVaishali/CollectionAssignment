import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Ques5 {
    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();
        students.add(new Student("Vaishali",99.78,24));
        students.add(new Student("Nidhi",90.78,27));
        students.add(new Student("Sreyasi",88.78,23));
        students.add(new Student("Ritika",99.78,22));

        Collections.sort(students, (s1, s2) -> {
            if(s1.getScore() > s2.getScore())
                return 1;
            else if(s1.getScore() < s2.getScore())
                return -1;
            else
                return s1.getName().compareTo(s2.getName());
        });

        for(Student student:students){
            System.out.println(student);
        }
    }
}

class Student{
    private String name;
    private double score;
    private double age;

    public Student(String name, double score, double age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", score=" + score +
                ", age=" + age;
    }
}
