package org.mines.douai.tp.spring;

public interface YellowJacketBean {
    String getCountryName();
    
    YellowJacketServiceBean getYellowJacketServiceBean();
    
    void setYellowJacketServiceBean(YellowJacketServiceBean bean);
    
}
