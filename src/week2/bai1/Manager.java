package week2.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public interface Manager {
    void displayAll();

    ArrayList<Human> addHuman(Scanner scanner, String name, int age, double averagePoint);

    void getHuman(Scanner scanner);

    void deleteHuman(Scanner scanner);

    void editHuman(Scanner scanner);

    void sortList();

    void sumAveragePoint();

    int compare(Human o1, Human o2);
}
