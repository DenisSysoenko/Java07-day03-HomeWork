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
        User user1 = new User();
        UserAccount userAccount1 = new UserAccount();

        user1.user="Sergey";
        user1.account="40817.810.0.11110002222";
        user1.accountLim=1000;
        user1.accountSum=0;

        userAccount1.put(user1,300);
        userAccount1.withdrawal(user1,150);
        userAccount1.withdrawal(user1,150);
        userAccount1.withdrawal(user1,1);


        userAccount1.report(user1);

    }
}
