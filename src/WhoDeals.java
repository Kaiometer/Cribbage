
public class WhoDeals {
	
	private Deck deck = new Deck();
    private Card[] totaldeck = new Card[52];
    private int index = 0;
    boolean isDealerPlayer = false;
    
    /*********************************************/
	
    public void shuffleDeck()
    {
        deck.shuffle();
    }
    
    /*********************************************/
    
    public void SetDealer (int sc) {
    	
        for(int ind = 0; ind<52 ; ind++) {
        	buildWholeDeck(dealCard());
        }
        	
    	if (totaldeck[sc].GetCardValue() < totaldeck[sc+1].GetCardValue()) {
    		isDealerPlayer = true;
    		System.out.println("Your card is the "+totaldeck[sc]);
    		System.out.println("Your opponent's card is the "+totaldeck[sc+1]);
    		System.out.println("You're the dealer");
    		System.out.println("");
    	}
        	else {
        		System.out.println("Your card is the "+totaldeck[sc]);
        		System.out.println("Your opponent's card is the "+totaldeck[sc+1]);
        		System.out.println("Your opponent is the dealer");
        		System.out.println("");
        	}
        }
        
    ///////////////////////////////////////////////

    public  void buildWholeDeck(Card temp){
    	totaldeck[index] = temp;
    index++;
    }
    
    ///////////////////////////////////////////////
    
    public Card dealCard(){
		Card c1 = deck.nextCard();
		return c1;
    }
    
    public void dealerPlayer() {
    		isDealerPlayer = true;
    }
    
    public void dealerComputer() {
		isDealerPlayer = false;
}
    	
    
    /*********************************************/
    
    public boolean isDealerPlayer() {
    	return isDealerPlayer;
    }
}
