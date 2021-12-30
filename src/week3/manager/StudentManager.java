package week3.manager;

import week3.model.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManager {
    ArrayList<Student> studentList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Student creatStudent(){
        System.out.println("Nhập vào tên sinh viên");
        String name = scanner.nextLine();
        System.out.println("Nhập vào tuổi sinh viên");
        int age = scanner.nextInt();
        System.out.println("Nhập vào điểm toán");
        double mathPoint = scanner.nextDouble();
        System.out.println("Nhập vào điểm vật lí");
        double physicsPoint = scanner.nextDouble();
        System.out.println("Nhập vào điểm hóa");
        double chemistryPoint = scanner.nextDouble();
        return new Student(name,age,mathPoint,physicsPoint,chemistryPoint);
    }
    public void addStudent(Student student){
        studentList.add(student);
    }
    public Student updateById(int updateId){
        Student studentUpdate = null;
        for (Student st : studentList) {
            if (st.getId() == updateId){
                studentUpdate = st;
            }
        }
        if (studentUpdate != null){
            int index = studentList.indexOf(studentUpdate);
            System.out.println("Nhập id mới cho sinh viên");
            int newId = scanner.nextInt();
            studentUpdate.setId(newId);
            scanner.nextLine();
            System.out.println("Nhập vào tên mới cho sinh viên");
            String newName = scanner.nextLine();
            studentUpdate.setName(newName);
            System.out.println("Nhập vào tuổi mới sinh viên");
            int newAge = scanner.nextInt();
            studentUpdate.setAge(newAge);
            System.out.println("Nhập vào điểm toán mới");
            double newMathPoint = scanner.nextDouble();
            studentUpdate.setMathPoint(newMathPoint);
            System.out.println("Nhập vào điểm vật lí mới");
            double newPhysicsPoint = scanner.nextDouble();
            studentUpdate.setPhysicsPoint(newPhysicsPoint);
            System.out.println("Nhập vào điểm hóa mới");
            double newChemistryPoint = scanner.nextDouble();
            studentUpdate.setChemistryPoint(newChemistryPoint);
            studentList.set(index, studentUpdate);
        }
        return studentUpdate;
    }
    public void deleteById(int deleteId){
        Student deleteStudent = null;
        for (Student st: studentList) {
            if (st.getId() == deleteId){
                deleteStudent = st;
            }
        }
        boolean checkDelete = studentList.remove(deleteStudent);
        if (checkDelete){
            System.out.println("Xóa xong rồi");
        } else {
            System.out.println("Xóa chưa được. Xóa lại!");
        }
        System.out.println("Danh sách sinh viên sau khi xóa:");
        displayAll();
    }
    public Student searchById(int searchId){
        for (Student st : studentList ) {
            if (st.getId() == searchId){
                return st;
            }
        }
        return null;
    }
    public void sortByAveragePoint(){
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAveragePoint() > o2.getAveragePoint()) return 1;
                else if (o1.getAveragePoint() > o2.getAveragePoint()) return -1;
                else return 0;
            }
        });
        System.out.println("Danh sách sau khi sắp xếp");
        displayAll();
    }
    public void findHighestAveragePoint(){
//        Student studentMaxPoint = null;
        double highestPoint = 0;
        for (Student st : studentList) {

            if (st.getAveragePoint() > highestPoint){
                highestPoint = st.getAveragePoint();
//                studentMaxPoint = st;
            }
        }
        System.out.println("Danh sách sinh viên có điểm TB cao nhất với diểm số: " + highestPoint);
        for (Student st : studentList) {
            if (st.getAveragePoint() == highestPoint){
                System.out.println(st);
            }
        }
//        assert studentMaxPoint != null;
//        System.out.println("Sinh viên có điểm cao nhất là: " + studentMaxPoint.getName() + " với điểm trung bình: " + highestPoint);
    }
    public void displayAll(){
        for (Student st : studentList) {
            System.out.println(st);
        }
    }
}
