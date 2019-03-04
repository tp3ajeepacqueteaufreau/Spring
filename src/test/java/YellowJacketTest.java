import org.junit.Before;
import org.junit.Test;
import org.mines.douai.tp.spring.YellowJacketMain;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
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
        BigDecimal nb = yellowJacketMain.getAllemagne().getYellowJacketServiceBean().getPeopleCount(yellowJacketMain.getAllemagne().getCountryName());
        assertEquals(0, nb.compareTo(new BigDecimal(1000)));
    }
    
    @Test
    public void testNumberYellowJacketAfter2Call() {
        BigDecimal nb = yellowJacketMain.getFrance().getYellowJacketServiceBean().getPeopleCount(yellowJacketMain.getFrance().getCountryName());
        assertEquals(0, nb.compareTo(new BigDecimal(1000)));
        nb = yellowJacketMain.getFrance().getYellowJacketServiceBean().getPeopleCount(yellowJacketMain.getFrance().getCountryName());
        assertEquals(0, nb.compareTo(new BigDecimal(2000)));
    }
    
    @Test
    public void testNumberYellowJacketAfter5Call() {
        yellowJacketMain.getPologne().getYellowJacketServiceBean().getPeopleCount(yellowJacketMain.getPologne().getCountryName());
        yellowJacketMain.getPologne().getYellowJacketServiceBean().getPeopleCount(yellowJacketMain.getPologne().getCountryName());
        yellowJacketMain.getPologne().getYellowJacketServiceBean().getPeopleCount(yellowJacketMain.getPologne().getCountryName());
        yellowJacketMain.getPologne().getYellowJacketServiceBean().getPeopleCount(yellowJacketMain.getPologne().getCountryName());
        yellowJacketMain.getPologne().getYellowJacketServiceBean().getPeopleCount(yellowJacketMain.getPologne().getCountryName());
        BigDecimal nb = yellowJacketMain.getPologne().getYellowJacketServiceBean().getPeopleCount(yellowJacketMain.getPologne().getCountryName());
        
        assertEquals(0, nb.compareTo(new BigDecimal(6000)));
        
    }
}
