package org.mines.douai.tp.spring;

public class YellowJacketBeanImplementation implements YellowJacketBean {
    String name;
    YellowJacketServiceBean yellowJacketServiceBean;
    
    @Override
    public String getCountryName() {
        return this.name;
    }
    
    @Override
    public YellowJacketServiceBean getYellowJacketServiceBean() {
        return this.yellowJacketServiceBean;
    }
    
    @Override
    public void setYellowJacketServiceBean(YellowJacketServiceBean bean) {
        this.yellowJacketServiceBean = bean;
    }
}
