package assignment4_000820719;

/**
 *
 * Implements and stores array of DeckOfCards.
 * @author Simran Macwan,000820719
 *
 */

import java.util.Random;

/**
 * Stores array of DeckOfCards.
 */
public class DeckOfCards {

    /** Card instance **/
    static Card[] card;

    /**
     * Initializes values for DeckOfCards
     * @param rank number of rank in a suit
     * @param suit number of suit
     * @param cd number of cards
     */
    public DeckOfCards(int rank, int suit, Card cd) {

        DeckOfCards.card = new Card[rank * suit];
    }

    /**
     * Fills the Deck with cards
     * @param cd number of cards
     */

    public void createDeck(Card cd) {

        int index = 0; // Initializing index to 0.

        // loop to fill the deck with cards.
        for (int i = 1; i <= cd.getSuit(); i++) {

            for (int j = 1; j <= cd.getRank(); j++) {

                DeckOfCards.card[index] = new Card(i, j, i * j);
                index++;

            }
        }
    }

    /**
     * Displays cards in deck
     */
    public void show() {
        for (Card cd : DeckOfCards.card) {

            System.out.println(getCard(cd)); //displaying cards in deck
        }
    }

    /**
     * Setting the format for suit and rank
     * @param cd number of cards
     * @return
     */

    public String getCard(Card cd) {

        return "Card\t" + "S" + cd.getSuit() + "R" + cd.getRank();
    }

    /**
     * Display Cards to the user
     * @param dealt The value obtained after the deal
     */

    public void displayCards(Card[] dealt) {
        for(Card cd: dealt) {

            System.out.print(getCard(cd) + "\t"); // displaying cards to user
        }
        System.out.println();
    }

    /**
     * Shuffles the cards
     */

    public void shuffle() {

        Random r = new Random(); //to generate a random value

        //Loop for shuffling the cards
        for (int i = DeckOfCards.card.length - 1; i > 0; i--) {

            int j = r.nextInt(i + 1);

            // Performing swapping of cards with temp variable
            Card temp = DeckOfCards.card[i];
            DeckOfCards.card[i] = DeckOfCards.card[j];
            DeckOfCards.card[j] = temp;

        }
    }

    /**
     * Returns size of Deck
     * @return card length - the length of the deck
     */

    public int deckSize() {

        return card.length;
    }

    /**
     * Returns minimum value in the deck
     * @return 1
     */

    public int deckMinValue() {
        return 1;
    }

    /**
     * Returns maximum value in the deck
     * @return rank - number of rank in a suit
     *          suit - number of suit
     */

    public int deckMaxValue() {
        return Main.rank * Main.suit;
    }

    /**
     * Performs one hand deal
     * @param n - number of cards
     * @return cardList - list of cards
     */

    public Card[] oneHandDeal(int n) {

        Card[] cardList = new Card[n]; // Creating instance of cardList

        // loop for performing one hand deal

        for (int i = 0; i < cardList.length; i++) {
            cardList[i] = card[i];
        }
        return cardList; //returning list of cards
    }

    /**
     * Returns sum of all values of dealt cards
     * @param n number of cards
     * @return sum - sum of values of dealt cards
     */

    public int sumDeal(int n) {

        Card[] cardList = oneHandDeal(n);

        int sum = 0;

        // loop for summing up values of dealt cards

        for(int i = 0 ; i < cardList.length ; i++) {

            sum += cardList[i].getValue();
        }
        return sum; // returning sum
    }

    /**
     * Display all attributes of Deck
     * @return card length - the length of the deck
     *          deckMinValue - minimum value in the deck
     *          deckMaxValue - maximum value in the deck
     *          getCard - top card in the deck
     */

    @Override
    public String toString() {

        return "Size of Deck is: " + card.length + "\tMinimum value is: " + deckMinValue() + "\tMaximum value is: "
                + deckMaxValue() + "\tTop card is: " + getCard(card[0]);
    }

    /**
     * Returns how many times a single number occurs in 100_000 deals.
     * @param n number of cards
     * @return counter - array of how many times single number occurs in 100_000 deals.
     */

    public int[] histogram(int n) {

        int totalSum = sumDeal(card.length - 1);

        System.out.println("TPS:\t" + totalSum); // displaying total possible sum

        int[] counter = new int[totalSum + 2]; // Creating counter array

        for(int i = 0 ; i < 100_000 ; i++) {
            shuffle();
            int res = sumDeal(n);
            counter[res] += 1;
        }
        return counter; // returning counter array
    }

    /**
     * Display counter array to user
     * @param counter array of how many times single number occurs in 100_000 deals.
     */

    public void drawHistogram(int[] counter) {

        int i = 0; // initializing the iterative value of i.

        for(int x : counter) { // loop for displaying counter array

            if(x != 0) {
                System.out.println(i + ":\t" + x);
            }
            i++;
        }
    }




}
