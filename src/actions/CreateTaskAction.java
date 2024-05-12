package actions;

import actions.Actions;
import management.tasks.TaskManager;
import management.tasks.Tasks;
import management.user.User;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CreateTaskAction implements Actions {

    public CreateTaskAction() {
    }

    @Override
    public String execute(User user, TaskManager taskManager, Scanner scanner) {
        System.out.println("Enter task details below:");
        System.out.print("Title: ");
        String title = scanner.nextLine();

        System.out.print("Due Date (Enter it using this format: DD/MM/YYYY): ");
        String dueDate = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(dueDate, formatter);

        Tasks task = new Tasks(title, localDate);
        user.addTasks(task);
        return task.toString();
    }

    @Override
    public String menuDescription() {
        return "Create New Task: ";
    }
}
