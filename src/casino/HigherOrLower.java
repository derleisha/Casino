package casino;

import java.util.Scanner;

import java.util.Random;
import java.util.ArrayList;

public class HigherOrLower {
     private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
    }
    public static void runHigherOrLower(){
        
    }
 

    public Double getUserBalance() {

        return userBalance;

    }

 

    public void setUserBalance(Double userBalance) {

        this.userBalance = userBalance;

    }

    protected Double userBalance;

    public static ArrayList<String> cards = new ArrayList<>();

    private static Random random = new Random();

    private static ArrayList<Account> players = new ArrayList<>();

 

    public void CheckAccount() {

        System.out.println("Please enter your userID");

        String UserId = input.next();

 

        for (int i = 0; i < players.size(); i++) {

            if (UserId.equals(players.get(i).getUserId())) {

               

                System.out.println("userID check complete");

 

            } else {

                System.out.println("wrong userId entered.");

 

            }

 

        }

    }

   

  public  void CheckBalance() {

 

        for (int i = 0; i < players.size(); i++) {

            System.out.println("Your total balance is " + players.get(i).getBalance());

            if (players.get(i).getBalance() < 10) {

                System.out.println("Insufficient balance to be playing. Get some money hehe");

            } else {

                System.out.println("Alrightyyyy, let's play now!!!");

 

               Double userBalance = players.get(i).getBalance();

 

            }

        }

    }

   

public void getCards(){

      

        cards.add("2");

        cards.add("3");

        cards.add("4");

        cards.add("5");

        cards.add("6");

        cards.add("7");

        cards.add("8");

        cards.add("9");

        cards.add("10");

        cards.add("Jack");

        cards.add("Queen");

        cards.add("King");

        cards.add("Ace");

        System.out.println(cards);

        System.out.println("These are the cards and they are sorted from lowest to highest" );

 

    }

  

    void HigherOrLowerGame (){

   

        for (int i = 0; i < 5; i++) {

            int index1 = random.nextInt(cards.size());

            System.out.println("The random card is " + cards.get(index1));

            int index2 = random.nextInt(cards.size());

 

            System.out.println( "Do you think the next card is higher or lower?" );

 

            try {

                String userResponse = input.next();

 

                userResponse = userResponse.toLowerCase();

 

                switch (userResponse) {

                    case "higher":

                        if (index1 < index2) {

                            System.out.println("YAY :) you are right, the value is " + cards.get(index2));

                            userBalance = userBalance + 3;

                            System.out.println("Your score is " + userBalance);

                        } else {

                            System.out.println("NO :( you are wrong,the value is " + cards.get(index2));

                            userBalance = userBalance - 1;

                            System.out.println("Your score is " + userBalance);

                        }

                        break;

                    case "lower":

                        if (index1 > index2) {

                            System.out.println("YAY :) you are right, the value is " + cards.get(index2));

                            userBalance = userBalance + 3;

                            System.out.println("Your score is " + userBalance);

                        } else {

                            System.out.println("NO :( you are wrong ,the value is " + cards.get(index2));

                            userBalance = userBalance - 1;

                            System.out.println("Your score is " + userBalance);

                        }

                        break;

 

                }

            } catch (Exception E) {

                System.out.println("Invalid letters inputted, input letters again please.");

                String userResponse = input.next();

 

            }

 

        }

    }

}

 