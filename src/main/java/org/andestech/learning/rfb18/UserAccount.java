package org.andestech.learning.rfb18;


import java.util.ArrayList;
import java.util.Date;

public class UserAccount implements IAccount {

    double Min_sum = 10000;
    double Max_limit = 300000;
    double account = 50000;
    String currency;
    double amount_cr;
    double amount_db;
    double limit;
    ArrayList<String> list =new ArrayList();



    public UserAccount() {
        list.add("Баланс на начало: " + account);



    }

    public void withdrawal(double amount_cr, String currency) {
        double result = account - amount_cr;
        if (result >= Min_sum) {
            account=result;
            System.out.println("Со счета снято: " + amount_cr + " RUR");
            System.out.println("Остаток на счете: " + result + " RUR");
            list.add("Cо счета снято: " + amount_cr);
        }

        else

        {
            System.out.println("Снятие средств недоступно: " + amount_cr + " RUR");
            System.out.println("Минимальная сумма остатка на счете: " + Min_sum + " RUR");
        }
    }


    public void checkTransaction()  {

        System.out.println("Проверка доступной суммы на счете: " + account);

    }

    public void put(double amount_db) {

        double result = account + amount_db;
        if (result <= Max_limit) {
            account=result;
            System.out.println("На счет внесена сумма: " + amount_db + " RUR");
            System.out.println("Остаток на счете: " + result + " RUR");
            list.add("На счет внесена сумма: " + amount_db);
            list.add("Остаток на конец операций: " + account);
        }

        else

        {
            System.out.println("Операция пополненения  счета на сумму: " + amount_db + " RUR невозможна, текущий баланс счета " + account);
            System.out.println("Максимально возможная сумма на счете: " + Max_limit + " RUR");
        }
    }

    public void report() {

        System.out.println("Отчет операций на счете");
        for (Object o: list)
            System.out.println(o);
    }
}

