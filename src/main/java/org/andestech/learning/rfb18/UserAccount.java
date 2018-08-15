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
    private int currentCountKopek;
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
        if(amount > 0) {
            if((currentCountRub - amount) > 0){
                currentCountRub = currentCountRub - amount;
                operStatus = "Успешно";
                System.out.println("Операция снятия прошла успешно. Остаток средств: " + currentCountRub + " руб.");
            } else {
                System.out.println("Совершение операции невозможно: на счете недостаточно средств");
            }   
        } else {
            System.out.append("Совершение операции невозможно: указана невалидная сумма!");
        }
        trnscHistory [(trnscID - userID*1000)] = (trnscID + "\t" + "Снятие" + "\t" + amount + " RUB" + "\t" + operStatus);
    }
 
    @Override
    public void put(int amount) {
        String operStatus = "Неудачно";
        trnscID++;
        if(amount > 0) {
            currentCountRub = currentCountRub + amount;
            operStatus = "Успешно";
            System.out.println("Операция внесения прошла успешно. Внесено: " + amount + " руб.");
        } else {
            System.out.println("Совершение операции невозможно: указана невалидная сумма!");
        }
        trnscHistory [(trnscID - userID*1000)] = (trnscID + "\t" + "Снятие" + "\t" + amount + " RUB" + "\t" + operStatus);
    }
    
    @Override
    public String checkTransaction(int trnscID) { 
        return (trnscHistory[(trnscID - userID*1000)]); 
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

