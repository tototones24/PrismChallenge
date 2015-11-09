
public class Main {
	
	public static void main(String[] args) throws Exception {
//		Card A = new Card(1, "Hi");
//		System.out.println(A.rank);
//		Card B = new Card(5, "Hello");
		Deck testD = new Deck();
		testD.fillDeck();
//		testD.printDeck();
		System.out.println("Testing next card");
		testD.getNextCard();
		testD.getNextCard();
		testD.getNextCard();
		testD.getNextCard();
		testD.Shuffle();
		testD.getNextCard();
		
	}
}
