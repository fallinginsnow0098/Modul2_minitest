package week4._Main;

import week4._Manager.StudentManager;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final StudentManager studentManager = new StudentManager();
    public static final String PATH_NAME = "src/week4/_File/student.txt";
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Add new Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Search Student by ID");
            System.out.println("5. Find highest GPA Student");
            System.out.println("6. Sort Student List By GPA");
            System.out.println("0. Exit menu");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    studentManager.addStudent();
                    break;
                case 2:
                    System.out.println("Enter Student name to EDIT");
                    String editName = scanner.nextLine();
                    studentManager.editStudent(editName);
                    break;
                case 3:
                    System.out.println("Enter Student name to DELETE");
                    String deleteName = scanner.nextLine();
                    studentManager.deleteStudent(deleteName);
                    break;
                case 4:
                    System.out.println("Enter ID to find Student");
                    int searchID = scanner.nextInt();
                    studentManager.searchByID(searchID);
                    break;
                case 5:
                    studentManager.findHighestGPAStudent();
                    break;
                case 6:
                    int choice1 ;
                    do {
                        System.out.println("1. Sort GPA up");
                        System.out.println("1. Sort GPA down");
                        System.out.println("Enter choice");
                        choice1 = scanner.nextInt();
                        switch (choice1){
                            case 1:
                                studentManager.sortGPAUp();
                                break;
                            case 2:
                                studentManager.sortGPADown();
                                break;
                        }
                    } while (choice1 != 0);

            }
        } while (choice != 0);
    }
}
