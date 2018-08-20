package org.andestech.learning.rfb18;


public class HomeWork02
{
    public static void main(String[] args )
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

// создание нового клиента
        User user1 = new User("Иванов Иван Виванович");
        System.out.println(user1.getFio());

        // создание аккаунта с начальной суммой
        UserAccount useracc1 = new UserAccount(500);

        // проверка лимита
        System.out.println(useracc1.getCurSum());


        // положить деньги на счет
        useracc1.put(77);
        // отчет о проведенной операции
        useracc1.getOperRep();


        // отчет всех операций
        useracc1.getReport();


        // снять деньги со счета
        useracc1.withdrawal(31);
        // отчет о проведенной операции
        useracc1.getOperRep();


        // отчет всех операций
        useracc1.getReport();


    }
}
