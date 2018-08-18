package org.andestech.learning.rfb18;


public class HomeWork02
{
    public static void main( String[] args )
    {

        User user1 = new User("Tom","Kukuruz");

        UserAccount userAccount1 = new UserAccount(35_000);

        user1.setUserAccount(userAccount1.getAccount_id());

        userAccount1.checkTransaction();

        userAccount1.withdrawal(3_000);

        userAccount1.put(7_000);

        userAccount1.withdrawal(33_000);

        userAccount1.report();



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


    }
}
