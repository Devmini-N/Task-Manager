import management.tasks.TaskManager;
import management.user.User;

import java.util.Scanner;

public class Application {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        TaskManager taskManager = new TaskManager(user, scanner);
        taskManager.PrintStatus();
        taskManager.consoleMenu();
        scanner.close();
    }
}
