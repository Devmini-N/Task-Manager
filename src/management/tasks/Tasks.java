package management.tasks;

import java.time.LocalDate;

public class Tasks implements Comparable<Tasks> {

    private String title;
    private LocalDate dueDate;

    public Tasks(String title, LocalDate dueDate){
        this.title = title;
        this.dueDate = dueDate;
    }

    public String toString() {
        return "Title: " + title + "\n" + "due date " + dueDate + "\n";
    }


    public LocalDate getDueDate() {
       return dueDate;
    }

    public String getTitle(){
        return title;
    }


    @Override
    public int compareTo(Tasks other) {
        return this.dueDate.compareTo(other.getDueDate());
    }
}
