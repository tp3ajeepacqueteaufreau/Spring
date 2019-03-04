package org.mines.douai.tp.spring;

import org.springframework.context.annotation.Scope;

@Scope("application")
public class YellowJacketMain {
    
    YellowJacketBean france;
    YellowJacketBean allemagne;
    YellowJacketBean pologne;
    
    
    private void printYellowJacket() {
        System.out.println(france.getYellowJacket());
        System.out.println(allemagne.getYellowJacket());
        System.out.println(pologne.getYellowJacket());
    }
    
    public YellowJacketBean getFrance() {
        return france;
    }
    
    public void setFrance(YellowJacketBean france) {
        this.france = france;
    }
    
    public YellowJacketBean getAllemagne() {
        return allemagne;
    }
    
    public void setAllemagne(YellowJacketBean allemagne) {
        this.allemagne = allemagne;
    }
    
    public YellowJacketBean getPologne() {
        return pologne;
    }
    
    public void setPologne(YellowJacketBean pologne) {
        this.pologne = pologne;
    }
}
