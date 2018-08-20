package com.denis.sysoenko;


public class App 
{
    public static void main( String[] args ) throws TransactionalException {

        // Первый клиент, без исключений
        User user1 = new User("Вася", "Пупкин");
        UserAccount account1 = new UserAccount(500);
        account1.withdrawal(500.0);
        account1.put( 10000 );
        account1.CheckLimit();
        account1.report();

       /* // Второй клиент, недостаточно средств для снятия
        User user2 = new User( "Иван", "Иванов");
        UserAccount account2 = new UserAccount( 5000 );
        account2.withdrawal( 5948 );
        account2.withdrawal( 4257 );
        account2.put( 3423 );
        account2.CheckLimit();
        account2.report();
        */

       /* // Третий клиент, нельзя положить больше чем верхний лимит счета.
        User user3 = new User( "Петр", "Петров" );
        UserAccount account3 = new UserAccount( 9976 );
        account3.withdrawal( 5476 );
        account3.put( 8546 );
        account3.put( 3123 );
        account3.CheckLimit();
        account3.report();
        */
    }
}