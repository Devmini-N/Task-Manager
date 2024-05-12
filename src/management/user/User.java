package management.user;

import actions.Actions;
import actions.CreateTaskAction;
import actions.ExitAction;
import actions.ViewTasksAction;
import actions.capabilities.ActionCapable;
import management.tasks.Tasks;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class User implements ActionCapable {

    private PriorityQueue<Tasks> tasks;
    private boolean isUserDone = false;

    public User() {
        this.tasks = new PriorityQueue<>();
    }

    public void setUserDone(boolean userDone) {
        isUserDone = userDone;
    }

    public boolean getIsUserDone() {
        return isUserDone;
    }

    public void addTasks(Tasks mytask) {
        tasks.add(mytask);
    }

    public void displayTasks() {
        String red = "\033[31m";
        String yellow = "\033[33m";
        String bold = "\033[1m";
        String reset = "\033[0m";
        LocalDate today = LocalDate.now();

        File file = new File("tasks.ser");
        if(file.exists() && !tasks.isEmpty()){
            for(Tasks task: tasks){
                System.out.println(task);
            }
        }
        else {
            for (Tasks task : tasks) {
                if (task.getDueDate().isBefore(today)) {
                    System.out.println("Task(s) overdue: \n");
                    System.out.println(bold + red + task + reset);
                } else if (task.getDueDate().isEqual(today)) {
                    System.out.println("Task(s) due today are in yellow: \n");
                    System.out.println(bold + yellow + task + reset);
                } else {
                    System.out.println("Not due currently: ");
                    System.out.println(task);
                }
            }
        }
    }

    @Override
    public List<Actions> allowableActions() {
        List<Actions> actions = new ArrayList<>();
        actions.add(new CreateTaskAction()); // Passing tasks list to actions.CreateTaskAction
        actions.add(new ViewTasksAction(tasks, this));
        actions.add(new ExitAction());
        return actions;
    }
}
