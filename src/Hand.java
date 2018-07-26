
public class Hand {
	
	   private Card[] Phand = new Card[4];
	   private Card[] Chand = new Card[4];
	   
	   public void make_Phand(Card[] player) {
		   
			   Phand[0] = player[0];
			   Phand[1] = player[1];
			   Phand[2] = player[2];
			   Phand[3] = player[3];
	   }
	   
	   public void make_Chand(Card[] player) {
		   Chand[0] = player[0];
		   Chand[1] = player[1];
		   Chand[2] = player[2];
		   Chand[3] = player[3];
	   }
	   
	    public int P_is15() {
	  		int fifteenscore = 0;
			if ((Phand[0].GetCardValue() + Phand[1].GetCardValue())==15) {
					fifteenscore+=2;
				}
			if ((Phand[0].GetCardValue() + Phand[2].GetCardValue())==15) {
				fifteenscore+=2;
			}
			if ((Phand[0].GetCardValue() + Phand[3].GetCardValue())==15) {
				fifteenscore+=2;
			}
			if ((Phand[1].GetCardValue() + Phand[2].GetCardValue())==15) {
				fifteenscore+=2;
			}
			if ((Phand[1].GetCardValue() + Phand[3].GetCardValue())==15) {
				fifteenscore+=2;
			}
			if ((Phand[2].GetCardValue() + Phand[3].GetCardValue())==15) {
				fifteenscore+=2;
			}
			if ((Phand[0].GetCardValue() + Phand[1].GetCardValue()+Phand[2].GetCardValue())==15) {
				fifteenscore+=2;
			}
			if ((Phand[0].GetCardValue() + Phand[1].GetCardValue()+Phand[3].GetCardValue())==15) {
				fifteenscore+=2;
			}
			if ((Phand[0].GetCardValue() + Phand[2].GetCardValue()+Phand[3].GetCardValue())==15) {
				fifteenscore+=2;
			}
			if ((Phand[1].GetCardValue() + Phand[2].GetCardValue()+Phand[3].GetCardValue())==15) {
				fifteenscore+=2;
			}
			if ((Phand[0].GetCardValue() + Phand[2].GetCardValue()+Phand[3].GetCardValue()+Phand[1].GetCardValue())==15) {
				fifteenscore+=2;
			}
			  
			return fifteenscore;


	  		}
	  	
	  //computer number of pairs
	  public int P_ispairs() {
			  int scoreadd = 0;
			 
				if (Phand[0].GetCardValue1()==Phand[1].GetCardValue1()) {
					scoreadd+=2;
				}
				if (Phand[0].GetCardValue1()==Phand[2].GetCardValue1()) {
					scoreadd+=2;
				}
				if (Phand[0].GetCardValue1()==Phand[3].GetCardValue1()) {
					scoreadd+=2;
				}
				if (Phand[1].GetCardValue1()==Phand[2].GetCardValue1()) {
					scoreadd+=2;
				}
				if (Phand[1].GetCardValue1()==Phand[3].GetCardValue1()) {
					scoreadd+=2;
				}
				if (Phand[2].GetCardValue1()==Phand[3].GetCardValue1()) {
					scoreadd+=2;
				}	
				  
				return scoreadd;
		  }
	  	
