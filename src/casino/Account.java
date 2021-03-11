package casino;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {

    private static Scanner input = new Scanner(System.in);
    public static ArrayList<Account> AccountList = new ArrayList<>();

    String playerName;
    String password;
    double balance;

    public Account(String playerName, String password, double balance) {
        this.playerName = playerName;
        this.password = password;
        this.balance = balance;
    }

    public String toString() {
        return playerName + ", " + password + ", " + balance;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password= password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    }
    


        
          
