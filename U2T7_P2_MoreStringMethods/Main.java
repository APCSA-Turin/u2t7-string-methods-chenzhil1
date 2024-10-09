package U2T7_P2_MoreStringMethods;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int wordCount = 0;
        int score = 0;
        String previousWord;
        String currentWord;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first word: ");
        previousWord = scan.nextLine();

        while(score < 50) {
            System.out.print("Enter next word: ");
            currentWord = scan.nextLine();

            if(currentWord.compareTo(previousWord) > 0) {
                score += 2;
                System.out.println("+2 points: current word alphabetically after; SCORE: " + score);
            }
            else if(currentWord.compareTo(previousWord) < 0) {
                score -= 5;
                System.out.println("-5 points: current word alphabetically before; SCORE: " + score);
            }
            else {
                score -= 10;
                System.out.println("-10 points: current word same as previous; SCORE: " + score);
            }

            if(previousWord.substring(previousWord.length() - 2).equals(currentWord.substring(0, 2))) {
                score += 5;
                System.out.println("+5 points: last 2 letters of previous match first 2 of current; SCORE: " + score);
            }
            
            if(!(currentWord.indexOf(previousWord.substring(0,1)) == -1)) {
                score += 3; 
                System.out.println("+3 points: first letter of previous word found in current word; SCORE: " + score);
            }

            if(previousWord.length() == currentWord.length()) {
                score += 3;
                System.out.println("+3 points: current word same length as previous; SCORE: " + score);
            }
            
            wordCount += 1;
            previousWord = currentWord;
        }

        scan.close();
        System.out.println("You win! It took you " + wordCount + " words! Try again for a lower word  count :)" );


    }
}
