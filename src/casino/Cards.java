package casino;

public class Cards {

    private Suits suit;
    private int cardNumber;

    public Cards(Suits suit, int cardNumber) {

        this.suit = suit;
        try {
                this.cardNumber = cardNumber;
            }
            catch(Exception error ){
                    System.out.println(cardNumber + "is not valid");
                    }
        
    
        
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String toString() {

        String stringCard = " ";

        switch (cardNumber) {
            case 1:
                stringCard = "Ace";
                break;
            case 2:
                stringCard = "Two";
                break;
            case 3:
                stringCard = "Three";
                break;
            case 4:
                stringCard = "Four";
                break;
            case 5:
                stringCard = "Five";
                break;
            case 6:
                stringCard = "Six";
                break;
            case 7:
                stringCard = "Seven";
                break;
            case 8:
                stringCard = "Eight";
                break;
            case 9:
                stringCard = "Nine";
                break;
            case 10:
                stringCard = "Ten";
                break;
            case 11:
                stringCard = "Jack";
                break;
            case 12:
                stringCard = "Queen";
                break;
            case 13:
                stringCard = "King";
        }
        // changes the enum from int to String
        return stringCard + " of " + suit.toString();
                       

        }

    int cardNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }
