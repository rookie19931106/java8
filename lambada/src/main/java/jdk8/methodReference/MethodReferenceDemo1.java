package jdk8.methodReference;

import java.util.Arrays;
import java.util.List;

/**
 * @author jay
 * @date 2019/5/5 23:02
 */
public class MethodReferenceDemo1 {
    public static void main(String[] args) {
        Student student = new Student("小迷茫",12);
        Student student1 = new Student("要命",32);
        Student student2 = new Student("易建联",34);

        List<Student> students = Arrays.asList(student,student1,student2);
        students.sort((studentNew,studentNew2) -> Student.compareByScore(studentNew,studentNew2));
        students.forEach(student3 -> System.out.println(student3.getScore()));
        students.sort(Student::compareByName);
        students.forEach(student3 -> System.out.println(student3.getScore()));
        
    }


}
