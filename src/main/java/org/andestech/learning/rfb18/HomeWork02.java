package org.andestech.learning.rfb18;


public class HomeWork02
{

    //some test functions
    private static void printUserInfo(User user){
        System.out.println("userid " + user.getId() + " user name " + user.getUserName() + " user surname " + user.getUserSurname());
    }

    private static void printAccountInfo(UserAccount account){
        System.out.println("accountId " + account.getAccountId() + " with currency " + account.getCurrency() + " and balance " + account.getBalance());
        account.report();
    }

    public static void main( String[] args )
    {
/*
*
* TODO:
*
* done Создать интерфейс IAccount с методами
* done withdrawal, checkTransaction, put, report.
*
* done Создать классы User, UserAccount (реализующий интерфейс IAccount ).
* Добавить необходимые поля и методы для работы счета.
* Произвести в методе main проверку: создать экземпляры User, UserAccount,
* положить на счёт некую сумму, проверить лимиты, снять сумму, вывести отчёт операций.
 *
* */
        User user1 = User.createUser("Иван", "Иванов");
        User user2 = User.createUser("Петр", "Петров");

        printUserInfo(user1);
        printUserInfo(user2);

        UserAccount user1account1 = UserAccount.createAccount(user1.getId());
        UserAccount user1account2 = UserAccount.createAccount(user1.getId());

        user1account1.put(10.5f);
        user1account2.put(200f);
        user1account1.getBalance();
        user1account2.getBalance();

        user1account1.withdrawal(10);
        user1account2.report();
        user1account1.getBalance();
        user1account2.getBalance();

        user1account1.checkTransaction();
        user1account2.checkTransaction();

        UserAccount user2account1 = UserAccount.createAccount(user2.getId());

        printAccountInfo(user1account1);
        printAccountInfo(user1account2);
        printAccountInfo(user2account1);

    }
}
