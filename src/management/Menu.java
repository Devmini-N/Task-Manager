package management;

import actions.Actions;

import java.util.*;

public class Menu {
    public static Actions showMenu(List<Actions> actions) {
        Scanner scanner = new Scanner(System.in);
        List<Character> freeChars = new ArrayList<Character>();
        Map<Character, Actions> keyToActionMap = new HashMap<>();


        for (char j = 'a'; j <= 'z'; j++) {
            freeChars.add(j);
        }


        for (Actions action : actions) {
            char c = freeChars.get(0);
            freeChars.remove(Character.valueOf(c));
            keyToActionMap.put(c, action);
            System.out.println(c + ": " + action.menuDescription());
        }


        char key;
        do {
            key = scanner.next().charAt(0);
        } while (!keyToActionMap.containsKey(key));


        return keyToActionMap.get(key);
    }
}
