package actions;

import management.tasks.TaskManager;
import management.user.User;
import management.tasks.Tasks;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class RemoveTaskAction implements Actions {
    @Override
    public String execute(User user, TaskManager taskManager, Scanner scanner) {
        PriorityQueue<Tasks> tasks = user.getTasks();
        if (tasks.isEmpty()) {
            return "No tasks available to remove.";
        }
        Tasks taskToRemove = taskManager.userGetTasks();
        if(taskToRemove != null){
            user.getTasks().remove(taskToRemove);
            System.out.println(taskToRemove.getTitle() + " removed from to-do List");
        }
        return null;
    }

    @Override
    public String menuDescription() {
        return "remove completed tasks";
    }
}
