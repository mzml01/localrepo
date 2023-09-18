package LocalRepo;

import java.util.*;

public class Palindrome {
    public void pali() {
        Scanner wrd = new Scanner(System.in);
        String word = wrd.nextLine();
        StringBuilder s = new StringBuilder();
        s.append(word);
        s.reverse();
        System.out.println(s);
        if (word.equals(s.toString())) {
            System.out.println(s + "!" + " its a palindrome");
        } else {
            System.out.println(s + "!" + " is not a palindrome");
        }

        wrd.close();
    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        obj.pali();

    }
}
