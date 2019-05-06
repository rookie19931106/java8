package jdk8;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author jay
 * @date 2019/5/4 16:48
 */
public class StudentTest {
    public static void main(String[] args) {
        Supplier<Student> supplier = () -> new Student();
        System.out.println(supplier.get().getName());
        System.out.println("--------------------");

        Supplier<Student> supplier1 = Student::new;
        System.out.println(supplier1.get().getAge());
    }
}
