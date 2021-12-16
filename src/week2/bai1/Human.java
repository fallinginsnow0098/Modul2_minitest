package week2.bai1;

public class Human {
    public static int value = 1;
    public int id;
    public String name ;
    public int age ;


    public Human(String name, int age, double averagePoint) {
    }

    public Human(int id, String name, int age) {
        this.id = value;
        this.name = name;
        this.age = age;
        value++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
