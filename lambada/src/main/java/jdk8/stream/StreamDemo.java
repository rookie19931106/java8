package jdk8.stream;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author jay
 * @date 2019/5/6 22:06
 */
public class StreamDemo {
    public static void main(String[] args) {
        Stream stream = Stream.of("hello","world","hehe");
        String[] myArray = new String[]{"hello","world"};
        Stream<String> array = Stream.of(myArray);
        Stream stream1 = Arrays.stream(myArray);
    }
}
