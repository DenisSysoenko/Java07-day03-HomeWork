package org.andestech.learning.rfb18;

abstract class  UserAccount implements IAccount {

    private int currCount;
    private int transactID;
    private int userID;
    private String accountOwner;

    String [] transactHist = new String [500];

    UserAccount(String accountOwner, int firstPut, int userID) {
        this.accountOwner = accountOwner;
        this.currCount = firstPut;
        this.userID = userID;
        transactID = userID*500;

    }
    public void put(int amount) {
        String operStatus = "Ошибка при снятии";
        transactID++;
        if (checkTransaction("put", amount)) {
            currCount = currCount + amount;
            operStatus = "Успешно";
            System.out.println("Операция успешна. Зачислено: " + amount + " руб.");
        } else {
            System.out.println("Операция невозвожна. Неверная сумма");
        }
        transactHist[(transactID - userID*500)] = (transactID  + " Снятие" + "," + amount + " RUR" + "," + operStatus);
    }

    public void withdrawal(int amount) {
        String StatusTr = "Ошибка при снятии";
        transactID++;
        if (checkTransaction("withdrawal", amount)) {
            StatusTr = "Успешно";
            System.out.println("Операция успешна. Остаток на счёте: " + currCount + " руб.");
        } else {
            System.out.append("Операция невозвожна. Неверная сумма");
        }
        transactHist[(transactID - userID * 500)] = (transactID + " Снятие" + "," + amount + " RUR" + " " + StatusTr);
    }



    public boolean checkTransaction(String transactType, int amount) {
        boolean tPass = false;
        if (amount <= 0 ) {
            return tPass;
        } else if (transactType == "withdrawal" && amount > currCount) {
            return tPass;
        }
        tPass = true;
        return tPass;
    }

    public void report() {
        System.out.println();
        System.out.println("Отчет по транзакциям клиента " + accountOwner);
        System.out.println();
        System.out.println("ID опер." + "\t" + "Операция" + "\t" + "Сумма" + "\t" + "Статус операции");

        for(int i = 1; i < (transactID - userID*500); i++) {

            System.out.println(transactHist[i]);

        }
    }

}
