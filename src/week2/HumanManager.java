package week2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class HumanManager implements Manager {
    private ArrayList<Human> humans;
    private Scanner scanner = new Scanner(System.in);
    public HumanManager() {
        this.humans = new ArrayList<>();
    }

    @Override
    public void displayAll() {
        for (Human h : humans) {
            System.out.println(h);
        }
    }

    @Override
    public void addHuman(Human human) {
        humans.add(human);
    }

    @Override
    public Human searchById(int id) {
        for (Human human : humans) {
            if(human.getId() == id){
                return human;
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        Human deleteHuman = null;
        for (Human human: humans) {
            if (human.getId() == id){
                 deleteHuman = human;
            }
        }
        humans.remove(deleteHuman);
        System.out.println("Danh sách sau khi xóa: ");
        displayAll();
    }

    @Override
    public Student editHuman(int id) {
        Human editHuman = null;
        Student editStudent = null;
        for (Human human : humans) {
            if (human.getId() == id && human instanceof Student ){
                editStudent = (Student) human;
            } else if (human.getId() == id ) {
                editHuman = human;
            }
        }
        if (editHuman!= null){
            System.out.println("Nhập tên mới: ");
            editHuman.setName(scanner.nextLine());
            System.out.println("Nhập tuổi mới: ");
            editHuman.setAge(scanner.nextInt());
            return (Student) editHuman;
        } else if (editStudent != null){
            System.out.println("Nhập tên mới: ");
            editStudent.setName(scanner.nextLine());
            System.out.println("Nhập tuổi mới: ");
            editStudent.setAge(scanner.nextInt());
            System.out.println("Nhập điểm trung bình mới: ");
            editStudent.setAveragePoint(scanner.nextDouble());
            scanner.nextLine();
            return editStudent;
        }
        return null;
    }

    @Override
    public void sortAvg() {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Human> humans1 = new ArrayList<>();
        for (Human human : humans) {
            if (human instanceof Student){
                students.add((Student) human);
            } else {
                humans1.add(human);
            }
        }
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student student1 , Student student2) {
                if (student1.getAveragePoint() > student2.getAveragePoint()) return 1;
                else if (student1.getAveragePoint() < student2.getAveragePoint()) return -1;
                else return 0;
            }
        });
        humans1.addAll(students);
        humans = humans1;
        for (Human human:humans) {
            System.out.println(human);
        }
    }

    @Override
    public void totalPoint() {
        double totalPoint = 0;
        for (Human human : humans) {
            if (human instanceof Student){
                totalPoint += ((Student) human).getAveragePoint();
            }
        }
        System.out.println("Tổng điểm trung bình là: " + totalPoint);
    }

    public Human creatHuman(Scanner scanner, int choice){
        scanner.nextLine();
        System.out.println("Nhập Tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập vào tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1){
            return new Human(name, age);
        } else if (choice == 2){
            System.out.println("Nhập vào điểm trung bình của học sinh: ");
            double avgPoint = scanner.nextDouble();
            return new Student(name,age,avgPoint);
        }
        return null;
    }

}
