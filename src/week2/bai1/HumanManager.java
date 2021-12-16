package week2.bai1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class HumanManager implements Manager {
    ArrayList<Human> humans = new ArrayList<Human>();
    public int size = 0;
    private static final int default_capacity = 10;


    @Override
    public void displayAll() {
        for ( Human humans1 : humans) {
            System.out.println(humans1);
        }
    }

    @Override
    public ArrayList<Human> addHuman(Scanner scanner, String name, int age, double averagePoint) {
        System.out.println("Nhập tên:");
        name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        age = scanner.nextInt();
        System.out.println("Nhập điểm trung bình: ");
        averagePoint = scanner.nextDouble();
        humans.add(new Human(name, age, averagePoint));
        return humans;
    }

    @Override
    public void getHuman(Scanner scanner) {
        System.out.println("Nhập vào tên người cần tìm thông tin:");
        String searchName = scanner.nextLine();
        System.out.println(humans.indexOf(searchName));

    }

    @Override
    public void deleteHuman(Scanner scanner) {
        System.out.println("Nhập id muốn xóa:");
        int deleteID = scanner.nextInt();
        for (Human human : humans) {
            if (human instanceof Human){
                if (human.getId() == deleteID){
                    humans.remove(deleteID);
                }
            }
        }
    }

    @Override
    public void editHuman(Scanner scanner) {
        System.out.println("Nhập vào id để sửa: ");
        int editID = scanner.nextInt();

    }

    @Override
    public void sortList() {

    }

//    @Override
//    public void sortList() {
//        HumanManager humanManager = new HumanManager();
//        Arrays.sort(humans, humanManager);
//        for (Human humanManager1 : humans) {
//            System.out.println(humanManager1);
//        }
//    }

    @Override
    public void sumAveragePoint() {
        System.out.println("Tổng điểm trung bình: ");
        double sumAvg = 0 ;
        for (Human human : humans) {
            if (human instanceof Student) {
                sumAvg += ((Student) human).getAveragePoint();
            }
        }
        System.out.println(sumAvg);
    }

    @Override
    public int compare(Human o1, Human o2) {
        if (o1.getId() > o2.getId()) return 1;
        else if (o1.getId() < o2.getId()) return -1;
        else return 0;
    }

}
