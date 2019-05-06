package jdk8;

import java.util.function.Supplier;

/**
 * @author jay
 * @date 2019/5/4 16:43
 * Supplier 无参返回
 */
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> supplier = () ->"hello world";
    }
}
