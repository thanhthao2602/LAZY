
package bvnbuoi5;

import java.util.Scanner;
public class menu {
     static Scanner scanner = new Scanner(System.in);

    public static void menu() {

        classroom classroom = new classroom();

        int choice;

        do {

            System.out.println("1. Input list student (until you enter id = 555)");
            System.out.println("2. Output list student");
            System.out.println("3. Sort by gpa");
            System.out.println("4. Remove student by id");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    classroom.input();
                    break;

                case 2:
                    classroom.output();
                    break;

                case 3:
                    classroom.sortbyGPA();
                    System.out.println("Sort by gpa success");
                    classroom.output();
                    break;

                case 4:
                    System.out.print("Enter id to remove: ");
                    Integer id = scanner.nextInt();
                    classroom.removeByID(id);
                    System.out.println("Remove success");
                    classroom.output();
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }

        } while (choice != 5);
    }
}
