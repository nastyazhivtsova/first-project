package first_create_class;

public class BankAccount {
    String owner;
    double balance;

    BankAccount(String someOwner, double someBalance){
        this.owner = someOwner;
        this.balance = someBalance;
    }

    String getOwner(){
        return owner;
    }

    double getBalance(){
        return this.balance;
    }

    void setOwner(String newOwner){
        this.owner = newOwner;
    }

    void setBalance(double newBalance){
        this.balance = newBalance;
    }

    double deposit(){
        double amount = balance + 1000;
        return amount;
    }

    double withdraw(){
        double amount = balance - 100;
        return amount;
    }


}
