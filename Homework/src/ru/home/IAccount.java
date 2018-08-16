package ru.home;

public interface IAccount {
    public void withdrawal(Integer w);
    public void checkTransaction(Integer s, Integer k);
    public void put(Integer i);
    public String report();
}
