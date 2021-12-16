package week2.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào size của danh sách");
        int size = scanner.nextInt();
        Human[] humans = new Human[size];
        HumanManager humanManager = new HumanManager();
        ArrayList<Human> humans1 = new ArrayList<Human>();

        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1.Thêm sinh viên:");
            
            System.out.println("Nhập lựa chọn");
            choice = scanner.nextInt();
        } while (choice!=0);
    }
}
