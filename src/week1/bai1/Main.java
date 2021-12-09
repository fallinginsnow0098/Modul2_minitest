package week1.bai1;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng sản phẩn: ");
        int n = scanner.nextInt();
        Product[] products = new Product[n];
        for (int i = 0; i < products.length; i++){
            for (int j = 0; j < ; j++) {

            }
            System.out.println("Nhập mã: ");
            String code = scanner.nextLine();
            System.out.println("Nhập tên sp: ");
            String name = scanner.nextLine();
            System.out.println("Nhập giá sp: ");
            double cost = scanner.nextDouble();
            System.out.println("Nhập loại: ");
            String type = scanner.nextLine();
            System.out.println("Nhập loại tiền tệ:");
            String moneyType = scanner.nextLine();
        }

    }
//    public static Product creatListProduct(Scanner scanner) {
//        for (int i = 0; i < ; i++) {
//
//            return new Product(code, name, cost, type, moneyType) ;
//        }
//
//    }
}
