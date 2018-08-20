package org.andestech.learning.rfb18;

import java.util.ArrayList;

/**
 * Created by Евгений on 20.08.2018.
 */
public class UserAccount implements IAccount {

    private int curSum = 0;
    private int sumPlus = 0;
    private int sumOff = 0;

    private String oper;

    ArrayList repList = new ArrayList<>();

    UserAccount (int curSum){
        this.curSum = curSum;
    }

    public int getCurSum() {
        return curSum;
    }

    public void setCurSum(int curSum) {
        this.curSum = curSum;
    }

    public int getSumPlus() {
        return sumPlus;
    }

    public void setSumPlus(int sumPlus) {
        this.sumPlus = sumPlus;
    }

    public int getSumOff() {
        return sumOff;
    }

    public void setSumOff(int sumOff) {
        this.sumOff = sumOff;
    }

    public String getOperRepoprt() {
        return oper;
    }

    public void setOperRepoprt(String operRepoprt) {
        this.oper = operRepoprt;
    }


    @Override
    public void put(int sumPlus) {
        this.sumPlus = sumPlus;
        int a = getCurSum();
        a += sumPlus;
        setCurSum(a);
        setOperRep(1);
        setReport(1);
        setSumPlus(sumPlus);
    }

    @Override
    public void withdrawal(int sumOff) {
        this.sumOff = sumOff;
        int b = getCurSum();
        b -= sumOff;
        setCurSum(b);
        setOperRep(2);
        setReport(2);
        setSumOff(sumOff);
    }

    @Override
    public void setOperRep(int b) {
        if (b == 1) {
            setOperRepoprt("Внесено: " + getSumPlus() + " рублей.");
        } else if (b == 2) {
            setOperRepoprt("Снято: " + getSumOff() + " рублей.");
        }

    }

    @Override
    public void getOperRep() {
        System.out.println(getOperRepoprt());
    }

    @Override
    public void setReport(int a) {
        if (a == 1) {
            repList.add("Операция: внесение денежных средств. Внесенная сумма: " + getSumPlus() +
                    " рублей. Остаток средств на счету: " +  getCurSum());
        } else if (a==2) {
            repList.add("Операция: снятие денежных средств. Сумма снятия: " + getSumOff() +
                    " рублей. Остаток средств на счету: " + getCurSum());
        }
    }

    @Override
    public void getReport() {
        for (int i = 0; i < repList.size(); i++) {
            System.out.println(repList.get(i));
        }
    }
}
