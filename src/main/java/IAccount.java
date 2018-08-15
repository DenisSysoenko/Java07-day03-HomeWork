public interface IAccount {
    void withdrawal(User user, int summa);
    boolean checkTransaction(User user, int summ);
    void put(User user, int summa);
    void report(User user);
    void balance(User user);
}
