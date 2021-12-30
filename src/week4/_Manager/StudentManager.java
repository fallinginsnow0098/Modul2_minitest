package week4._Manager;

import week4._Model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static final String PATH_NAME = "src/week4/_File/student.txt";
    private final ArrayList<Student> students ;
    private final Scanner scanner = new Scanner(System.in);

    public StudentManager() {
        this.students = readFileCSV(PATH_NAME);
    }
    public ArrayList<Student> getStudent(){
        return students;
    }
    public void addStudent(){
        System.out.println("Input id");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input name");
        String name = scanner.nextLine();
        System.out.println("Input age");
        int age = scanner.nextInt();
        System.out.println("Input Math Point");
        double mathPoint = scanner.nextDouble();
        System.out.println("Input Physics Point");
        double physicsPoint = scanner.nextDouble();
        System.out.println("Input Chemistry Point");
        double chemistryPoint = scanner.nextDouble();
        students.add(new Student(id, name, age, mathPoint, physicsPoint, chemistryPoint));
        System.out.println("Add Student: [" + name + "] complete!");
        writeFileCSV(students, PATH_NAME);

    }
    public void editStudent(String editName){
        Student editStudent = null;
        for (Student st : students ) {
            if (st.getName().equals(editName)){
                editStudent = st;
            }
        }
        if (editStudent != null){
            int index = students.indexOf(editStudent);
            System.out.println("Input new id");
            int newId = scanner.nextInt();
            System.out.println("Input new name");
            String newName = scanner.nextLine();
            System.out.println("Input new age");
            int newAge = scanner.nextInt();
            System.out.println("Input new Math Point");
            double newMathPoint = scanner.nextDouble();
            System.out.println("Input new Physics Point");
            double newPhysicsPoint = scanner.nextDouble();
            System.out.println("Input new Chemistry Point");
            double newChemistryPoint = scanner.nextDouble();
            editStudent.setId(newId);
            editStudent.setName(newName);
            editStudent.setAge(newAge);
            editStudent.setMathPoint(newMathPoint);
            editStudent.setPhysicsPoint(newPhysicsPoint);
            editStudent.setChemistryPoint(newChemistryPoint);
            students.set(index, editStudent);
            writeFileCSV(students, PATH_NAME);
            System.out.println("Edit student: " + editName + " DONE");
        }
    }
    public void deleteStudent(String deleteName){
        Student deletedStudent = null;
        for (Student  student : students) {
            if (student.getName().equals(deleteName)){
                deletedStudent = student;
            }
        }
        if (deletedStudent != null){
            students.remove(deletedStudent);
            writeFileCSV(students, PATH_NAME);
            System.out.println("DELETE student: " + deleteName + " DONE!!");
        }
    }
    public void searchByID(int searchID){
        Student searchStudent = null;
        for (Student student : students) {
            if(student.getId() == searchID){
                searchStudent = student;
            }
        }
        System.out.println(searchStudent);
    }
    public void sortGPAUp(){
        students.sort((o1, o2) -> {
            if (o1.getGPA() > o2.getGPA()) return 1;
            else if (o1.getGPA() < o2.getGPA()) return -1;
            else return 0;
        });
        students.forEach(System.out::println);
    }
    public void sortGPADown(){
        students.sort((o1, o2) -> {
            if (o1.getGPA() > o2.getGPA()) return -1;
            else if (o1.getGPA() < o2.getGPA()) return 1;
            else return 0;
        });
        students.forEach(System.out::println);
    }
    public void findHighestGPAStudent(){
        ArrayList<Student> bestStudents = new ArrayList<>();
        double maxGPA = 0;
        Student bestStudent = null;
        for (Student student: students) {
            if (student.getGPA() > maxGPA){
                maxGPA = student.getGPA();
                bestStudent = student;
            }
        }
        bestStudents.add(bestStudent);
        bestStudents.forEach(System.out::println);
    }
    public void writeFileCSV(ArrayList<Student> students, String pathName){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(pathName));
            for (Student student : students) {
                bw.write(student.getId() + "," +
                        student.getName() + "," +
                        student.getAge() + "," +
                        student.getMathPoint() +"," +
                        student.getPhysicsPoint() + "," +
                        student.getChemistryPoint() + "," +
                        student.getGPA() + "\n"
                );
            }
            bw.close();
            System.out.println("Write file --- DONE !");
        } catch (IOException e) {
            System.err.println("File not exists or ERROR!");
        }
    }
    public ArrayList<Student> readFileCSV(String path){
        ArrayList<Student> students = new ArrayList<>();
        File file = new File(PATH_NAME);
        try {
            if (!file.exists()){
                file.createNewFile();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line ;
            while ((line = bufferedReader.readLine()) != null){
                String[] strings = line.split(",");
                students.add(new Student(
                        Integer.parseInt(strings[0]),
                        strings[1],
                        Integer.parseInt(strings[2]),
                        Double.parseDouble(strings[3]),
                        Double.parseDouble(strings[4]),
                        Double.parseDouble(strings[5])));}
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }
}
