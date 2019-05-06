package jdk8.stream;

import java.util.stream.IntStream;

/**
 * @author jay
 * @date 2019/5/6 22:11
 */
public class StreamTest {
    public static void main(String[] args) {
        IntStream.of(new int[]{4,6,7,8}).forEach(System.out::println);
        System.out.println("----------------");
        IntStream.range(3,8).forEach(System.out::println);
    }
}
