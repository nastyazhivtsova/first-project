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

    double setBalance(double newBalance){ // заменила в сеттере тип возвращаемых данных
        return this.balance = newBalance;
    }

    double deposit( double amount){ //добавила формулу, используя геттеры
        return setBalance(amount + getBalance());
    }

    double withdraw(double amount){
        return setBalance(getBalance() - amount);
    }


}
