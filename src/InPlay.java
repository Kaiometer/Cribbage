
public class InPlay {
	
	int[] inPlay = new int[8];
	int nextIndex = 0;
	
	Card[] inPlay1 = new Card [8];
	
	public void resetInPlay() {
		inPlay[1] = 0;
		inPlay[2] = 0;
		inPlay[3] = 0;
		inPlay[4] = 0;
		inPlay[5] = 0;
		inPlay[6] = 0;
		inPlay[7] = 0;
		
		inPlay1[0] = null;
		inPlay1[1] = null;
		inPlay1[2] = null;
		inPlay1[3] = null;
		inPlay1[4] = null;
		inPlay1[5] = null;
		inPlay1[6] = null;
		inPlay1[7] = null;
		
		nextIndex = 0;
		
	}
	
	
	public void addcard(Card x) {
		inPlay1[nextIndex] = x;
	}
	
	public void addCardToGame(int x) {
		inPlay[nextIndex] = x;
		nextIndex++;
	}
	
	  public int sumInPlay_noinpt() {
		   int sum = 0;
		   for (int x = 0; x < inPlay.length; x++) {
			   sum += inPlay[x];
		   }
		   return sum;
	   }
	  
	  public void clearhand() {
		  for (int x = 0; x < inPlay.length; x++) {
			  inPlay[x] = 0;
			  inPlay1[x] = null;
		  }
		  nextIndex = 0;
	  }
	
	  public int sumInPlay(int[]inPlay) {
		   int sum = 0;
		   for (int x = 0; x < inPlay.length; x++) {
			   sum += inPlay[x];
		   }
		   return sum;
	   }
	  
	  public int fifteen_thirtyone(){
		  int scoreadd = 0;
		  if (sumInPlay(inPlay) == 15){
			  scoreadd += 2;
			  System.out.println("");
			  System.out.println("15 was acheived! 2 points awarded!");
			  System.out.println("");
		  }
	  if (sumInPlay(inPlay) == 31){
		  	scoreadd += 2;
		  	System.out.println("");
		  	System.out.println("31 was acheived! 2 points awarded!");
		  	System.out.println("");
		  }
		  return scoreadd;
	  }
	  
	  public int doublecheck() {
		  int scoreadd = 0;
		  for (int x = 0; x < nextIndex-1; x++) {
			  if (inPlay1[x].GetCardValue1() == inPlay1[nextIndex-1].GetCardValue1()) {
				  scoreadd +=2;
				  System.out.println("");
				  System.out.println("A pair was played! 2 points awarded!");
				  System.out.println("");
			  }
		  }
		  return scoreadd;
	  }

	   public boolean canPlay(Card temp) {
			   if ((temp.GetCardValue() + sumInPlay(inPlay)) <= 31) {
				   return true;
			   }
			   return false;
		 
	   }
	   
	   public void printInPlay() {
		   System.out.println("");
		   	System.out.println("The cards in play are currently:");
	    	for (int i=0;i<nextIndex;i++) {
	    		System.out.println(inPlay1[i] + " (which has a value of " + inPlay[i] + ")");	
	    	}
	    	System.out.println("");
	   }
	   
}
