package actions;

import management.tasks.TaskManager;
import management.user.User;

import java.util.Scanner;

public interface Actions {
    public String execute(User user, TaskManager taskManager, Scanner scanner);


    public String menuDescription();
}
