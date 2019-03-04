import org.junit.Before;
import org.junit.Test;
import org.mines.douai.tp.spring.YellowJacketMain;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

public class YellowJacketTest {
    
    private YellowJacketMain yellowJacketMain;
    
    @Before
    public void beforeTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("YellowJacket.xml");
        ((ClassPathXmlApplicationContext) applicationContext).refresh();
        yellowJacketMain = applicationContext.getBean("jacketMain", YellowJacketMain.class);
    }
    
    @Test
    public void testYellowJacketNotNullBean() {
        assertNotNull(yellowJacketMain.getFrance());
        assertNotNull(yellowJacketMain.getAllemagne());
        assertNotNull(yellowJacketMain.getPologne());
    }
    
    @Test
    public void testNumberOfYellowJacket() {
        yellowJacketMain.printYellowJacket();
    }
}
