/*
 * (Random Sentences) Write an application that uses random-number generation to create
sentences. Use four arrays of strings called article , noun , verb and preposition . Create a sentence
by selecting a word at random from each array in the following order: article , noun , verb , preposi-
tion , article and noun . As each word is picked, concatenate it to the previous words in the sentence.
The words should be separated by spaces. When the final sentence is output, it should start with a
capital letter and end with a period. The application should generate and display 20 sentences.
The article array should contain the articles "the" , "a" , "one" , "some" and "any" ; the noun
array should contain the nouns "boy" , "girl" , "dog" , "town" and "car" ; the verb array should con-
tain the verbs "drove" , "jumped" , "ran" , "walked" and "skipped" ; the preposition array should
contain the prepositions "to" , "from" , "over" , "under" and "on" .
 */
package chapter14strings;
import java.security.SecureRandom;
/**
 * @author kuna
 */
public class RandomSentence {

    public static void main(String[] args) {
        // TODO code application logic here
        SecureRandom random = new SecureRandom();
        
        //array definitions
        String[] articles = {"the","a", "one", "some", "any" };
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verbs = {"ran", "jumped", "walked", "skipped", "drove"};
        String[] prepositions = {"to", "from", "over", "under", "on"};
        
        for(int i=0;i<20;i++) {
            System.out.printf("Sentence %d: ", i+1);
            System.out.print(" " + articles[random.nextInt(5)]+" "+ noun[random.nextInt(5)]+" "+ 
                    verbs[random.nextInt(5)] + " " + prepositions[random.nextInt(5)]);
            System.out.println(" ");
        }
        
        
    }
    
}
