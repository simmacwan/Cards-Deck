package assignment4_000820719;

/**
 *
 * This class stores and processes all the Card attributes.
 *
 * @author Simran Macwan
 *
 */

public class Card {

    /** number of rank in a suit **/
    private int rank;
    /** number of suit **/
    private int suit;
    /** number of values **/
    private int value;

    /**
     * Initializes the Card object values
     * @param suit - number of suit in a card deck
     * @param rank - number of rank in a suit
     *
     */
    public Card(int suit, int rank) {

        this.rank = rank;
        this.suit = suit;
    }

    /**
     * Initializes Card object values
     * @param rank number of rank in a suit
     * @param suit number of suit in a card deck
     * @param value number of values in a card deck
     *
     */

    public Card(int rank, int suit, int value) {
        super();
        this.rank = rank;
        this.suit = suit;
        this.value = value;
    }

    /**
     * Getting rank values from user
     *
     * @return rank- number of rank in a suit
     */

    public int getRank() {

        return rank;
    }

    /**
     *
     * Setting rank values
     * @param rank - number of rank in a suit
     *
     */

    public void setRank(int rank) {

        this.rank = rank;
    }

    /**
     * Getting suit values from user
     *
     * @return suit- number of suit in a card deck
     */

    public int getSuit() {

        return suit;
    }

    /**
     *
     * Setting suit values
     *
     * @param suit - number of suit in a card deck
     *
     *
     */

    public void setSuit(int suit) {

        this.suit = suit;
    }

    /**
     * Getting values from user
     *
     * @return value - number of values in a card deck
     *
     */

    public int getValue() {

        return value;
    }

    /**
     *
     * Setting values
     *
     * @param value - number of values in a card deck
     *
     *
     */

    public void setValue(int value) {

        this.value = value;
    }

    /**
     * Display attributes of Card
     * @return rank - number of rank in a suit
     *         suit - number of suit in a card deck
     *         value - number of values in a card deck
     */
    @Override
    public String toString() {

        return "Card [rank=" + rank + ", suit=" + suit + ", value=" + value + "]";

    }



}

