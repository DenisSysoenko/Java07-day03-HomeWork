package org.andestech.learning.rfb18;


public class Main
{
    public static void main( String[] args )
    {
        {
            User User = new User ("SomeName","SomeLastname");
            UserAccount ac = new UserAccount(User.getUserName(), 1000, User.getUserID()) {
                @Override
                public void withdrawal() {

                }

                @Override
                public boolean checkTransaction() {
                    return false;
                }

                @Override
                public void put() {

                }
            };
            ac.put(10);
            ac.withdrawal(300);
            ac.withdrawal(885420);

        }
    }
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
