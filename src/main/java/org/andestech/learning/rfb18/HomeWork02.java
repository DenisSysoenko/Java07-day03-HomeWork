package org.andestech.learning.rfb18;


public class HomeWork02
{
    public static void main( String[] args )
    {
        User Boris = new User ("Boris","Blade");
        User Tirion = new User ("Tirion", "Lanister");
        UserAccount ac0 = new UserAccount(Boris.getUserName(), 1000, Boris.getUserID());
        UserAccount ac1 = new UserAccount(Tirion.getUserName(), 1000000, Tirion.getUserID());
        ac0.put(1500);
        ac0.withdrawal(578);
        ac0.report();
        ac1.put(15000);
        ac1.withdrawal(98797);
        ac1.report(); 
    }
}

