# Cards-Deck

Two classes are defined in this programme: one to represent a single playing card with a rank and suit, and another to represent a deck of cards.
The cards are then repeatedly shuffled and dealt, followed by a histogram of the results.

The Deck of Cards

The rank and suit of a Card object are both positive, non-zero integers. 
There are some cards that are trump cards and others that aren't. 
The rank and suit are specified when a Card is created and cannot be changed. 
A Card's rank, suit, and value can all be reported. 
A card's value is determined by its rank multiplied by its suit. 
It has a toString() method that reports its rank and suit.
A DeckOfCards object holds a set of Card objects in an array. 
The size of the deck is determined by two integers passed to the constructor when it is created. 
The first integer specifies the maximum rank, and the second specifies the number of suits. 
The deck then contains one card of each rank/suit combination. 
This constructor creates the Card objects and stores them in the array. 
A DeckOfCards can shuffle itself, can report its size, the minimum and maximum card value in the deck, and can “deal” the top n cards by placing them in an array and returning them. 
It has a toString() method that reports the size of the deck, the minimum and maximum values, and the top card.
It also has a histogram method.

The Histogram Method

The histogram method of DeckOfCards accepts a parameter that specifies the number of cards in a hand. 
Then it shuffles and deals the cards 100,000 times by calling its own shuffle and deal methods. 
For each deal, it adds up the total value of all the cards in the hand and uses an array of counters to record the number of times each total comes up. 
Then it returns the histogram array.

![image](https://user-images.githubusercontent.com/107233739/174500696-a70f74c0-c8ed-41cf-9010-c27920a19bf8.png)

The Main Method

The main method starts by asking the user to enter the number of suits and maximum rank. 
Then it creates the deck of cards and prints it to the screen. 
Then it presents a menu in a loop that allows the user to shuffle once, deal one hand, or shuffle and deal 100,000 hands. 
The user chooses the size of the hands dealt.
If the user choose to deal a single hand, it shows the result by printing the cards the user got. 
If user chooses 100,000 hands, it calls the histogram method, and prints the non-zero elements of the array.
