package abstract;
abstract class Bank {
    public abstract void getBalance();
}

class BankA extends Bank {
    int balance = 100;
    public void getBalance() {
        System.out.println("Balance in Bank A: $" + balance);
    }
}

class BankB extends Bank {
    int balance = 150;
    public void getBalance() {
        System.out.println("Balance in Bank B: $" + balance);
    }
}

class BankC extends Bank {
    int balance = 200;
    public void getBalance() {
        System.out.println("Balance in Bank C: $" + balance);
    }
}

public class TestBank {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        bankA.getBalance();
        BankB bankB = new BankB();
        bankB.getBalance();
        BankC bankC = new BankC();
        bankC.getBalance();
    }
}
