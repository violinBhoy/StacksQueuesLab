import java.util.*;

public class Patient {
    private String name;
    private int priority;

    public Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public String toString() {
        return name;
    }
}