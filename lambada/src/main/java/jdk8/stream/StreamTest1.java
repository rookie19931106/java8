package jdk8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author jay
 * @date 2019/5/6 22:19
 */
public class StreamTest1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(list.stream().map(integer -> 2*integer)
                .reduce(0,Integer::sum));
    }
}
