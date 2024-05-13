# Java Task Manager

Java Task Manager is a simple task management application implemented in Java, allowing users to add, remove, and view their tasks. It provides a console-based interface for easy interaction.

## Features

- **Add Tasks**: Users can add new tasks to the task list.
- **Remove Tasks**: Users can remove existing tasks from the task list.
- **View Tasks**: Users can view all tasks currently in the task list.

## Classes

1. **Tasks**: Represents individual tasks with properties like name, description, due date, etc.
2. **User**: Represents a user of the task manager and handles all user actions.
3. **TaskManager**: Manages the task logic and outputs onto the console.
4. **Actions**: Interface defining actions that can be performed by the user.
5. **ActionsCapable**: Interface indicating capability to perform actions.
6. **Menu**: Provides a menu interface for user interaction.
7. **Group of Action Classes**: Contains classes implementing specific actions like add, remove, and view actions.

## Usage

1. Compile the Java files.
2. Run the Application class to start the task manager.
3. Follow the on-screen instructions to perform actions.

## Dependencies

This project doesn't have any external dependencies.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Acknowledgements

- This project utilizes ANSI escape codes for formatting and output on the console.
- Portions of the application's logic, such as the menu implementation, have been adapted from previously completed projects, developed under the guidance of educators at Monash University.

## Contributors

- Devmini Narasingha Bandara
