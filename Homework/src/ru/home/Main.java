package ru.home;

public class Main {

    public static void main(String[] args) {

        User user = new User();
        user.createUser("Иван","Иванов");
        UserAccount userAccount = new UserAccount();
        userAccount.createAccount("Иван", "Иванов", 5000);
      //
        userAccount.put(100, 5000);
        userAccount.checkTransaction(500, 100);
        userAccount.withdrawal(250);
        userAccount.report();
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
