package week1.bai1;

public class Product {
    String code , name ;
    double cost ;
    String type ;
    String moneyType = "USD" ;
    public Product(){}
    public Product(String code, String name, double cost, String type, String moneyType){
        this.code = code ;
        this.name = name ;
        this.cost = cost ;
        this.type = type ;
        this.moneyType = moneyType ;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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

}
