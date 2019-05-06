package jdk8.methodReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jay
 * @date 2019/5/5 23:12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private String name;

    private int score;

    public static int compareByScore(Student student,Student other){
        return student.getScore() - other.getScore();
    }

    public static int compareByName(Student student,Student other){
        return student.getName().compareTo(other.getName());
    }
}
