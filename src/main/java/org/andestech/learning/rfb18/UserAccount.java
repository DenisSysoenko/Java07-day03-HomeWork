package org.andestech.learning.rfb18;

public class UserAccount implements IAccount {

    @Override
    public void withdrawal(User user, int summa)
    {
        if (checkTransaction(user,summa))
        {
            user.accountSum=user.accountSum - summa;
            user.operations[user.counter]="Успешное списание со счета: " + user.account + " " + summa + " рублей."+"\n"+"На вашем счете " + " " +user.accountSum + " рублей";
            user.counter++;
        }
        else
        {
            user.operations[user.counter]="Не удалось списать со счета: " + user.account + " " + summa + " рублей."+"\n"+"На вашем счете " + " " +user.accountSum + " рублей";
            user.counter++;
        }
    }
    @Override
    public boolean checkTransaction(User user, int summa)
    {
        return !(user.accountSum<=0) & !(user.accountLim <= summa) & !(user.accountSum<summa);
    }

    @Override
    public void put (User user, int summa)
    {
        user.accountSum=user.accountSum + summa;
        user.operations[user.counter]="Успешное зачисление на счет: " + user.account + " " + summa + " рублей."+"\n"+"На вашем счете " + " " +user.accountSum + " рублей";
        user.counter++;

    }

    @Override
    public void report(User user)
    {
        for (int i=0; i<user.counter; i++) {
            System.out.println(user.operations[i]);
        }
    }

}
