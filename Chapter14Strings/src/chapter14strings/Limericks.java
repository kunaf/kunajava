/*
 * (Project: Limericks) A limerick is a humorous five-line verse in which the first and second lines
rhyme with the fifth, and the third line rhymes with the fourth. Using techniques similar to those de-
veloped in Exercise 14.5, write a Java application that produces random limericks. Polishing this ap-
plication to produce good limericks is a challenging problem, but the result will be worth the effort!
 */
package chapter14strings;

import java.security.SecureRandom;

/**
 *
 * @author kuna
 */
public class Limericks {

    public static void main(String[] args) {
        // TODO code application logic here
         SecureRandom random = new SecureRandom();
        
        //array definitions
        String[] articles = {"the","a", "one", "some", "any" };
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verbs = {"ran", "jumped", "walked", "skipped", "drove"};
        //String[] prepositions = {"to", "from", "over", "under", "on"};
        String[] limprep1 = {"over", "under"};
        String[] limprep2 = {"from", "on"};
        
        System.out.printf("LIMERICK \n\n");

        for(int i=0;i<5;i++) {
            //test the line number to do rhyming
            if(i == 0 || i == 1 || i == 4) {
                System.out.print(" " + articles[random.nextInt(5)]+" "+ noun[random.nextInt(5)]+" "+ 
                    verbs[random.nextInt(5)] + " " + limprep1[random.nextInt(2)]);
            }
            else 
                System.out.print(" " + articles[random.nextInt(5)]+" "+ noun[random.nextInt(5)]+" "+ 
                    verbs[random.nextInt(5)] + " " + limprep2[random.nextInt(2)]);
  
            System.out.println(" ");
        }
    }
    
}
