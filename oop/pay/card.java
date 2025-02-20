package pay;

public class card{
    public card(String carId,String name,String phone,double money){
        this.carId=carId;
        this.name=name;
        this.phone=phone;
        this.money=money;
    }
    private String carId;
    private String name;
    private String phone;
    private double money;
    public void savemoney(double money) {

        this.money += money;
    }
    public void costmoney (double money) {

        this.money -= money;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
