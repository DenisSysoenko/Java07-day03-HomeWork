package org.andestech.learning.rfb18;

/**
 *
 * @author Daniil Demin
 */

interface IAccount {
    void withdrawal(int intrCountRub);
    String checkTransaction(int trnscID);
    void put(int amount);
    void report(int trnscID);
    void report();
}
