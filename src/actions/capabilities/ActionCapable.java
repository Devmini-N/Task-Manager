package actions.capabilities;

import actions.Actions;

import java.util.List;

public interface ActionCapable {
    List<Actions> allowableActions();
}
