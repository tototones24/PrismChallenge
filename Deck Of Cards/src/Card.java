/**
 * 
 * @author Antonio Contreras
 *This class will be the representation of a single card in the deck.
 */
public class Card extends Deck{
	/**Used in order to be able to access the information of a card in another 
	 * class. */
	int rank;
	String suit;
	
	/**
	 * This is the representation of a card, 
	 * @param rank contains the number of the card
	 * @param suit contains one of the 4 suit that it represents.
	 */
	public Card(int rank, String suit) {
		this.rank= rank;
		this.suit = suit;
	}
	
	
	/** I create this to make it easier on me when I want to know 
	 * the information of the card in other classes.*/
	@Override
	public String toString() {
		return "(" + rank + "," + suit + ")";
	}
	
}
