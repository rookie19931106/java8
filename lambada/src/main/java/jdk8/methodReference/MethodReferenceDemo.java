package jdk8.methodReference;

import java.util.Arrays;
import java.util.List;

/**
 * @author jay
 * @date 2019/5/5 23:02
 */
public class MethodReferenceDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","you!");
        list.forEach(System.out::println);
    }


}
