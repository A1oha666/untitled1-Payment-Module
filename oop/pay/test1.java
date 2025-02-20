package pay;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        goldCard cd1 = new goldCard("沪A00006","***","13918866686",500000);
        silverCard cd2 = new silverCard("沪A00007","**","13916610006",3000);
        pay(cd1);
        pay(cd2);
    }
    //支付机
    public static void pay(card cd) {
        System.out.println("----请刷卡 please put your card----");
        System.out.println("请输入消费金额 please enter the fee:");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        cd.costmoney(money);
    }
}
