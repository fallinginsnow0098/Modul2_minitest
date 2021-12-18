package week2;

public interface Manager {
    void displayAll();
    void addHuman(Human human);
    Human searchById(int id);
    void deleteById(int id);
    Student editHuman(int id);
    void sortAvg();
    void totalPoint();
}
