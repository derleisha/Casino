package casino;

import java.util.ArrayList;
import java.util.Scanner;

public class Casino {

    private static Scanner input = new Scanner(System.in);
    protected static ArrayList<Account> AccountList = new ArrayList<>();
    protected static String userName;
    protected static String password;

    public static void main(String[] args) {
        AccountList = FileHandling.readFile();
        

        mainMenu();

    }

    public static void mainMenu() {
        while (true) {
            int choice;

            System.out.println("***** Welcome to Dynamite Casino *****");
            System.out.println("What would you like do: \n 1. create a new account \n 2. view your account \n 3. play BlackJack \n 4. Higher Or Lower \n 5. SlotMachine \n 0.Exit");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                   Login.createAccount();
                    break;
                case 2:
                    Login.checkAccount();
                    break;
                case 3:
                    
                   playBlackJack();

                    break;
                case 4:
                    playHigherOrLower();
                    break;
                            
                case 5:
                    System.out.println("Slot Machine");
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
    


    public static void playBlackJack(){
        BlackJack.runBlackJack();
    }
    public static void playHigherOrLower(){
        HigherOrLower.runHigherOrLower();
    }
}
  
    

