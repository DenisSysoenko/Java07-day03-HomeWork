package org.andestech.learning.rfb18;


import java.sql.SQLOutput;

public class HomeWork02
{
    public static void main( String[] args )
    {

        User user1 = new User("Karina","Malgazhdarova","656 56268 26464 5451");
        System.out.print("ФИО Клиента: " + user1.getName());
        System.out.println(" " +user1.getSurname());
        System.out.println("Номер счета клиента: " + user1.getNumberAccount() );



       UserAccount userAccount1 = new UserAccount();
        System.out.println("-------------------------------------------------");
       userAccount1.withdrawal(10000,"RUR");
        System.out.println("-------------------------------------------------");
       userAccount1.put(250000);

        System.out.println("-------------------------------------------------");
        user1.getName();
        System.out.println("-------------------------------------------------");
        userAccount1.checkTransaction();
        System.out.println("-------------------------------------------------");
        userAccount1.report();







}}





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



