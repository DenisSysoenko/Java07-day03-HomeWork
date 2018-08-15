package org.andestech.learning.rfb18;


public class HomeWork02
{
    public static void main( String[] args )
    {
/*
*
* TODO:
*
* Создать интерфейс IAccount с методами
* withdrawal, checkTransaction, put, report.
*
* Создать классы User, UserAccount (реализующий интерфейс IAccount ).
* Добавить необходимые поля и методы для работы счета.
* Произвести в методе main проверку: создать экземпляры User, UserAccount,
* положить на счёт некую сумму, проверить лимиты, снять сумму, вывести отчёт операций.
 *
* */

        User Ivanov = new User();
        UserAccount acc1 = new UserAccount();
        acc1.owner = Ivanov.lastName + Ivanov.firstName;
        acc1.number = "40817810570000123456";
        acc1.put(5000);
        acc1.withdrawal(350);
        acc1.checkTransaction();
        acc1.report();
    }
}
