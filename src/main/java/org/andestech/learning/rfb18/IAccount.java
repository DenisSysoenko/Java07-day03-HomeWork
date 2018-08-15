package org.andestech.learning.rfb18;

public interface IAccount {
    void withdrawal(User user, int summa);
    boolean checkTransaction(User user, int summa);
    void put (User user, int summa);
    void report (User user);

}
