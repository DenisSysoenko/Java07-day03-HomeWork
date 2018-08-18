package org.andestech.learning.rfb18;

import java.util.Date;

public interface IAccount{
    void withdrawal(double amount_cr,String currency);
    void checkTransaction();
    void put(double amount);
    void report();
}