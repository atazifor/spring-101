package main;

import config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //instruct application context instance to use configuration class
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        //parrot is now part of context
        Parrot p = context.getBean("miki", Parrot.class);
        System.out.println("p.getName() = " + p.getName());

        String s = context.getBean(String.class);
        System.out.println("string = " + s);

        Integer n = context.getBean(Integer.class);
        System.out.println("n = " + n);
    }
}
