package management.tasks;

import actions.Actions;
import management.Menu;
import management.user.User;
import actions.capabilities.ActionCapable;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class TaskManager implements Serializable{
    private PriorityQueue<Tasks> tasks;
    private User user;

    private Scanner scanner;


    public TaskManager(User user, Scanner scanner) { // Constructor
        this.user = user;
        this.scanner = scanner;
        this.tasks = new PriorityQueue<>();

    }



    public void PrintStatus(){
        System.out.println("Welcome to your personal task manager!!");
    }

    public void consoleMenu() {
        while (!user.getIsUserDone()) {
            List<Actions> actions = new ArrayList<>();
            List<ActionCapable> actionCapables = new ArrayList<>();
            actionCapables.add(user);
            for (ActionCapable actionCapable : actionCapables) {
                actions.addAll(actionCapable.allowableActions());
            }


            System.out.println("#########################################");
            Actions action = Menu.showMenu(actions);
            System.out.println(action.execute(user,this, this.scanner));
        }
    }



}
