import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    String name;
    Costumer owner;
    double balance;
    List<String> history;
    List<Costumer> partners;
    LocalDate lastUsage;

    public BankAccount(String name, Costumer owner){
        this.name = name;
        this.owner = owner;
        this.balance = 0;
        this.history = new ArrayList<>();
        this.partners = new ArrayList<>();
        this.lastUsage = LocalDate.now();
    }

    public String getName(){
        return this.name;
    }
}