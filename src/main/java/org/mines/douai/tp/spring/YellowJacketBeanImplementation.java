package org.mines.douai.tp.spring;

import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class YellowJacketBeanImplementation implements YellowJacketBean {
    String countryName;
    YellowJacketServiceBean yellowJacketServiceBean;
    
    @Override
    public String getCountryName() {
        return this.countryName;
    }
    
    @Override
    public YellowJacketServiceBean getYellowJacketServiceBean() {
        return this.yellowJacketServiceBean;
    }
    
    @Override
    public void setYellowJacketServiceBean(YellowJacketServiceBean bean) {
        this.yellowJacketServiceBean = bean;
    }
    
    public String getYellowJacket() {
        return "Nb yellow jacket: " + yellowJacketServiceBean.getPeopleCount(this.countryName) + "      -     Hashcode: " + this.hashCode();
    }
}
