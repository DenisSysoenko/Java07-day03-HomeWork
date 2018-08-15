package org.andestech.learning.rfb18;

public class UserAccount implements IAccount {


    String number;
    double balance;
    String owner;
    String operationList;

   public UserAccount () {
        number = number; //"40817810570000123456";
        balance = balance; //450000;
        owner = owner;//"Ivanov";
        operationList = operationList;//"";
    }
// у меня определенно нелады с конструкторами
//    public UserAccount (String number, double balance,String owner,String operationList ){
//                this("40817810570000123456", 850000, "Ivanov","");
//            }

//    public UserAccount () {
//       this ("40817810570000123456", 48000, "Sidorov");
//           }





    @Override
    public void withdrawal(double sum) {
        balance = balance - sum;
        System.out.println("Со счета списано "+ sum + " руб. Текущий баланс составляет" + balance+" руб.");
        if (operationList == null)
        {operationList = "Списание " + sum+"руб. ";}
        else {operationList = operationList + "Списание " + sum+"руб. ";}
    }

    @Override
    public void checkTransaction() {
        System.out.println("Oперации по счету № "+number);
        System.out.println("(Владелец - " + owner + ")");
       if (operationList == null) {
           System.out.println("В отчетный период операций не выполнялось");}
       else {
           System.out.println("Список недавних операций:" + operationList);
       }

    }

    @Override
    public void put(double sum) {
        balance = balance + sum;
        System.out.println("На счет зачислено "+ sum + " руб. Текущий баланс составляет" + balance+" руб.");
        if (operationList == null)
        {operationList = "Зачисление " + sum+"руб. ";}
        else {operationList = operationList + "Зачисление " + sum+"руб. ";}

    }

    @Override
    public void report() {
        System.out.println("Текущий баланс составляет " + balance+" руб.");

    }
}
