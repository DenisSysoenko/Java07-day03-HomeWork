

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

    public class Main {

        public static void main(String[] args) {
            UserAccount userAccount = new UserAccount();
            User user = new User();

            user.account = "40817.810.0.99910004312";
            user.accountLimit = 100;
            user.accountSumma = 500;

            userAccount.put(user, 5);
            userAccount.withdrawal(user, 130);
            userAccount.put(user, 30);
            userAccount.put(user, 100);
            userAccount.withdrawal(user, 100000);
            userAccount.report(user);
            userAccount.balance(user);
        }

    }