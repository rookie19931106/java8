package jdk8.myOptional;

import java.util.Optional;

/**
 * @author jay
 * @date 2019/5/5 22:19
 */
public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        optional.ifPresent(item -> System.out.println(item));
        System.out.println("------------------------------");
        System.out.println(optional.orElseGet(() -> String.valueOf(12+12)));
    }
}
