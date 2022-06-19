package assignment4_000820719;

/**
 *
 *
 *Implementation of all the methods to display a functional card playing with rank and suit.
 *
 * @author Simran Macwan, 000820719
 *
 *
 */

import java.util.Scanner;

public class Main {

    /** Card instance **/
    static Card cd;
    /** DeckOfCards instance **/
    static DeckOfCards doc;
    /** number of suit **/
    static int suit;
    /** number of rank in a suit **/
    static int rank;

    /**
     * A method used to test the object
     * @param args
     */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in); //Creating Scanner object to store input values from user

        System.out.println("How many suits? ");


        suit = input.nextInt();//Taking suit input from user

        System.out.println("How many ranks? ");

        rank = input.nextInt(); //Taking rank input from user


        cd = new Card(suit, rank); //Initializing object of Card with suit and card as parameters


        doc = new DeckOfCards(cd.getSuit(), cd.getRank(), cd); //Initializing object of DeckOfCards by passing rank, suit and Cards object as parameters


        doc.createDeck(cd); //Initializing array of Card


        int choice = -1; //Store user input for choice


        while (true) { //break when user chooses option 4: quit


            if (choice == 4) { //condition to break loop

                break;
            }

            /** Displaying user menu and getting choice from user **/
            choice = displayMenu(1, suit * rank);

            switch (choice) { //validating user input


                case 1: //shuffle array
                    doc.shuffle();
                    break;


                case 2: // Handing a one hand deal to the user

                    System.out.println("How many cards?");


                    int no_of_cards = input.nextInt(); //Taking number of cards input from user

                    Card[]  oneHandDeal = doc.oneHandDeal(no_of_cards);
                    doc.displayCards(oneHandDeal);
                    break;


                case 3: //Handing a deal of 100_000 times
                    System.out.println("How many cards?");

                    int noc = input.nextInt(); //Taking number of cards input from user

                    doc.drawHistogram(doc.histogram(noc));
                    break;

                case 4: // Quit the CardDeck
                    break;


                default:

                    System.out.println("Invalid Choice!"); // Default choice if user chooses invalid option

            }
        }
    }

    /**
     *
     *  Displays values to the user
     *
     * @param min The minimum value in the deck
     * @param max The maximum value in the deck
     *
     * @return input = input entered by the user
     */

    static int displayMenu(int min, int max) {

        System.out.println("Deck of " + doc.deckSize() + " cards: Low = " + min + "\t High = " + max + "\t Top = "
                + doc.getCard(DeckOfCards.card[0]));

        System.out.println("1)\t Shuffle\n" + "2) \t Deal 1 hand\n" + "3) \t Deal 100,000 times\n" + "4)\t Quit:  ");

        Scanner input = new Scanner(System.in);

        return input.nextInt();
    }

}
