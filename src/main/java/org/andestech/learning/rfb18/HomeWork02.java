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
    User client_name = new User(new UserAccount(55555,60000));
    client_name.getAccount().put(4000);
    client_name.getAccount().checkTransaction();
    client_name.getAccount().put(7000);
    client_name.getAccount().withdrawal(1234);
    client_name.getAccount().put(100);
    client_name.getAccount().put(4000);
    client_name.getAccount().withdrawal(234);
    client_name.getAccount().checkTransaction();
    System.out.println(client_name.getAccount().report());


    }
}
