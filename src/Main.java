import java.util.Iterator;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));

    }

    public static boolean checkForPalindrome(String text) {

        System.out.println("Initial State : " + text);
        text = text.replaceAll("[.,'?\\-\\s]","").toLowerCase();
       Stack<Character> stackOriginal = new Stack<>();

       var stackTemp = new Stack<>();
       var stackReversed = new Stack<>();

       var chars = text.toCharArray();
       for (var c : chars){
           stackOriginal.push(c);
           stackTemp.push(c);
       }

       for (char c : chars){
           Object charTemp = stackTemp.pop();
           stackReversed.push((Character)charTemp);
       }


        System.out.println("Reversed :" +stackReversed);
        System.out.println("Original : " + stackOriginal);

        if (stackOriginal.equals(stackReversed)){
            return true;
        }
        return false;

    }
}