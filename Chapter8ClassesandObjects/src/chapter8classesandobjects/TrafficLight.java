/*
 *Write an enum type TrafficLight , whose constants ( RED , GREEN , YELLOW ) take one parame-
ter—the duration of the light. Write a program to test the TrafficLight enum so that it displays the
enum constants and their durations.
 */
package chapter8classesandobjects;
/**
 * @author kuna
 */
public class TrafficLight {

    public static void main(String[] args) {
        System.out.println("Traffic Lights");
        
        for(TrafLight light : TrafLight.values())
            System.out.printf("%-10s%s\n", light, light.getTiming());
    }
    
}