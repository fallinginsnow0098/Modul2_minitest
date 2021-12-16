package week1.bai1;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng sản phẩn: ");
        int n = scanner.nextInt();

        Product[] products = new Product[n];
        creatArray(scanner, products);
        String searchProduct = scanner.nextLine();
        //nhập vào input tìm tên sp
        System.out.println("Nhập vào tên sp cần tìm:");
        String inputName = scanner.nextLine();
        searchProduct(products, inputName);
        //tính tổng giá các sp
        double sumCost  = 0 ;
        for (Product x : products) {
            sumCost += x.getCost() ;
        }
        System.out.println("Tổng giá sp là" + sumCost);
        System.out.println("____________________");
        System.out.println("Nhập vào tên sp muốn sửa:");
        int id =scanner.nextInt();
        
    }



    public static void editProduct(Product[] products, Scanner scanner, int id){
        for (Product p : products) {
            if (p.getCode() == id ) {
                System.out.println("Nhập tên mới");
                String name = scanner.nextLine();
                p.setName(name);
                System.out.println("Nhập giá mới");
                double cost = scanner.nextDouble();
                p.setCost(cost);
                System.out.println("Nhập loại mới");
                String type = scanner.nextLine();
                p.setType(type);
            }
        }
    }

    //tìm sản phẩm theo tên
    private static void searchProduct(Product[] products, String inputName) {
        boolean check;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equals(inputName)){
                System.out.print(products[i]);
                check = true ;
            } else {
                System.out.println("Error");
            }
        }
    }
    //tạo mảng sản phẩm
    public static  Product[] creatArray (Scanner scanner ,  Product[] products){
        for (int i = 0; i < products.length; i++) {
            System.out.println("Nhập sp thứ " + ( i + 1));
            products[i] = creatProduct(scanner);
        }
        return products;
    }
    //tạo sản phẩm
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
        return new Product(code, name, cost, type) ;
    }
}
