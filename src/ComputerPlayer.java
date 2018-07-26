public class ComputerPlayer
{
	private Deck deck = new Deck();
    private Card[] hand = new Card[12];
    private Card[] crib = new Card[2];
    private int nextIndex = 0;
    
    /*********************************************/
    private Card[] hand_copy = new Card [4];
    public Card[] copy_hand() {
    	
			hand_copy[0]=hand[0];
			hand_copy[1]=hand[1];
			hand_copy[2]=hand[2];
			hand_copy[3]=hand[3];
			
    	return hand_copy;
    }
    
    /*********************************************/
    
    /*********************************************/
    
    public void reset() {
    	crib[0] = null;
    	crib[1]=null;
    	
    	deck.reset();
    	
    	hand[2]=null;
    	hand[3]=null;
    	hand[4]=null;
    	hand[5]=null;
    	hand[6]=null;
    	hand[7]=null;
    	hand[8]=null;
    	hand[9]=null;
    	hand[10]=null;
    	hand[11]=null;
    	
    	nextIndex = 0;
    	
    }
   
    
  /*********************************************/

    public void shuffleDeck()
    {
        deck.shuffle();
    }
    
 /*********************************************/
    
    public  void addCardToHand(Card temp){
    	hand[nextIndex] = temp;
    	nextIndex++;
    }

/*********************************************/
    
    public int amountCards() {
    	
    	return nextIndex;
    }
    
    public Card dealCard()
    {
		Card c1 = deck.nextCard();
		return c1;
    }
    
    /*********************************************/
    
    public void getHand() {
    	System.out.println("");
    	System.out.println("The computer's hand is currently:");
    	for (int i=0;i<nextIndex-1;i++) {
    		System.out.println(hand[i]);	
    	}
    }
    
    /*********************************************/
    public void decideCribCards() {
    	crib[0] = hand[nextIndex-2];
    	nextIndex--;
    	crib[1] = hand[nextIndex-2];
    	nextIndex--;
    }
    
    /*********************************************/
    
    public Card[] returnCribCards() {
    	return crib;
    }

    
    /*********************************************/
    
    /*********************************************/
   public Card getCard(int x) {
	   return hand[x];
   }
   
   public int play4Card(int x) {
	   
	 //getHand();System.out.println("play4, x ="+x);
	 
   	System.out.println("The computer just played " + hand[x]);
   	Card temp = hand[x];
   	hand [x] = hand [3];
   	nextIndex--;
   	return temp.GetCardValue();
   
   }
   
public int play3Card(int x) {
	
	//getHand();System.out.println("play3, x ="+x);
	
	System.out.println("The computer just played " + hand[x]);
   	Card temp = hand[x];
   	hand [x] = hand [2];
   	nextIndex--;
   	return temp.GetCardValue();
}

public int play2Card(int x) {
	
	//getHand();System.out.println("play2, x ="+x);
	
	System.out.println("The computer just played " + hand[x]);
   	Card temp = hand[x];
   	hand [x] = hand [1];
   	nextIndex--;
   	return temp.GetCardValue(); }

public int play1Card(int x) {
	
	//getHand();System.out.println("play1, x ="+x);
	
	
	System.out.println("The computer just played " + hand[x]);
   	nextIndex--;
   	return hand[x].GetCardValue();
   }
   /*********************************************/
    
public boolean hasCards() {
	if (nextIndex == 1) {
		return false;
	}
	return true;
}

    
    /*********************************************/
    
	public String toString(){
		String result ="";
		for(int i=0; i<hand.length; i++){
		result = result + hand[i].toString() + "\n";
	} 
		return result;
	}
}