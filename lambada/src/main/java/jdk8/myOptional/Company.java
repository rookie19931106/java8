package jdk8.myOptional;

import lombok.Data;

import java.util.List;

/**
 * @author jay
 * @date 2019/5/5 22:36
 */
@Data
public class Company {

    private String name;

    private List<Employee> employees;
}
