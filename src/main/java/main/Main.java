package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //instruct application context instance to use configuration class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Supplier<Parrot> parrotSupplier = () -> {
            Parrot p = new Parrot();
            p.setName("Kiki");
            return p;
        };

        context.registerBean("parrot1", Parrot.class, parrotSupplier);
        Parrot p = context.getBean(Parrot.class); //verify that bean is now in Spring context
        System.out.println("p.getName() = " + p.getName());
    }
}
