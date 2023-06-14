package org.example;

import org.example.configuration.MyConfig;
import org.example.entity.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
       AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication =ctx.getBean("communication",Communication.class);
        List<Employee> allEmployees =communication.getAllEmployees();
        System.out.println(allEmployees);

        Employee empById=communication.getEmployee(3);
        System.out.println(empById);
        Employee emp = new Employee("Sveta","Sokolova","IT",890);

        communication.saveEmployee(emp);
        communication.deleteEmployee(9);

    }
}
