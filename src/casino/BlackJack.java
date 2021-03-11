
package casino;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args){
       
    }
    public static void runBlackJack(){
        
        Scanner input = new Scanner(System.in);
        Deck deck = new Deck (1, true); 
      
        
        Player humanPlayer = new Player("Derleisha");
        Player dealer = new Player("Dealer");
        
        humanPlayer.addCard(deck.dealNextCard());
        dealer.addCard(deck.dealNextCard());
        humanPlayer.addCard(deck.dealNextCard());
        dealer.addCard(deck.dealNextCard());
       
// prints the inital hands
        System.out.println("The cards are dealt\n"); 
        humanPlayer.printHand(true);
        dealer.printHand(false);
        System.out.println("\n");
        
       // when each  player are finished there hit 
       
       boolean playerDone = false;
       boolean dealerDone = false;
       String answer;
       
       while (!playerDone || !dealerDone){
           if (!playerDone){
               System.out.println("Do you want to Hit or Stay ( H or S) ");
               answer = input.next();
               System.out.println();
               
               if(answer.compareToIgnoreCase("H")==0){ // when the player chooses to hit
                   playerDone = !humanPlayer.addCard(deck.dealNextCard());
               }
               else{
                   playerDone = true;
               }
           }
           if (!dealerDone){
               if(dealer.getHandSum()<17){
                   System.out.println("The dealer hits\n");
                   dealerDone = !dealer.addCard(deck.dealNextCard());
                   dealer.printHand(false);
               }
               else{
                   System.out.println("The dealer stays\n");
                   dealerDone = true;
               }
               
               
           }
           System.out.println();
           
       }
       input.close();
       humanPlayer.printHand(true);
       dealer.printHand(true);
       
       int playerSum = humanPlayer.getHandSum();
       int dealerSum = dealer.getHandSum();
       if (playerSum > dealerSum && playerSum <= 21 || dealerSum > 21){
           System.out.println(humanPlayer + "wins");
       }
       else {
           System.out.println(dealer + "wins") ;
           
       }
        
       
        
        
        
        
    }
    
}
