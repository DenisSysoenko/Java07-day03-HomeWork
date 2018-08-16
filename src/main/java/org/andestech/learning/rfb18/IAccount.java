package org.andestech.learning.rfb18;

/**
 *
 * @author Daniil Demin
 */

interface IAccount {
    void withdrawal(int intrCountRub);
    boolean checkTransaction(String trnscType, int amount);
    void put(int amount);
    void report(int trnscID);
    void report();
}
