package jdk8.myOptional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author jay
 * @date 2019/5/5 22:37
 */
public class OptionalTest1 {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("张三");

        Employee employee1 = new Employee();
        employee1.setName("李四");

        Company company = new Company();
        company.setName("huawei");
        List<Employee> list = Arrays.asList(employee,employee1);
//        company.setEmployees(list);

        List<Employee> employees = company.getEmployees();
        Optional<Company> company1 = Optional.ofNullable(company);
        System.out.println(company1.map(theCompany -> theCompany.getEmployees())
                .orElse(Collections.emptyList()));
    }
}
