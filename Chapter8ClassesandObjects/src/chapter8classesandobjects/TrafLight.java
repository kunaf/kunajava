/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8classesandobjects;

/**
 *
 * @author kuna
 */
public enum TrafLight {
    
    RED("3 MINS"),
    GREEN("4 MINS"),
    YELLOW("3 SECONDS");
    
    private final String timing;
    
    TrafLight(String timing) {
        this.timing = timing;
    }
    
    public String getTiming(){
        return timing;
    }
    
    
}
