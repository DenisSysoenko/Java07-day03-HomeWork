package ru.home;

public interface IAccount {
    public void withdrawal(int w);
    public void checkTransaction(int s, int k);
    public void put(int i);
    public String report();
}
