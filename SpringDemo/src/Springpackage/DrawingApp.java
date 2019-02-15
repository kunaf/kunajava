/*
 
 */
package Springpackage;

/** @author kuna
 */
public class DrawingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Triangle triangle = new Triangle(); (with spring)
      
      BeanFactory factory = new xmlBeanFactory(new FileSystemResource("spring.xml"));
      
       Triangle.draw();
    }
    
}
