package week3.main;

import week3.manager.StudentManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu =====================================================================[C]");
            System.out.println("1. Thêm sinh viên ========================================================[1]");
            System.out.println("2. Xóa sinh viên =========================================================[0]");
            System.out.println("3. Tìm sinh viên theo ID =================================================[2]");
            System.out.println("4. Sắp xếp sinh viên theo điểm từ thấp đến cao ===========================[1]");
            System.out.println("5. Tìm sinh viên có điểm trung bình cao nhất =============================[H]");
            System.out.println("6. Hiển thị thông tin tất cả các sinh viên ===============================[1]");
            System.out.println("7. Sửa thông tin sinh viên theo id =======================================[C]");
            System.out.println("8. Exit ==================================================================[3]");
            System.out.println("Nhập vào lựa chọn");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
//                    studentManager.creatStudent();
                    studentManager.addStudent(studentManager.creatStudent());
                    break;
                case 2:
                    System.out.println("Nhập vào ID sinh viên cần xóa");
                    int deleteId = scanner.nextInt();
                    studentManager.deleteById(deleteId);
                    break;
                case 3:
                    System.out.println("Nhập vào ID sinh viên cần tìm");
                    int searchId = scanner.nextInt();
                    System.out.println(studentManager.searchById(searchId));
                    break;
                case 4:
                    studentManager.sortByAveragePoint();
                    break;
                case 5:
                    studentManager.findHighestAveragePoint();
                    break;
                case 6:
                    studentManager.displayAll();
                    break;
                case 7:
                    System.out.println("Nhập vào id sinh viên cần sửa");
                    int editId = scanner.nextInt();
                    System.out.println(studentManager.updateById(editId));
                case 8:
                    System.exit(8);
            }

        } while (choice != 0);
    }
}
