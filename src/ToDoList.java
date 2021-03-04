import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private ArrayList<Task> taskList;

    // Constructor to create a ToDo list


    public ToDoList(ArrayList<Task> taskList) {

        this.taskList = taskList;
    }
    // Method to return the number of tasks done

    public int getNumberOfTasksDone() {
        int count = 0;
        for (Task task : taskList) {
            if (task.isComplete( ))
                count++;
        }
        return count;
    }
     // Method to display the main menu
    public void displayMainMenu() {
        int choice = 0;
        boolean endTask = false;
        Scanner input = new Scanner(System.in);
        System.out.println("    Hello! Welcome to your To do List      ");
        System.out.println("-------------------------------------------");
        System.out.println("     1- Display List      ");
        System.out.println("     2- Add New Task      ");
        System.out.println("     3- Edit Task         ");
        System.out.println("     4- Delete Task       ");
        System.out.println("     5- Update & Exit     ");
        System.out.println("-------------------------------------------");
        System.out.println(" Enter correct option");
        choice = input.nextInt( );
        while (!(endTask)) {

            if (choice == 1) {
                displayTask( );
            }
            if (choice == 2) {
                addTask( );
            }
            if (choice == 3)
                editTask( );
            if (choice == 4)
                saveAndExitTask( );
        }
    }
         // Method to display task by projectName or Due date
    public void displayTask() {
        int option = 0;
        while (option != 3) {
            System.out.println("*********************************************");
            System.out.println("Please pick your option: ");
            System.out.println("1)  Show all the tasks by projectName");
            System.out.println("2)  Show all the tasks by due date");
            System.out.println("3)  Go back to the main menu");
            System.out.println("*********************************************");

            Scanner input = new Scanner(System.in);
            option = input.nextInt( );
            switch (option) {
                case 1:
                    showTaskByProjectName( );
                    break;
                case 2:
                    showTaskByDueDate( );
                    break;
                //case 3:
                default:
                    System.out.println("Not a valid input!");
                    break;
            }
        }
    }

    public void showTaskByProjectName() {
    }

    public void showTaskByDueDate() {
    }


    // This method adds a new task to the taskList using the User input

    public void addTask() {
        System.out.println("Enter the new task to be added");
        Scanner input = new Scanner(System.in);
        System.out.println("The title of the task:\n ");
        String title = input.nextLine( );
        System.out.println("The name of the project:\n ");
        String projectName = input.nextLine( );
        System.out.println("Due date of the project in the format yyyy-MM-dd:\n ");
        LocalDate dueDate = LocalDate.parse(input.nextLine( ));
        Task newTask = new Task(title, projectName, dueDate);
        taskList.add(newTask);
    }
    // This method helps to edit a task(Update,Mark as done, delete)

    public void editTask() {
        //Task task = taskList.get(0);
        int option = 0;

        while (option != 4) {
            System.out.println("************************************* ");
            System.out.println("Please pick your option to edit: \n");
            System.out.println("1)  Update a existing task");
            System.out.println("2)  Mark a task completed");
            System.out.println("3)  Delete a task");
            System.out.println("4)  Go back to the main menu");
            System.out.println("************************************* ");
            Scanner input = new Scanner(System.in);
            option = input.nextInt( );
            switch (option) {
                case 1:
                    updateTask( );
                    break;
                case 2:
                    markTaskAsDone( );
                    break;
                case 3:
                    deleteTask( );
                    break;
                default:
                    System.out.println("Not a valid input!");
                    break;
            }

        }
    }

    // This method update's an existing tasks details
    public void updateTask() {
        System.out.println("Choose a task no to update");
        showExistingTasks( );
        Scanner input = new Scanner(System.in);
        int index = input.nextInt( );


    }


    public void markTaskAsDone() {

    }

    public void deleteTask() {

    }

    private void showExistingTasks() {
    }

    private void saveAndExitTask() {
    }

}


