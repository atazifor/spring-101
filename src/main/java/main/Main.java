package main;

import config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //instruct application context instance to use configuration class
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        //parrot is now part of context
        Parrot p = context.getBean(Parrot.class);
        System.out.println("p = " + p);
        System.out.println("p.getName() = " + p.getName());
    }
}
