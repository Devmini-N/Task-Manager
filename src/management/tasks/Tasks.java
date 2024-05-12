package management.tasks;

import java.io.Serializable;
import java.time.LocalDate;

public class Tasks implements Comparable<Tasks>, Serializable {
    private static final long serialVersionUID = 1L;

    private String title;
    private LocalDate dueDate;

    private boolean completed;
    public Tasks(String title, LocalDate dueDate){
        this.title = title;
        this.dueDate = dueDate;
        this.completed = false;
    }

    public String toString() {
        return "Title: " + title + "\n" + "due date " + dueDate + "\n";
    }

    public boolean getCompleted() {
        return completed;
    }

    public LocalDate getDueDate() {
       return dueDate;
    }


    @Override
    public int compareTo(Tasks other) {
        return this.dueDate.compareTo(other.getDueDate());
    }
}
