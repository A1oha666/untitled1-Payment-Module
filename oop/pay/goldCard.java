package pay;

public class goldCard extends card {
    public goldCard(String carId,String name,String phone,double money) {
        super(carId,name,phone,money);
    }
    public void costmoney(double money) {
        System.out.println("当前类型：金卡");
        if (getMoney() < money * 0.8) {
            System.out.println("余额不足！");
            System.out.println("余额："+getMoney());
            return;
        }
        System.out.print("消费：" + money + " CNY。");
        System.out.println("优惠后为" + money * 0.8 + " CNY");
        setMoney(getMoney() - money * 0.8);//这里的Money是消费money
        System.out.println("余额为" + getMoney() + " CNY");
        if(money*0.8 >= 200){
            ptTicket();
        }else{
            System.out.println("消费未满200无洗车票赠送");
        }
    }
    public void ptTicket(){
        System.out.println("送洗车票一张，请打印");
    }

}
