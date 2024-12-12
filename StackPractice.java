import java.util.*;

public class StackPractice {
    public static void main(String args[]) {
        Stack<String> word = new Stack<>();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = keyboard.next();
        input = input.toLowerCase();
        boolean palindrome = true;
        for (int i = 0; i < input.length(); i++) {
            word.push(input.substring(i, i+1));
        }
        for (int i = 0; i < input.length()/2; i++) {
            if (!word.pop().equals(input.substring(i, i+1))) {
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
            System.out.println("IT IS A PALINDROME WHIPEEEEEEEEE");
        } else {
            System.out.println("NO BAD IT NOT PALINDROME");
        }
    }
}