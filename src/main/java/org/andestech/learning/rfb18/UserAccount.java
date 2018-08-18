package org.andestech.learning.rfb18;

import java.util.ArrayList;
import java.util.UUID;

public class UserAccount implements IAccount {

    private static double MIN_AMMOUNT = 100;//минимальная сумма для операции
    private static double MAX_AMMOUNT = 50_000;//максимальная сумма для операции
    private static double MIN_BALANCE = 0;//минимальная сумма остатка на счете

    private String account_id;//идентификатор счета
    private double balance;//баланс счета

    private ArrayList<String> reportList = new ArrayList<String>();


    public UserAccount(){

    }

    public UserAccount(double balance){
        account_id = UUID.randomUUID().toString();
        this.balance = balance;
        reportList.add("\n\tОтчет. \n");
        reportList.add("Создание счета: " + account_id + "с начальной суммой: " + balance + " RUB.");
    }


    public void withdrawal(final double ammount){//снятие средств
        if(ammount < MIN_AMMOUNT){
            System.out.println("Операция невозможна, минимальная сумма для снятия " + MIN_AMMOUNT + " RUB\n");
        }
        else if(MIN_AMMOUNT <= ammount && ammount <= MAX_AMMOUNT){
            double res = balance - ammount;
            if(res < MIN_BALANCE){
                System.out.println("Операция невозможна, недостаточно средств на счете");
                System.out.println("Текущий баланс: " + balance + " RUB");
                System.out.println("Сумма операции: " + ammount + " RUB\n");
            }
            else{
                balance = res;
                System.out.println("Оцерация снятия средств выполнена");
                System.out.println("Текущий баланс: " + balance + " RUB");
                System.out.println("Сумма операции: " + ammount + " RUB\n");
                reportList.add("Снятие средств со счета. Сумма операции: " + ammount + " RUB. Остаток на счете: " + balance + " RUB.");
            }
        }
        else if(ammount > MAX_AMMOUNT){
            System.out.println("Операция невозможна, максимальная сумма для снятия " + MAX_AMMOUNT + " RUB\n");
        }
        else{
            System.out.println("Что-то пошло не так...");
        }
    }

    public void checkTransaction(){
        System.out.println("Минимальная сумма операции " + MIN_AMMOUNT + " RUB\n");
        System.out.println("Максимальная сумма операции " + MAX_AMMOUNT + " RUB\n");
    }

    public void put(final double ammount){//пополнение счета
        if(ammount < MIN_AMMOUNT){
            System.out.println("Минимальная сумма пополнения " + MIN_AMMOUNT + " RUB\n");
        }
        else if(MIN_AMMOUNT <= ammount && ammount <= MAX_AMMOUNT){
            balance = balance + ammount;
            System.out.println("Операция пополнения счета выполнена успешно");
            System.out.println("Текущий баланс: " + balance + " RUB");
            System.out.println("Сумма операции: " + ammount + " RUB\n");
            reportList.add("Пополнение счета. Сумма операции: " + ammount + " RUB. Остаток на счете: " + balance + " RUB.");
        }
        else if(ammount > MAX_AMMOUNT){
            System.out.println("Максимальная сумма пополнения " + MAX_AMMOUNT + " RUB\n");
        }
        else{
            System.out.println("Что-то пошло не так...");
        }
    }

    public void report(){
        for(Object o : reportList){
            System.out.println(o);
        }
    }

    public String getAccount_id() {
        return account_id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
