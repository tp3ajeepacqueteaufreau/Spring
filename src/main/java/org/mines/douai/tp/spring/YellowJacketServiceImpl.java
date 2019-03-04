package org.mines.douai.tp.spring;

import org.springframework.context.annotation.Scope;

import java.math.BigDecimal;
import java.util.Map;

@Scope("prototype")
public class YellowJacketServiceImpl implements YellowJacketServiceBean {
    
    Map<String, BigDecimal> yellowJacket;
    
    
    @Override
    public BigDecimal getPeopleCount(String country) {
        BigDecimal deci = yellowJacket.getOrDefault(country, new BigDecimal(0));
        deci = deci.add(new BigDecimal(1000));
        yellowJacket.put(country, deci);
        return deci;
    }
    
    
}
