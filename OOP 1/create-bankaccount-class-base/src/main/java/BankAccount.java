public class BankAccount {
    String accountNumber;
    int balance;
    double roi;

//    BankAccount(String accountNumber, int balance, double roi){
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//        this.roi = roi;
//    }

    double getSimpleInterest(int time){
        return (this.balance * this.roi * time)/100;
    }

    double getBalanceWithInterest(int time){
        return this.balance + getSimpleInterest(time);
    }
}
