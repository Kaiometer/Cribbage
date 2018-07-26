public class Deck{
	public static final int NUMFACES=13;
	public static final int NUMSUITS=4;
	public static final int NUMCARDS=52;
	private Card[] stack;
	private int topCardIndex = 51;
	
	public void reset() {
		topCardIndex = 51;
		stack[0] = null;
		stack[1] = null;
		stack[2] = null;
		stack[3] = null;
		stack[4] = null;
		stack[5] = null;
		stack[6] = null;
		stack[7] = null;
		stack[8] = null;
		stack[9] = null;
		stack[10] = null;
		stack[11] = null;
		stack[12] = null;
		stack[13] = null;
		stack[14] = null;
		stack[15] = null;
		stack[16] = null;
		stack[17] = null;
		stack[18] = null;
		stack[19] = null;
		stack[20] = null;
		stack[21] = null;
		stack[22] = null;
		stack[23] = null;
		stack[24] = null;
		stack[25] = null;
		stack[26] = null;
		stack[27] = null;
		stack[28] = null;
		stack[29] = null;
		stack[30] = null;
		stack[31] = null;
		stack[32] = null;
		stack[34] = null;
		stack[35] = null;
		stack[36] = null;
		stack[37] = null;
		stack[38] = null;
		stack[39] = null;
		stack[40] = null;
		stack[41] = null;
		stack[42] = null;
		stack[43] = null;
		stack[44] = null;
		stack[45] = null;
		stack[46] = null;
		stack[47] = null;
		stack[48] = null;
		stack[49] = null;
		stack[50] = null;
		stack[51] = null;
		
		stack=new Card[NUMCARDS];
		int Cards_in_suit=0;
		
		for(int suit_index=0;suit_index<=3;suit_index++){
			for(int v=0;v<NUMFACES;v++){
				Card c=new Card(v,suit_index);
				stack[v+Cards_in_suit]=c;
			}
			Cards_in_suit+=13;
		}	
		
	}

	public Deck (){
	stack=new Card[NUMCARDS];
	int Cards_in_suit=0;
	
	for(int suit_index=0;suit_index<=3;suit_index++){
		for(int v=0;v<NUMFACES;v++){
			Card c=new Card(v,suit_index);
			stack[v+Cards_in_suit]=c;
		}
		Cards_in_suit+=13;
	}	
	}
	
    public void shuffle()
	{
    	for ( int i = 0; i < 100; i++ ) {
            int rand = (int)(Math.random()*(52));
            int rand2=(int)(Math.random()*(52));
            Card temp = stack[rand];
            stack[rand] = stack[rand2];
            stack[rand2] = temp;
        }
	}

	public int numCardsLeft()
	{
		return topCardIndex+1;
	}	
    
	public Card nextCard()
	{
        Card next = stack[topCardIndex];
        topCardIndex--;
		return next;
	}

	public String toString(){
		String result ="";
		for(int i=0; i<stack.length; i++){
		result = result + stack[i].toString() + "\n";
	} 
		return result;
	}
}