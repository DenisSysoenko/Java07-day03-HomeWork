package ru.home;

public class UserAccount implements IAccount {

    int totalSum;
    int sumforlimit;
    int balance;

    public UserAccount createAccount(String ownerName, String ownerSecondName, int balance){
        balance = this.balance;
        System.out.println("Счет для пользователя" + " " + ownerName + " " + ownerSecondName + " " + "создан");
        System.out.println("Баланс: " + balance);
        return new UserAccount();
    }

    public int getBalance(int balance){
        return balance;
    }
    @Override
    public void withdrawal(int w) {

        System.out.println("Сняли со счета" + " " + w);
    }

    @Override
    public void checkTransaction(int sumforlimit, int oursum) {
        this.sumforlimit = sumforlimit;
        if(oursum <= this.sumforlimit){
            System.out.println("Лимит не превышен");
        } else {
            System.out.println("Лимит превышен");
        }
    }

    @Override
    public void put(int inMoney, int balance) {
        //this.totalSum = inMoney;
        System.out.print("Положили на счет " + inMoney + " руб" + "\t");
        System.out.println("Текущий баланс: " + (inMoney + getBalance(balance)));
    }

    @Override
    public String report() {
       // System.out.println(totalSum);
        return new String();
    }
}
