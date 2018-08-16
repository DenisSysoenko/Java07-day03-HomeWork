package ru.home;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        UserAccount account = user.createAccount();
      //
        account.put(100);
        account.checkTransaction(500, 1000);
        account.withdrawal(250);
        account.report();
    }
        /*
    * TODO:
    *
    * Создать интерфейс IAccount с методами
    * withdrawal, checkTransaction, put, report.
    *
    * Создать классы User, UserAccount (реализующий интерфейс IAccount ).
    * Добавить необходимые поля и методы для работы счета.
    * Произвести в методе main проверку: создать экземпляры User, UserAccount,
    *положить на счёт некую сумму, проверить лимиты, снять сумму, вывести отчёт операций.
    *
     */

}
