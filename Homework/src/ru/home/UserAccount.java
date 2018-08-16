package ru.home;

public class UserAccount implements IAccount {

    int totalSum;
    int sumforlimit;
    @Override
    public void withdrawal(int w) {
        System.out.println("Сняли со счета" + w);
    }

    @Override
    public void checkTransaction(int sumforlimit, int oursum) {
        this.sumforlimit = sumforlimit;
        if(oursum < this.sumforlimit){
            System.out.println("Transaction OK");
        } else {
            System.out.println("Transaction not OK");
        }
    }

    @Override
    public void put(int inMoney) {
        this.totalSum = inMoney;
        System.out.println("Положили на счет " + inMoney + " руб");
    }

    @Override
    public String report() {
        System.out.println(totalSum);
        return new String();
    }
}
