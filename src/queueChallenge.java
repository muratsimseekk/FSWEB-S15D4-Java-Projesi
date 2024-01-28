import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queueChallenge {
    public static void main(String[] args) {
        System.out.println(checkForPalindrom("abccba"));
    }

    private static boolean checkForPalindrom(String text) {

        System.out.println("Initial State : " + text);
        text = text.replaceAll("[.,'?\\-\\s]","").toLowerCase();

        Stack<Character> stackOriginal = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        char[] chars =text.toCharArray();

        for (char c : chars){
            stackOriginal.push(c);
            queue.offer(c);
        }
        System.out.println("queue : " + queue);
        System.out.println("stack : " + stackOriginal);

        while(!queue.isEmpty()){
            Character c = queue.remove();
            Character cStack = stackOriginal.pop();
            System.out.println("Removed item :" + c);
            if (c != cStack)
            {
                return  false;
            }
        }
        return true;
    }
}
