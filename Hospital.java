import java.util.*;

public class Hospital {
    public static void main(String args[]) {
        PriorityQueue<Patient> people = new PriorityQueue<>(Comparator.comparingInt(Patient::getPriority));//put them in based on priority
        people.add(new Patient("Aaron", 3));
        people.add(new Patient("Mr.Lein", 1));
        people.add(new Patient("Mr. T", 1));
        people.add(new Patient("Anishka", 2));

        while (!people.isEmpty()) {
            System.out.println(people.remove()+ " has been treated");;
        }
    }
}