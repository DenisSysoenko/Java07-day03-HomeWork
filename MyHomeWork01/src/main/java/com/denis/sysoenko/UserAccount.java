package com.denis.sysoenko;

import java.util.UUID;

public class UserAccount implements IAccount {

    // переменные
    double AccountBalance, MinimumLimit = 0.0, MaximumLimit = 10000.0;
    private double a,b;

    public UserAccount(double AccountBalance) {
        this.AccountBalance = AccountBalance;
        System.out.println("Доступно средств: " + AccountBalance + " рублей");
        System.out.println("--------------------------------------");
    }



    @Override
    public void withdrawal(double w) throws TransactionalException {
        if ((AccountBalance - w) < MinimumLimit ){
            // Как поставить эксепшн в нужное место, или вверх?
            throw new TransactionalException( "Операция невозможна. На счете не достаточно средств!" );

        }

        this.AccountBalance = (AccountBalance - w);
        this.a=w;
        System.out.println("С вашего счета списано: " + w + " рублей");
            System.out.println("Остаток средств на счете: " + AccountBalance + " рублей");
            System.out.println("--------------------------------------");
    }

    @Override
    public void put(double p) throws TransactionalException {
        if ((AccountBalance + p) > MaximumLimit ){
            // Как поставить эксепшн в нужное место, или вверх?
            throw new TransactionalException("Операция невозможна. Превышен лимит хранимых средств!");

        }

        this.AccountBalance = (AccountBalance + p);
        this.b=p;
        System.out.println("На ваш счет зачислено: " + p + " рублей");
        System.out.println("Остаток средств на счете: " + AccountBalance + " рублей");
        System.out.println("--------------------------------------------");

    }

    @Override
    public void CheckLimit() {
        System.out.println("Минимальный остаток на счете не может быть меньше: " + MinimumLimit + " рублей");
        System.out.println(("Лимит хранимых средств на счете: " + MaximumLimit + " рублей"));
        System.out.println("--------------------------------------------");


    }

    @Override
    public void report() {
        System.out.println("+++   Операции по счету   +++");
        System.out.println("Со счета снято: " + a + " рублей");
        System.out.println("Счет пополнен на: " + b + " рублей");
        System.out.println("Доступно: " + AccountBalance + " рублей");
        System.out.println("-------------------END----------------------");

    }

}




