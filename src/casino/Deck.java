
package casino;


import java.util.Random;

public class Deck {
    
    private Cards[] cards;
    private int cardNum;
 

    

    public Deck(int deckNum, boolean shuffle){// wether there is more than 1 deck of 52 card (52 * n)
        this.cardNum = deckNum * 52;
        this.cards = new Cards[this.cardNum];
        
        int x = 0;
        // adds new card to deck
        for (int deck = 0; deck < deckNum; deck++){
            for (int suits = 0; suits < 4; suits++){
                for (int number = 1; number <= 13; number++){
                    this.cards[x] = new Cards(Suits.values()[suits],number);
                    x++;
                }
                
            }
        }
    }
    public void shuffle(){
        Random random = new Random();
        Cards temp; // temp space for when the cards are being shuffled
        int j;
        for (int i =0; i< this.cardNum; i++){
            j = random.nextInt(this.cardNum);
            
            // swapping process
            temp = this.cards[i];
            this.cards[i] = this.cards[j];
            this.cards[j] = temp;
        }
    }
    public Cards dealNextCard(){
        
        // deals the cards at the top of the deck
        Cards topCard = this.cards[0];
        
        // shifts all the value in the array to the left after card as been dealt
        for( int i = 1; i < this.cardNum; i++){
            this.cards[i-1] = this.cards[i];
        }
        this.cards[this.cardNum-1] = null;
        this.cardNum --; // decrements the number of cards in the deck
        
        return topCard;
    }
    public void printDeck(int cardToPrint){
        for (int i = 0; i <cardToPrint; i++){
            System.out.printf("% 3d/%d %s\n", i+1, this.cardNum,this.cards[i].toString());
            
        }
    }
}

    
        
        
           
                    
         

