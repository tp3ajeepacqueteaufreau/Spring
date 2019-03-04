package org.mines.douai.tp.spring;

import org.springframework.context.annotation.Configuration;

@Configuration
public interface YellowJacketBean {
    String getCountryName();
    
    YellowJacketServiceBean getYellowJacketServiceBean();
    
    void setYellowJacketServiceBean(YellowJacketServiceBean bean);
    
    String getYellowJacket();
    
}
