package U2T7_Lab_1_String_Methods;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        int len1 = str1.length();
        int len2 = str2.length();
        int strresult;
        
        if(len1 > len2) {
            System.out.println(str1 + " is longer");
        }
        else {
            System.out.println(str2 + " is longer");
        }

        if(len1 % 2 == 1) {
            System.out.print("First half: ");
            System.out.println(str1.substring(0, (len1 - 1) / 2 ));
            System.out.print("Second half: ");
            System.out.println(str1.substring((len1 - 1) / 2));
        }
        else {
            System.out.print("First half: ");
            System.out.println(str1.substring(0, len1 / 2 ));
            System.out.print("Second half: ");
            System.out.println(str1.substring(len1 / 2));
        }

        if(len2 % 2 == 1) {
            System.out.print("First half: ");
            System.out.println(str2.substring(0, (len2 - 1) / 2 ));
            System.out.print("Second half: ");
            System.out.println(str2.substring((len2 - 1) / 2));
        }
        else {
            System.out.print("First half: ");
            System.out.println(str2.substring(0, len2 / 2 ));
            System.out.print("Second half: ");
            System.out.println(str2.substring(len2 / 2));
        }

        strresult = str1.indexOf(str2);

        if(!(strresult == -1)) {
            System.out.println(str2 + " is found at index " + strresult);
        }
        else { 
            System.out.println(str2 + " is NOT found in " + str1);
        }

        scanner.close();
    }

    
}
