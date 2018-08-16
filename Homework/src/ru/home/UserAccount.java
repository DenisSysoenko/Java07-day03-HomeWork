package ru.home;

public class UserAccount implements IAccount {

    Integer totalSum;
    Integer sumforlimit;
    @Override
    public void withdrawal(Integer w) {
        System.out.println("Сняли со счета" + w);
    }

    @Override
    public void checkTransaction(Integer sumforlimit, Integer oursum) {
        this.sumforlimit = sumforlimit;
        if(oursum < this.sumforlimit){
            System.out.println("Transaction OK");
        } else {
            System.out.println("Transaction not OK");
        }
    }

    @Override
    public void put(Integer inMoney) {
        this.totalSum = inMoney;
        System.out.println("Положили на счет " + inMoney + " руб");
    }

    @Override
    public String report() {
        System.out.println(totalSum);
        return new String();
    }
}
