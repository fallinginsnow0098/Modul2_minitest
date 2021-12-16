package week1.bai1;

public class Product {
    int code ;
    String  name ;
    double cost ;
    String type ;
    String moneyType = "USD" ;
    public Product(){}
    public Product(int code, String name, double cost, String type, String moneyType){
        this.code = code ;
        this.name = name ;
        this.cost = cost ;
        this.type = type ;
        this.moneyType = moneyType ;
    }

    public Product(int code, String name, double cost, String type) {
        this.code = code;
        this.name = name;
        this.cost = cost;
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(String moneyType) {
        this.moneyType = moneyType;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", type='" + type + '\'' +
                ", moneyType='" + moneyType + '\'' +
                '}';
    }
}
