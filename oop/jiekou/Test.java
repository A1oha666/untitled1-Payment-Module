package jiekou;

public class Test {
    public static void main(String[] args) {
        Student[] allstuents = new Student[5];
        allstuents [0] =new Student("捷风", '女',400);
        allstuents [1]=new Student("贤者",'女',90);
        allstuents [2] =new Student("钱包", '男',390);
        allstuents [3] =new Student("零", '男',300);
        allstuents [4] =new Student("暮蝶", '女',400);
        //ClassDataInter cdi = new ClassDataInterImpl1(allstuents);
        ClassDataInter cdi = new ClassDataInterImpl2(allstuents);
        cdi.printAllStudentsInfos();
        cdi.printAverageScore();

    }
}
