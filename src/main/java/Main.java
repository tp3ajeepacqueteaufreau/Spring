import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        SimpleBeanInjection beanInjection = applicationContext.getBean("SimpleBeanInjection", SimpleBeanInjection.class);
        
    }
}
