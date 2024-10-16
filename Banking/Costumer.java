import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class Costumer{
    String name;
    int age;
    boolean gender;
    List<BankAccount> accounts; 
    public Costumer(String name, int age, boolean gender, BankAccount account){
        this.name = name;
        this.age = age;
        this.gender = gender;
        List<BankAccount> accounts = new ArrayList<>();
        this.accounts.add(account);
    }

    public void createAccount(String accountName){
        if (this.accounts.size() == 0) {
            this.accounts.add(new BankAccount(accountName, this));
        }
        else {
            boolean isThereAlreadyAnAccount = false;
            for (BankAccount ba : accounts) {
                if (ba.getName().equals(accountName)) {
                    System.out.println("No account name duplication is allowed");
                    return;
                }
            }
            this.accounts.add(new BankAccount(accountName, this));
        }
    }

    public void SendMoney(String senderAccountName, Costumer partner, String partnerAccountName, int amount){
        BankAccount currentAccount = getAccount(senderAccountName);
        if (currentAccount == null) {
            throw new InvalidParameterException("There is no sender acount under the name " + senderAccountName);
        }
        currentAccount.balance -= amount;
        
    }

    private BankAccount getAccount(String accountName){
        BankAccount result = null;
        for (BankAccount ba : accounts){
            if (ba.getName().equals(accountName)){
                result = ba;
                break;
            }
        }
        return result;
    }

    public void receiveMoney(String receiverAccountName, Costumer sender, int amount){

    }
}