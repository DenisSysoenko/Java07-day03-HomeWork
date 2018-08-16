package org.andestech.learning.rfb18;

/**
 *
 * @author Daniil Demin
 */
 
class UserAccount implements IAccount {
    
    private int accountID;
    private int userID;
    private String accountOwner;
    private int currentCountRub;
// TODO: Раздвоение суммы на целый и дробные (рубли и копейки)
//  private int currentCountKopek;
    private int trnscID;
    String [] trnscHistory = new String [1000];

    UserAccount(String accountOwner, int firstPut, int userID) {
        this.accountOwner = accountOwner;
        this.currentCountRub = firstPut;
        this.userID = userID;
        trnscID = userID*1000;

    }

    @Override
    public void withdrawal(int amount) {
        String operStatus = "Неудачно";
        trnscID++;
        if (checkTransaction("withdrawal", amount)) {
            operStatus = "Успешно";
            System.out.println("Операция снятия прошла успешно. Остаток средств: " + currentCountRub + " руб.");
        } else {
            System.out.append("Совершение операции невозможно: указана невалидная сумма или на счете недостаточно средств");
        }
        trnscHistory[(trnscID - userID * 1000)] = (trnscID + "\t" + "Снятие" + "\t" + amount + " RUB" + "\t" + operStatus);
    }

    @Override
    public void put(int amount) {
        String operStatus = "Неудачно";
        trnscID++;
        if (checkTransaction("put", amount)) {
            currentCountRub = currentCountRub + amount;
            operStatus = "Успешно";
            System.out.println("Операция внесения прошла успешно. Внесено: " + amount + " руб.");
        } else {
            System.out.println("Совершение операции невозможно: указана невалидная сумма!");
        }
        trnscHistory [(trnscID - userID*1000)] = (trnscID + "\t" + "Снятие" + "\t" + amount + " RUB" + "\t" + operStatus);
    }

    @Override
    public boolean checkTransaction(String trnscType, int amount) {
        boolean trnscPassed = false;
        if (amount <= 0 ) {
            return trnscPassed;
        } else if (trnscType == "withdrawal" && amount > currentCountRub) {
            return trnscPassed;
        }
        trnscPassed = true;
        return trnscPassed;
    }

    @Override
    public void report() {
        System.out.println();
        System.out.println("==================================================");
        System.out.println("Отчет по транзакциям клиента " + accountOwner);
        System.out.println("==================================================");
        System.out.println("ID опер." + "\t" + "Операция" + "\t" + "Сумма" + "\t" + "Статус операции");
        System.out.println("--------------------------------------------------");
        for(int i = 1; i < (trnscID - userID*1000); i++) {
            System.out.println(trnscHistory[i]);
            System.out.println("..................................................");
        }
    }

    @Override
    public void report(int trnscID) {
        System.out.println(trnscHistory[trnscID - userID*1000]);
    }
}

