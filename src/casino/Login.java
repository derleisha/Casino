package casino;

import java.util.Scanner;

public class Login extends Casino {

    public static Scanner input = new Scanner(System.in);

    public static boolean login() {

        String correctPassword;

        System.out.println("Enter a username:");
        userName = input.next();
        System.out.println(userName);
        System.out.println("Enter a password: (must be at least 8 characters long and include a number(s)) ");
        password = input.next();

        int index = checkAccount();
        if (index != -1) {
            correctPassword = AccountList.get(index).getPassword();
            if (password.equals(correctPassword)) {
                System.out.println("Welcome!");
                return true;
            }

            System.out.println("Incorrect username and/or Password");
            return false;
        }
        return login();

    }

    public static int checkAccount() {
        if (AccountList.isEmpty()) {
            System.out.println("There is no Accounts");
        } else {
            for (int i = 0; i < AccountList.size(); i++) {
                if (userName.equals(AccountList.get(i).getPlayerName())) {
                    return i;
                }
            }

        }
        return -1;
    }

    public static void createAccount() {

        System.out.println("Enter a username");
        userName = input.next();
        System.out.println("Enter a password: (must be at least 8 characters long and include a number(s)) ");
        password = input.next();

        boolean validPassword = false;
        if (password.length() >= 8 && isValid(password)) {
            validPassword = true;
        }
        System.out.println(validPassword ? "Valid password" : "Invalid password");

        System.out.println("How much would you like to desposit into Account?\n min amount: £20");
        double deposit = input.nextDouble();
        while (deposit < 20) {
            System.out.println("Sorry the minimum amount is £20\n Enter new amount: ");
            deposit = input.nextDouble();
        }
        Account newAccount = new Account(userName, password, deposit);
        AccountList.add(newAccount);
        FileHandling.writeFile(AccountList);

    }

    public static boolean isValid(String password) {
        String number = ".*[0-9].*";
        String alphabet = ".*[A-Z].*";
        return password.matches(number) && password.matches(alphabet);

    }
}
