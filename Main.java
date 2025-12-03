class BankAccount{
    String accountHolder;
    double balance;
    BankAccount(String name,double amount){
        accountHolder=name;
        balance=amount;
    }
    void deposit(double amt){
        balance+=amt;
    }
    void withdraw(double amt){
        if(amt<=balance){
            balance-=amt;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    void display(){
        System.out.println(accountHolder+"has balance:"+balance);
    }
}
public class Main{
    public static void main(String[] args) {
        BankAccount acc1=new BankAccount("ravi", 5000);
        
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.display();
    }
}