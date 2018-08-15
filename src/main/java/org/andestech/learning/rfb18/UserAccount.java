package org.andestech.learning.rfb18;
import java.util.Random;

public class UserAccount implements IAccount {

    private String AccountId;
    private String currency;
    private float balance;
    private int accountOwner;
    private String[] journal = new String[20];
    private int journalEntry;

    public static UserAccount createAccount(int accountOwner){
        return new UserAccount(accountOwner);
    }

    public UserAccount(int accountOwner){
        Random rnd = new Random(System.currentTimeMillis());
        AccountId = String.format("4070281987654978%s", rnd.nextInt(100000));
        currency = "RUR";
        balance = 0f;
        this.accountOwner = accountOwner;
    }

    public UserAccount(){
        journalEntry = 0;
    }

    private void logJournal(String entry){
        journal[journalEntry] = entry;
        journalEntry++;
    }

    public void withdrawal(float sum) {
        this.balance = sum > balance ? 0 : balance - sum;

        System.out.println("Withdrawal with " + sum + " " + currency);
        logJournal("Cash withdrawal");
    }

    public void checkTransaction(){
        for (int i = 0; i < journalEntry; i++) {
            System.out.println(journal[i]);
        }
        System.out.println("----------------End of the journal reached------------");
    }

    public void put(float sum){
        this.balance += sum;
        logJournal("Cash Refill");
    }

    public void report(){
        System.out.println("Your balance is " + balance);
        logJournal("Viewing details");
    }

    public String getAccountId() {
        return AccountId;
    }

    public void setAccountId(String accountId) {
        AccountId = accountId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
