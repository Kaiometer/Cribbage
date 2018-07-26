public class Player {
    //constructor(s)
	 private int nextIndex = 0;
	 public int Index=0;
    
	   private Card[] hand = new Card[12];
	    private Card[] crib = new Card[2];
	    
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
	    
	    public void reset() {
	    	crib[0] = null;
	    	crib[1]=null;
	    	
	    	hand_copy[0]=null;
	    	hand_copy[1]=null;
	    	hand_copy[2]=null;
	    	hand_copy[3]=null;
	    	
	    	hand[0]=null;
	    	hand[1]=null;
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
	    	Index = 0;
	    	
	    }
	   
	    
	  /*********************************************/

	    
	    public  void addCardToHand(Card temp){
	    	hand[nextIndex] = temp;
	    	nextIndex++;
	    }

	/*********************************************/
	    
	    public void getHand() {
	    	System.out.println("");
	    	System.out.println("Your hand is currently:");
	    	for (int i=0;i<nextIndex-1;i++) {
	    		System.out.println(hand[i]);	
	    	}
	    }
	    
	    /*********************************************/
	    public void decideCribCards(int x, int y) {
	    	
	    	crib[0] = hand[x];
	    	nextIndex--;
	    	crib[1] = hand[y];
	    	nextIndex--;
	    	
	    	if (x>3 && y>3) {
	    		
	    	}
	    	if (x==5 && y<3) {
	    		hand[y] = hand[4];
	    	}
	    	
	    	if (x==4 && y<3) {
	    		hand[y] = hand[5];
	    	}
	    	if (y==5 && x<3) {
	    		hand[x] = hand[4];
	    	}
	    	
	    	if (y==4 && x<3) {
	    		hand[x] = hand[5];
	    	}
	    	if 	(y<4 && x<3) {
				Card temp = hand[x];
				Card temp1 = hand[y];
				hand[x]=hand[4];
				hand[y]=hand[5];
				hand[4] = temp;
				hand[5] = temp1;
	    	}
	    	
		
				

		
	    	
	    }
	    
	    /*********************************************/
	    
	    
	    public int play4Card(int x) {

	    	System.out.println("You just played " + hand[x]);
	    	Card temp;

	    	if (x == 2) {
	    		temp = hand[2];
	    		hand[2] = hand[3];
	    		nextIndex--;
	    		return temp.GetCardValue();
	    	}
	if (x == 1) {
		temp = hand[1];
		hand[1] = hand[3];
		nextIndex--;
		return temp.GetCardValue();
	    	}
	if (x == 0) {
	temp = hand[0];
	hand[0] = hand[3];
	nextIndex--;
	return temp.GetCardValue();
	}
	nextIndex--;
	return hand[x].GetCardValue();
	    
	    }
	    
	 public int play3Card(int x) {

	    	System.out.println("You just played " + hand[x]);
	    	Card temp;

	    	
	if (x == 1) {
		temp = hand[1];
		hand[1] = hand[2];
		nextIndex--;
		return temp.GetCardValue();
	    	}
	if (x == 0) {
	temp = hand[0];
	hand[0] = hand[2];
	nextIndex--;
	return temp.GetCardValue();
	}
	nextIndex--;
	return hand[x].GetCardValue();
	    }
	 
	 public int play2Card(int x) {

	    	System.out.println("You just played " + hand[x]);
	    	Card temp;

	if (x == 0) {
	temp = hand[0];
	hand[0] = hand[1];
	nextIndex--;
	return temp.GetCardValue();
	}
	nextIndex--;
	return hand[x].GetCardValue();
	    }
	 
	 public int play1Card(int x) {

	    	System.out.println("You just played " + hand[x]);

	    	nextIndex--;
	    	return hand[x].GetCardValue();
	    }
	    
	    
	    
	    /*********************************************/
	    
	    public Card[] returnCribCards() {
	    	return crib;
	    }
	    
	    
	    
	    /*********************************************/
	    
	    public Card getCard(int x) {
	 	   return hand[x];
	    }
    
    public String toString(){
    	 String result = "";
         for (int i=0; i<hand.length; i++) {
          if (hand[i] != null) {
          result = result + hand[i].toString()+ "\n";
          }
         }
         return result;
         }
    
    public boolean hasCards() {
    	if (nextIndex == 1) {
    		return false;
    	}
    	return true;
    }
    
    public int amountCards() {
    	
    	return nextIndex;
    }

       }
