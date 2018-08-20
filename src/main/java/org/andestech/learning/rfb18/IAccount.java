package org.andestech.learning.rfb18;

/**
 * Created by Евгений on 20.08.2018.
 */
public interface IAccount {
    // ввод средств
    void put(int sumPlus);

    // вывод средств
    void withdrawal(int sumOff);

    // заполнение отчета о проведенной операции
    void setOperRep(int b);

    // вывод отчета о проведенной операции
    void getOperRep();

    // заполнение отчета операций
    void setReport(int a);

    // вывод отчета всех операций
    void getReport();

}
