package pay;

public class silverCard extends card {
    public silverCard(String cadId, String name, String phone, double money) {
        super(cadId, name, phone, money);
    }

    public void costmoney(double money) {
        System.out.println("当前类型：银卡");
        if(getMoney()<money*0.9){
            System.out.println("余额不足！");
            System.out.println("余额："+getMoney());
            return;
        }
        System.out.println("消费：" + money + " CNY");
        System.out.println("优惠后为" + money * 0.9 + " CNY");
        setMoney(getMoney() - money * 0.9);//这里的Money是消费money
        System.out.println("余额为" + getMoney() + " CNY");
    }
}
