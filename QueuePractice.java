import java.util.*;

public class QueuePractice {
    public static void main(String args[]) {
        Queue<String> job = new LinkedList<>();
        Scanner keyboard = new Scanner(System.in);
        job.add("penguin photo");
        job.add("My homework due in two seconds");
        job.add("my divorce papers");
        System.out.println("What do you want to add to the printing queue?");
        job.add(keyboard.nextLine());
        while (!job.isEmpty()) {
            System.out.println(job.remove() + " removed from the printing queue");
        }
    }
}