package jdk8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jay
 * @date 2019/5/4 16:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String name = "张三";

    private int age = 20;
}
