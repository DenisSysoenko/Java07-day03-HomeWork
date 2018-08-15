public class UserAccount implements IAccount {

    @Override
    public void withdrawal(User user, int summa) {
        if (checkTransaction(user, summa)) {
            user.accountSumma = user.accountSumma - summa;
            user.operation[user.counter_operation]=" Удалось списать cо счета " +user.account + " " +summa + " рублей";
            user.counter_operation++;
            user.counter_limit+=summa;
        } else {
            user.operation[user.counter_operation]=" Не удалось списать cо счета  " +user.account + " "+summa + " рублей";
            user.counter_operation++;
        }
    }

    @Override
    public boolean checkTransaction(User user, int summa) {
           return !(user.accountSumma<=0) & !(user.accountLimit<=summa) &!(user.accountLimit<=user.counter_limit);
    }

    @Override
    public void put(User user, int summa) {
        user.accountSumma = user.accountSumma + summa;
        user.operation[user.counter_operation]=" Счет " + user.account+ " пополнен на  " +summa + " рублей";
        user.counter_operation++;
    }

    @Override
    public void report(User user) {
        for (int i = 0; i <user.counter_operation; i++) {
            System.out.println(user.operation[i]);
        }
        }

     @Override
     public void balance(User user)
     {
         System.out.println(" На счету "+user.account+ " "+user.accountSumma + " рублей");
     }

    }

