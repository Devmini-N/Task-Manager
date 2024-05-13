package actions;

import actions.Actions;
import management.tasks.TaskManager;
import management.tasks.Tasks;
import management.user.User;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ViewTasksAction implements Actions {
    private PriorityQueue<Tasks> tasks;
    private User user;


    public ViewTasksAction(PriorityQueue<Tasks> tasks, User user){
        this.tasks = tasks;
        this.user = new User();
    }

    @Override
    public String execute(User user, TaskManager taskManager, Scanner scanner) {
        PriorityQueue<Tasks> tasks = user.getTasks();
        if (tasks.isEmpty()) {
            return "No tasks available to review.";
        }
        user.displayTasks();
        return "Tasks displayed successfully.";
    }


    @Override
    public String menuDescription() {
        return "Display current tasks: ";
    }
}
