
public class Card { 
	
	private final String[] SUIT = {"HEARTS","DIAMONDS","SPADES","CLUBS"};
	private final String[] FACE_VALUE = {"ACE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
	
	private String suit;
	private String value;
	private int random_suit;
	private int random_value;
	
	public Card() {
		suit = SUIT[(int)(Math.random()*SUIT.length)];
		value = FACE_VALUE[(int)(Math.random()*FACE_VALUE.length)];
	}
	
	public Card(int U_value, int U_suit) {
		suit = SUIT[U_suit];
		value = FACE_VALUE[U_value];
	}
	
 
	public void DrawCard() {
		
		/*Draws a card from random index values corresponding to above lists*/
		random_suit = (int)(Math.random()*SUIT.length);
		random_value = (int)(Math.random()*FACE_VALUE.length);
		
		
		suit = SUIT[random_suit];
		value = FACE_VALUE[random_value];
	}
	
	public int GetCardValue() {		
	int total=0;
    	if ((value.substring(0,3)).equals("ACE")){
    		total = 1;
    		}
    	if ((value.substring(0,3)).equals("TWO")){
    		total = 2;
    		}
    	if ((value.substring(0,3)).equals("THR")){
    		total = 3;
    		}
    	if ((value.substring(0,3)).equals("FOU")){
    		total = 4;
    		}
    	if ((value.substring(0,3)).equals("FIV")){
    		total = 5;
    		}
    	if ((value.substring(0,3)).equals("SIX")){
    		total = 6;
    		}
    	if ((value.substring(0,3)).equals("SEV")){
    		total = 7;
    		}
    	if ((value.substring(0,3)).equals("EIG")){
    		total = 8;
    		}
    	if ((value.substring(0,3)).equals("NIN")){
    		total = 9;
    		}
    	if ((value.substring(0,3)).equals("TEN")){
    		total = 10;
    		}
    	if ((value.substring(0,3)).equals("JAC")){
    		total = 10;
    		}
    	if ((value.substring(0,3)).equals("QUE")){
    		total = 10;
    		}
    	if ((value.substring(0,3)).equals("KIN")){
    		total = 10;
    		}
    	return total;
	}
	
	public int GetCardValue1() {		
		int total=0;
	    	if ((value.substring(0,3)).equals("ACE")){
	    		total = 1;
	    		}
	    	if ((value.substring(0,3)).equals("TWO")){
	    		total = 2;
	    		}
	    	if ((value.substring(0,3)).equals("THR")){
	    		total = 3;
	    		}
	    	if ((value.substring(0,3)).equals("FOU")){
	    		total = 4;
	    		}
	    	if ((value.substring(0,3)).equals("FIV")){
	    		total = 5;
	    		}
	    	if ((value.substring(0,3)).equals("SIX")){
	    		total = 6;
	    		}
	    	if ((value.substring(0,3)).equals("SEV")){
	    		total = 7;
	    		}
	    	if ((value.substring(0,3)).equals("EIG")){
	    		total = 8;
	    		}
	    	if ((value.substring(0,3)).equals("NIN")){
	    		total = 9;
	    		}
	    	if ((value.substring(0,3)).equals("TEN")){
	    		total = 10;
	    		}
	    	if ((value.substring(0,3)).equals("JAC")){
	    		total = 11;
	    		}
	    	if ((value.substring(0,3)).equals("QUE")){
	    		total = 12;
	    		}
	    	if ((value.substring(0,3)).equals("KIN")){
	    		total = 13;
	    		}
	    	return total;
		}


	
	public void Cheat_SetOwnCard(String OWNvalue, String OWNsuit) {
		suit = OWNsuit;
		value = OWNvalue;
	}
	
	public int GetCardSuit_AS_INT() {return random_suit;}
	public int GetCardValue_AS_INT() {return random_value;}
	public String GetCardSuit_AS_STR() {return suit;}
	public String GetCardValue_AS_STR() {return value;}
	
	public String toString(){
		return (value+" of "+suit);
	}
	}



