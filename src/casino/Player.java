
package casino;
import java.util.Scanner;
public class Player {
   
     public String playerName;
    private Cards[] hand = new Cards[10];
    private int cardNum;
   

    public Player(String playerName) {
        
        this.playerName = playerName;
        this.emptyHand(); // sets players hand to empty
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first Name");
        this.playerName = input.nextLine();
        
        

   
    }

    public void emptyHand() {
        for (int e = 0; e < 10; e++) {
            this.hand[e] = null;

        }
        this.cardNum = 0;

    }

    public boolean addCard(Cards aCard) {
        if (this.cardNum == 10) {
            System.err.printf(" %s's hand already has 10 cards; " + "cannot add another\n", this.playerName);
            System.exit(1);
        }
        return (this.getHandSum() <= 21);
    }

    public int getHandSum() {
        int handSum = 0;
        int cardNumber;
        int numAces = 0;

        for (int i = 0; i < this.cardNum; i++) {
            cardNumber = this.hand[i].cardNumber();
            if (cardNumber == 1) {
                numAces++;
                handSum += 11;
            } else if (cardNumber > 10) {
                handSum += 10;

            } else {
                handSum += cardNumber;
            }

        }
        while (handSum > 21 && numAces > 0) {
            handSum -= 10;
            numAces--;

        }
        return handSum;

    }

    public void printHand(boolean showFirstCard) {

        System.out.printf("%s's  cards:\n", this.playerName);
        for (int i = 0; i < this.cardNum; i++) {
            if (i == 0 && !showFirstCard) {
                System.out.println("  [hidden]");

            } else {
                System.out.printf("  %s\n", this.hand[i].toString());
            }

        }

    }

    public String getName() {
        return playerName;
    }

    public void setName(String name) {
        this.playerName = name;
    }

    
    
    
    
    
    
    

    }
    
    
    
    
