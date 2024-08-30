import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //create a new instance of spring context
        ApplicationContext context = new AnnotationConfigApplicationContext();
        Parrot parrot  = new Parrot();
    }
}
