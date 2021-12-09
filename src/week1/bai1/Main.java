package week1.bai1;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng sản phẩn: ");
        int n = scanner.nextInt();

        Product[] products = new Product[n];
        for (int i = 0; i < products.length; i++) {
            products[i] = creatProduct(scanner) ;
        }
        System.out.println("Nhập vào tên sp cần tìm:");
        String inputName = scanner.nextLine();
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equals(inputName)){
                System.out.println(products[i]);
            }
        }
    }
//    public static String findProduct(String inputProduct, Product[] products){
//        Scanner scanner = new Scanner(System.in);
//        inputProduct = scanner.nextLine();
//        for (int i = 0; i < products.length; i++){
//            if (products[i].getName().equals(inputProduct)){
//                System.out.println(products[i]);
//            }
//        }
//    }
    public static Product creatProduct(Scanner scanner) {
        System.out.println("Nhập mã: ");
        int code = scanner.nextInt();
        System.out.println("Nhập tên sp: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Nhập giá sp: ");
        double cost = scanner.nextDouble();
        System.out.println("Nhập loại: ");
        String type = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Nhập loại tiền tệ:");
        String moneyType = scanner.nextLine();
        return new Product(code, name, cost, type, moneyType) ;
    }
}
