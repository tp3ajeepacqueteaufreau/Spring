import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

public class ApplicationTest {
    
    @Test
    public void should_Inject() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("simpleContext.xml");
        ((ClassPathXmlApplicationContext) applicationContext).refresh();
        SimpleBeanInjection simpleBeanInjection = applicationContext.getBean("SimpleBeanInjection", SimpleBeanInjection.class);
        
        assertNotNull(simpleBeanInjection.getSimpleBean());
    }
    
}