	//compute number of runs
	  public int P_isrun() {
	  int runscore = 0;
		if (Phand[0].GetCardValue1()==(Phand[1].GetCardValue1()+1)) {
			if (Phand[1].GetCardValue1()==(Phand[2].GetCardValue1()+1)) {
				if (Phand[2].GetCardValue1()==(Phand[3].GetCardValue1()+1)) {
					runscore++;
				}
			}
			if (Phand[1].GetCardValue1()==(Phand[3].GetCardValue1()+1)) {
				if (Phand[3].GetCardValue1()==(Phand[2].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Phand[0].GetCardValue1()==(Phand[2].GetCardValue1()+1)) {
			if (Phand[2].GetCardValue1()==(Phand[1].GetCardValue1()+1)) {
				if (Phand[1].GetCardValue1()==(Phand[3].GetCardValue1()+1)) {
					runscore++;
				}
			}
			if (Phand[2].GetCardValue1()==(Phand[3].GetCardValue1()+1)) {
				if (Phand[3].GetCardValue1()==(Phand[1].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Phand[0].GetCardValue1()==(Phand[3].GetCardValue1()+1)) {
			if (Phand[3].GetCardValue1()==(Phand[1].GetCardValue1()+1)) {
				if (Phand[1].GetCardValue1()==(Phand[2].GetCardValue1()+1)) {
					runscore++;
				}
			}
			if (Phand[3].GetCardValue1()==(Phand[2].GetCardValue1()+1)) {
				if (Phand[2].GetCardValue1()==(Phand[1].GetCardValue1()+1)) {
					runscore++;
		}
			}
		}
		if (Phand[1].GetCardValue1()==(Phand[2].GetCardValue1()+1)) {
			if (Phand[2].GetCardValue1()==(Phand[3].GetCardValue1()+1)) {
				if (Phand[3].GetCardValue1()==(Phand[0].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Phand[1].GetCardValue1()==(Phand[2].GetCardValue1()+1)) {
			if (Phand[2].GetCardValue1()==(Phand[0].GetCardValue1()+1)) {
				if (Phand[0].GetCardValue1()==(Phand[3].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Phand[1].GetCardValue1()==(Phand[3].GetCardValue1()+1)) {
			if (Phand[3].GetCardValue1()==(Phand[0].GetCardValue1()+1)) {
				if (Phand[0].GetCardValue1()==(Phand[2].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Phand[1].GetCardValue1()==(Phand[3].GetCardValue1()+1)) {
			if (Phand[3].GetCardValue1()==(Phand[2].GetCardValue1()+1)) {
				if (Phand[2].GetCardValue1()==(Phand[0].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Phand[1].GetCardValue1()==(Phand[0].GetCardValue1()+1)) {
			if (Phand[0].GetCardValue1()==(Phand[2].GetCardValue1()+1)) {
				if (Phand[2].GetCardValue1()==(Phand[3].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Phand[1].GetCardValue1()==(Phand[0].GetCardValue1()+1)) {
			if (Phand[0].GetCardValue1()==(Phand[3].GetCardValue1()+1)) {
				if (Phand[3].GetCardValue1()==(Phand[2].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Phand[2].GetCardValue1()==(Phand[3].GetCardValue1()+1)) {
			if (Phand[3].GetCardValue1()==(Phand[1].GetCardValue1()+1)) {
				if (Phand[1].GetCardValue1()==(Phand[0].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Phand[2].GetCardValue1()==(Phand[3].GetCardValue1()+1)) {
			if (Phand[3].GetCardValue1()==(Phand[0].GetCardValue1()+1)) {
				if (Phand[0].GetCardValue1()==(Phand[1].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Phand[2].GetCardValue1()==(Phand[1].GetCardValue1()+1)) {
			if (Phand[1].GetCardValue1()==(Phand[0].GetCardValue1()+1)) {
				if (Phand[0].GetCardValue1()==(Phand[3].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Phand[2].GetCardValue1()==(Phand[1].GetCardValue1()+1)) {
			if (Phand[1].GetCardValue1()==(Phand[3].GetCardValue1()+1)) {
				if (Phand[3].GetCardValue1()==(Phand[0].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Phand[2].GetCardValue1()==(Phand[0].GetCardValue1()+1)) {
			if (Phand[0].GetCardValue1()==(Phand[1].GetCardValue1()+1)) {
				if (Phand[1].GetCardValue1()==(Phand[3].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Phand[2].GetCardValue1()==(Phand[0].GetCardValue1()+1)) {
			if (Phand[0].GetCardValue1()==(Phand[3].GetCardValue1()+1)) {
				if (Phand[3].GetCardValue1()==(Phand[1].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Phand[3].GetCardValue1()==(Phand[0].GetCardValue1()+1)) {
			if (Phand[0].GetCardValue1()==(Phand[1].GetCardValue1()+1)) {
				if (Phand[1].GetCardValue1()==(Phand[2].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Phand[3].GetCardValue1()==(Phand[0].GetCardValue1()+1)) {
			if (Phand[0].GetCardValue1()==(Phand[2].GetCardValue1()+1)) {
				if (Phand[2].GetCardValue1()==(Phand[1].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Phand[3].GetCardValue1()==(Phand[1].GetCardValue1()+1)) {
			if (Phand[1].GetCardValue1()==(Phand[2].GetCardValue1()+1)) {
				if (Phand[2].GetCardValue1()==(Phand[0].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Phand[3].GetCardValue1()==(Phand[1].GetCardValue1()+1)) {
			if (Phand[1].GetCardValue1()==(Phand[0].GetCardValue1()+1)) {
				if (Phand[0].GetCardValue1()==(Phand[2].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Phand[3].GetCardValue1()==(Phand[2].GetCardValue1()+1)) {
			if (Phand[2].GetCardValue1()==(Phand[1].GetCardValue1()+1)) {
				if (Phand[1].GetCardValue1()==(Phand[0].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Phand[3].GetCardValue1()==(Phand[2].GetCardValue1()+1)) {
			if (Phand[2].GetCardValue1()==(Phand[0].GetCardValue1()+1)) {
				if (Phand[0].GetCardValue1()==(Phand[1].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		
		return 3*runscore;
	}
	  
	    public int scoreHand_P() {
			System.out.println("");
			 System.out.println(P_is15() +" points awarded for 15's in the Player hand!");
			 System.out.println(P_ispairs() +" points awarded for pairs in the Player hand!");
			 System.out.println((P_isrun()) +" points awarded for runs in the Player hand!");
			 System.out.println("");
	    	System.out.println("The Player hand score is: " + (P_is15() + P_isrun() + P_ispairs()) );
	    	return P_is15() + P_isrun() + P_ispairs();
	    	
	    }
	    
	    public int C_is15() {
	  		int fifteenscore = 0;
			if ((Chand[0].GetCardValue() + Chand[1].GetCardValue())==15) {
					fifteenscore+=2;
				}
			if ((Chand[0].GetCardValue() + Chand[2].GetCardValue())==15) {
				fifteenscore+=2;
			}
			if ((Chand[0].GetCardValue() + Chand[3].GetCardValue())==15) {
				fifteenscore+=2;
			}
			if ((Chand[1].GetCardValue() + Chand[2].GetCardValue())==15) {
				fifteenscore+=2;
			}
			if ((Chand[1].GetCardValue() + Chand[3].GetCardValue())==15) {
				fifteenscore+=2;
			}
			if ((Chand[2].GetCardValue() + Chand[3].GetCardValue())==15) {
				fifteenscore+=2;
			}
			if ((Chand[0].GetCardValue() + Chand[1].GetCardValue()+Chand[2].GetCardValue())==15) {
				fifteenscore+=2;
			}
			if ((Chand[0].GetCardValue() + Chand[1].GetCardValue()+Chand[3].GetCardValue())==15) {
				fifteenscore+=2;
			}
			if ((Chand[0].GetCardValue() + Chand[2].GetCardValue()+Chand[3].GetCardValue())==15) {
				fifteenscore+=2;
			}
			if ((Chand[1].GetCardValue() + Chand[2].GetCardValue()+Chand[3].GetCardValue())==15) {
				fifteenscore+=2;
			}
			if ((Chand[0].GetCardValue() + Chand[2].GetCardValue()+Chand[3].GetCardValue()+Chand[1].GetCardValue())==15) {
				fifteenscore+=2;
			}

			  
			return fifteenscore;


	  		}
	  	
	  //computer number of pairs
	  public int C_ispairs() {
			  int scoreadd = 0;
			 
				if (Chand[0].GetCardValue1()==Chand[1].GetCardValue1()) {
					scoreadd+=2;
				}
				if (Chand[0].GetCardValue1()==Chand[2].GetCardValue1()) {
					scoreadd+=2;
				}
				if (Chand[0].GetCardValue1()==Chand[3].GetCardValue1()) {
					scoreadd+=2;
				}
				if (Chand[1].GetCardValue1()==Chand[2].GetCardValue1()) {
					scoreadd+=2;
				}
				if (Chand[1].GetCardValue1()==Chand[3].GetCardValue1()) {
					scoreadd+=2;
				}
				if (Chand[2].GetCardValue1()==Chand[3].GetCardValue1()) {
					scoreadd+=2;
				}	
	
				return scoreadd;
		  }
	  	
	//compute number of runs
	  public int C_isrun() {
	  int runscore = 0;
		if (Chand[0].GetCardValue1()==(Chand[1].GetCardValue1()+1)) {
			if (Chand[1].GetCardValue1()==(Chand[2].GetCardValue1()+1)) {
				if (Chand[2].GetCardValue1()==(Chand[3].GetCardValue1()+1)) {
					runscore++;
				}
			}
			if (Chand[1].GetCardValue1()==(Chand[3].GetCardValue1()+1)) {
				if (Chand[3].GetCardValue1()==(Chand[2].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Chand[0].GetCardValue1()==(Chand[2].GetCardValue1()+1)) {
			if (Chand[2].GetCardValue1()==(Chand[1].GetCardValue1()+1)) {
				if (Chand[1].GetCardValue1()==(Chand[3].GetCardValue1()+1)) {
					runscore++;
				}
			}
			if (Chand[2].GetCardValue1()==(Chand[3].GetCardValue1()+1)) {
				if (Chand[3].GetCardValue1()==(Chand[1].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Chand[0].GetCardValue1()==(Chand[3].GetCardValue1()+1)) {
			if (Chand[3].GetCardValue1()==(Chand[1].GetCardValue1()+1)) {
				if (Chand[1].GetCardValue1()==(Chand[2].GetCardValue1()+1)) {
					runscore++;
				}
			}
			if (Chand[3].GetCardValue1()==(Chand[2].GetCardValue1()+1)) {
				if (Chand[2].GetCardValue1()==(Chand[1].GetCardValue1()+1)) {
					runscore++;
		}
			}
		}
		if (Chand[1].GetCardValue1()==(Chand[2].GetCardValue1()+1)) {
			if (Chand[2].GetCardValue1()==(Chand[3].GetCardValue1()+1)) {
				if (Chand[3].GetCardValue1()==(Chand[0].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Chand[1].GetCardValue1()==(Chand[2].GetCardValue1()+1)) {
			if (Chand[2].GetCardValue1()==(Chand[0].GetCardValue1()+1)) {
				if (Chand[0].GetCardValue1()==(Chand[3].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Chand[1].GetCardValue1()==(Chand[3].GetCardValue1()+1)) {
			if (Chand[3].GetCardValue1()==(Chand[0].GetCardValue1()+1)) {
				if (Chand[0].GetCardValue1()==(Chand[2].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Chand[1].GetCardValue1()==(Chand[3].GetCardValue1()+1)) {
			if (Chand[3].GetCardValue1()==(Chand[2].GetCardValue1()+1)) {
				if (Chand[2].GetCardValue1()==(Chand[0].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Chand[1].GetCardValue1()==(Chand[0].GetCardValue1()+1)) {
			if (Chand[0].GetCardValue1()==(Chand[2].GetCardValue1()+1)) {
				if (Chand[2].GetCardValue1()==(Chand[3].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Chand[1].GetCardValue1()==(Chand[0].GetCardValue1()+1)) {
			if (Chand[0].GetCardValue1()==(Chand[3].GetCardValue1()+1)) {
				if (Chand[3].GetCardValue1()==(Chand[2].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Chand[2].GetCardValue1()==(Chand[3].GetCardValue1()+1)) {
			if (Chand[3].GetCardValue1()==(Chand[1].GetCardValue1()+1)) {
				if (Chand[1].GetCardValue1()==(Chand[0].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Chand[2].GetCardValue1()==(Chand[3].GetCardValue1()+1)) {
			if (Chand[3].GetCardValue1()==(Chand[0].GetCardValue1()+1)) {
				if (Chand[0].GetCardValue1()==(Chand[1].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Chand[2].GetCardValue1()==(Chand[1].GetCardValue1()+1)) {
			if (Chand[1].GetCardValue1()==(Chand[0].GetCardValue1()+1)) {
				if (Chand[0].GetCardValue1()==(Chand[3].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Chand[2].GetCardValue1()==(Chand[1].GetCardValue1()+1)) {
			if (Chand[1].GetCardValue1()==(Chand[3].GetCardValue1()+1)) {
				if (Chand[3].GetCardValue1()==(Chand[0].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Chand[2].GetCardValue1()==(Chand[0].GetCardValue1()+1)) {
			if (Chand[0].GetCardValue1()==(Chand[1].GetCardValue1()+1)) {
				if (Chand[1].GetCardValue1()==(Chand[3].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Chand[2].GetCardValue1()==(Chand[0].GetCardValue1()+1)) {
			if (Chand[0].GetCardValue1()==(Chand[3].GetCardValue1()+1)) {
				if (Chand[3].GetCardValue1()==(Chand[1].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Chand[3].GetCardValue1()==(Chand[0].GetCardValue1()+1)) {
			if (Chand[0].GetCardValue1()==(Chand[1].GetCardValue1()+1)) {
				if (Chand[1].GetCardValue1()==(Chand[2].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Chand[3].GetCardValue1()==(Chand[0].GetCardValue1()+1)) {
			if (Chand[0].GetCardValue1()==(Chand[2].GetCardValue1()+1)) {
				if (Chand[2].GetCardValue1()==(Chand[1].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Chand[3].GetCardValue1()==(Chand[1].GetCardValue1()+1)) {
			if (Chand[1].GetCardValue1()==(Chand[2].GetCardValue1()+1)) {
				if (Chand[2].GetCardValue1()==(Chand[0].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Chand[3].GetCardValue1()==(Chand[1].GetCardValue1()+1)) {
			if (Chand[1].GetCardValue1()==(Chand[0].GetCardValue1()+1)) {
				if (Chand[0].GetCardValue1()==(Chand[2].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Chand[3].GetCardValue1()==(Chand[2].GetCardValue1()+1)) {
			if (Chand[2].GetCardValue1()==(Chand[1].GetCardValue1()+1)) {
				if (Chand[1].GetCardValue1()==(Chand[0].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}
		if (Chand[3].GetCardValue1()==(Chand[2].GetCardValue1()+1)) {
			if (Chand[2].GetCardValue1()==(Chand[0].GetCardValue1()+1)) {
				if (Chand[0].GetCardValue1()==(Chand[1].GetCardValue1()+1)) {
					runscore++;
				}
			}
		}

		return 3*runscore;
	}
	  
	    public int scoreHand_C() {
			System.out.println("");
			 System.out.println(C_is15() +" points awarded for 15's in the Computer's hand!");
			 System.out.println(C_ispairs() +" points awarded for pairs in the Computer's hand!");
			 System.out.println((C_isrun()) +" points awarded for runs in the Computer's hand!");
			 System.out.println("");
	    	System.out.println("The Computer hand score is: " + (C_is15() + C_isrun() + C_ispairs()) );
	    	return C_is15() + C_isrun() + C_ispairs();
	    	
	    }
	   
	   public void get_Phand() {
	    	System.out.println("");
	    	System.out.println("Playerhand was:");
	    	for (int i=0;i< Phand.length;i++) {
	    		System.out.println(Phand[i]);	
	    	}
	   }
	   
	   public void get_Chand() {
	    	System.out.println("");
	    	System.out.println("Computer hand was:");
	    	for (int i=0;i< Chand.length;i++) {
	    		System.out.println(Chand[i]);	
	    	}
	   }
	   
	   public void resetCopy_hands() {
		   Chand[0] = null;
		   Chand[1] = null;
		   Chand[2] = null;
		   Chand[3] = null;
		   
		   Phand[0] = null;
		   Phand[1] = null;
		   Phand[2] = null;
		   Phand[3] = null;
	   }
	

}
