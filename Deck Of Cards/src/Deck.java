import java.util.LinkedList;

/*
 * This will be the representation of the deck.
 * @author Antonio Contreras
 */
public class Deck {
	
	/** This will be the representation of the linkedList. Looking back i realized that an 
	 * array would have been better because it makes shuffling much easier,but i discovered
	 * this a bit late. */
	public Deck() {
		_deck = new LinkedList<Card>();
	}
	
	
	/** Fills the deck with all of the cards.*/
	public void fillDeck() {
		while(fillDeckNum < 52) {
			int spades = 0;
			while (spades < 13) {
				_deck.add(new Card(spades + 1, "Spade"));
				spades += 1;
				fillDeckNum += 1;
			}
			int hearts = 0;
			while (hearts < 13) {
				_deck.add(new Card(hearts + 1, "Heart"));
				hearts += 1;
				fillDeckNum += 1;
			}
			int daimonds = 0;
			while (daimonds < 13) {
				_deck.add(new Card(daimonds + 1, "Daimond"));
				daimonds += 1;
				fillDeckNum += 1;
			}
			int clubs = 0;
			while (clubs < 13) {
				_deck.add(new Card(clubs + 1, "Club"));
				clubs += 1;
				fillDeckNum += 1;
			}
		}
		fillDeckNum = 0;
	}
	
	/** Prints all of  the cards in the deck.*/
	public void printDeck(){
		int cardCounter = 0;
		while(cardCounter < 52) {
			System.out.println(_deck.get(cardCounter).toString());
			cardCounter += 1;
		}
	}
	
	/**Gives the next card in the deck. */
	public void getNextCard() throws Exception {
		if (nextCardIndex == 53) {
			throw new Exception("You have dealt all of your cards. Shuffle them again");
		} else {
			System.out.println(_deck.get(nextCardIndex));
//			_deck.remove(nextCardIndex);
			nextCardIndex += 1;
		}
	}
	
	/**This will reshiffle the deck and put every card inside again. */
	public void Shuffle() {
		_deck.clear();
		while(fillDeckNum < 52) {
			int spades = 0;
			while (spades < 13) {
				_deck.add(new Card(spades + 1, "Spade"));
				spades += 1;
				fillDeckNum += 1;
			}
			int hearts = 0;
			while (hearts < 13) {
				_deck.add(new Card(hearts + 1, "Heart"));
				hearts += 1;
				fillDeckNum += 1;
			}
			int daimonds = 0;
			while (daimonds < 13) {
				_deck.add(new Card(daimonds + 1, "Daimond"));
				daimonds += 1;
				fillDeckNum += 1;
			}
			int clubs = 0;
			while (clubs < 13) {
				_deck.add(new Card(clubs + 1, "Club"));
				clubs += 1;
				fillDeckNum += 1;
			}
		}
		fillDeckNum = 0;
		
	}
	
	/** Used for testing*/
//	public static void main(String[] args) throws Exception {
////		Card A = new Card(1, "Hi");
////		System.out.println(A.rank);
////		Card B = new Card(5, "Hello");
//		Deck testD = new Deck();
//		testD.fillDeck();
////		testD.printDeck();
//		System.out.println("Testing next card");
//		testD.getNextCard();
//		testD.getNextCard();
//		testD.getNextCard();
//		testD.getNextCard();
//		testD.Shuffle();
//		testD.getNextCard();
//		
//	}
	
	/** Overall representation of the deck. */
	public LinkedList<Card> _deck;
	
	/** Counter needed for fillDeck Method. */
	public int fillDeckNum = 0;
	
	/** Counter needed for next card method. */
	public int nextCardIndex = 0;
}
