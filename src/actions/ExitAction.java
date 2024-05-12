package actions;

import management.tasks.TaskManager;
import management.user.User;

import java.util.Scanner;

public class ExitAction implements Actions {
    @Override
    public String execute(User user, TaskManager taskManager, Scanner scanner) {
        user.setUserDone(true);
        return "Exiting..";
    }

    @Override
    public String menuDescription() {
        return "Exit system: ";
    }
}
