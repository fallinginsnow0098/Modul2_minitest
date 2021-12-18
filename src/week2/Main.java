package week2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HumanManager humanManager = new HumanManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Hiển thị toàn bộ danh sách");
            System.out.println("2. Thêm thông thông tin 1 người ");
            System.out.println("3. Tìm thông tin người theo id ");
            System.out.println("4. Xóa thông tin người theo id ");
            System.out.println("5. Sửa thông tin người theo id ");
            System.out.println("6. Sắp xếp danh sách theo điểm trung bình");
            System.out.println("7. Hiển thị tổng điểm");
            System.out.println("____________________________________________");
            System.out.println("Nhập vào lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    humanManager.displayAll();
                    break;
                case 2:
                    int choice1;
                    do {
                        System.out.println("Nhập vào lựa chọn: ");
                        System.out.println("1. Thêm người vào danh sách: ");
                        System.out.println("2. Nhập thông tin học sinh, và điểm trung bình: ");
                        System.out.println("Nhập vào lựa chọn của bạn: ");
                        System.out.println("____________________________________________");
                        choice1 = scanner.nextInt();
                        switch (choice1) {
                            case 1:
                                Human human = humanManager.creatHuman(scanner, choice1);
                                humanManager.addHuman(human);
                                break;
                            case 2:
                                Student student = (Student) humanManager.creatHuman(scanner, choice1);
                                humanManager.addHuman(student);
                                break;
                        }
                    } while (choice1 != 0);
                    break;
                case 3:
                    System.out.println("Nhập id người muốn tìm: ");
                    int searchId = scanner.nextInt();
                    System.out.println(humanManager.searchById(searchId));
                    break;
                case 4:
                    System.out.println("Nhập id người muốn xóa: ");
                    int deleteId = scanner.nextInt();
                    humanManager.deleteById(deleteId);
                    break;
                case 6:
                    System.out.println("Sau khi sắp xếp lại danh sách: ");
                    humanManager.sortAvg();
                    break;
                case 7:
                    humanManager.totalPoint();
                    break;

            }
        } while (choice != 0);
    }
}
