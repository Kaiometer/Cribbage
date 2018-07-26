
public class Crib 
{
	
    private Card[] Crib = new Card[4];
    int nextIndex = 0;

    
    public void addCrib(Card[] x){
    Crib[nextIndex] = x[0];
    nextIndex++;
    Crib[nextIndex] = x[1];
    nextIndex++;
    }
    
    public void getCrib() {
    	System.out.println("The crib contained:");
    	for (int x = 0; x<4; x++)
    System.out.println(Crib[x]);
    }
    
    public int scoreCrib() {
   	 System.out.println("");
	  System.out.println(is15() +" points awarded for 15's in the crib!");
	  System.out.println(ispairs() +" points awarded for pairs in the crib!");
	  System.out.println(isrun() +" points awarded for runs in the crib!");
	  System.out.println("");
    	System.out.println("The crib score is: " + (is15() + isrun() + ispairs()) );
    	return is15() + isrun() + ispairs();
    	
    }
   

    
    public void reset() {
       	
       	Crib[0] = null;
       	Crib[1] = null;
       	Crib[2] = null;
       	Crib[3] = null;
       	nextIndex = 0;
      
    }
    
    public int is15() {
  		int fifteenscore = 0;
		if ((Crib[0].GetCardValue() + Crib[1].GetCardValue())==15) {
				fifteenscore+=2;
			}
		if ((Crib[0].GetCardValue() + Crib[2].GetCardValue())==15) {
			fifteenscore+=2;
		}
		if ((Crib[0].GetCardValue() + Crib[3].GetCardValue())==15) {
			fifteenscore+=2;
		}
		if ((Crib[1].GetCardValue() + Crib[2].GetCardValue())==15) {
			fifteenscore+=2;
		}
		if ((Crib[1].GetCardValue() + Crib[3].GetCardValue())==15) {
			fifteenscore+=2;
		}
		if ((Crib[2].GetCardValue() + Crib[3].GetCardValue())==15) {
			fifteenscore+=2;
		}
		if ((Crib[0].GetCardValue() + Crib[1].GetCardValue()+Crib[2].GetCardValue())==15) {
			fifteenscore+=2;
		}
		if ((Crib[0].GetCardValue() + Crib[1].GetCardValue()+Crib[3].GetCardValue())==15) {
			fifteenscore+=2;
		}
		if ((Crib[0].GetCardValue() + Crib[2].GetCardValue()+Crib[3].GetCardValue())==15) {
			fifteenscore+=2;
		}
		if ((Crib[1].GetCardValue() + Crib[2].GetCardValue()+Crib[3].GetCardValue())==15) {
			fifteenscore+=2;
		}
		if ((Crib[0].GetCardValue() + Crib[2].GetCardValue()+Crib[3].GetCardValue()+Crib[1].GetCardValue())==15) {
			fifteenscore+=2;
		}
		  
		return fifteenscore;


  		}
  	
  //computer number of pairs
  public int ispairs() {
		  int scoreadd = 0;
		 
			if (Crib[0].GetCardValue1()==Crib[1].GetCardValue1()) {
				scoreadd+=2;
			}
			if (Crib[0].GetCardValue1()==Crib[2].GetCardValue1()) {
				scoreadd+=2;
			}
			if (Crib[0].GetCardValue1()==Crib[3].GetCardValue1()) {
				scoreadd+=2;
			}
			if (Crib[1].GetCardValue1()==Crib[2].GetCardValue1()) {
				scoreadd+=2;
			}
			if (Crib[1].GetCardValue1()==Crib[3].GetCardValue1()) {
				scoreadd+=2;
			}
			if (Crib[2].GetCardValue1()==Crib[3].GetCardValue1()) {
				scoreadd+=2;
			}	
			  
			return scoreadd;
	  }
  	
//compute number of runs
  public int isrun() {
  int runscore = 0;
	if (Crib[0].GetCardValue1()==(Crib[1].GetCardValue1()+1)) {
		if (Crib[1].GetCardValue1()==(Crib[2].GetCardValue1()+1)) {
			if (Crib[2].GetCardValue1()==(Crib[3].GetCardValue1()+1)) {
				runscore++;
			}
		}
		if (Crib[1].GetCardValue1()==(Crib[3].GetCardValue1()+1)) {
			if (Crib[3].GetCardValue1()==(Crib[2].GetCardValue1()+1)) {
				runscore++;
			}
		}
	}
	if (Crib[0].GetCardValue1()==(Crib[2].GetCardValue1()+1)) {
		if (Crib[2].GetCardValue1()==(Crib[1].GetCardValue1()+1)) {
			if (Crib[1].GetCardValue1()==(Crib[3].GetCardValue1()+1)) {
				runscore++;
			}
		}
		if (Crib[2].GetCardValue1()==(Crib[3].GetCardValue1()+1)) {
			if (Crib[3].GetCardValue1()==(Crib[1].GetCardValue1()+1)) {
				runscore++;
			}
		}
	}
	if (Crib[0].GetCardValue1()==(Crib[3].GetCardValue1()+1)) {
		if (Crib[3].GetCardValue1()==(Crib[1].GetCardValue1()+1)) {
			if (Crib[1].GetCardValue1()==(Crib[2].GetCardValue1()+1)) {
				runscore++;
			}
		}
		if (Crib[3].GetCardValue1()==(Crib[2].GetCardValue1()+1)) {
			if (Crib[2].GetCardValue1()==(Crib[1].GetCardValue1()+1)) {
				runscore++;
	}
		}
	}
	if (Crib[1].GetCardValue1()==(Crib[2].GetCardValue1()+1)) {
		if (Crib[2].GetCardValue1()==(Crib[3].GetCardValue1()+1)) {
			if (Crib[3].GetCardValue1()==(Crib[0].GetCardValue1()+1)) {
				runscore++;
			}
		}
	}
	if (Crib[1].GetCardValue1()==(Crib[2].GetCardValue1()+1)) {
		if (Crib[2].GetCardValue1()==(Crib[0].GetCardValue1()+1)) {
			if (Crib[0].GetCardValue1()==(Crib[3].GetCardValue1()+1)) {
				runscore++;
			}
		}
	}
	if (Crib[1].GetCardValue1()==(Crib[3].GetCardValue1()+1)) {
		if (Crib[3].GetCardValue1()==(Crib[0].GetCardValue1()+1)) {
			if (Crib[0].GetCardValue1()==(Crib[2].GetCardValue1()+1)) {
				runscore++;
			}
		}
	}
	if (Crib[1].GetCardValue1()==(Crib[3].GetCardValue1()+1)) {
		if (Crib[3].GetCardValue1()==(Crib[2].GetCardValue1()+1)) {
			if (Crib[2].GetCardValue1()==(Crib[0].GetCardValue1()+1)) {
				runscore++;
			}
		}
	}
	if (Crib[1].GetCardValue1()==(Crib[0].GetCardValue1()+1)) {
		if (Crib[0].GetCardValue1()==(Crib[2].GetCardValue1()+1)) {
			if (Crib[2].GetCardValue1()==(Crib[3].GetCardValue1()+1)) {
				runscore++;
			}
		}
	}
	if (Crib[1].GetCardValue1()==(Crib[0].GetCardValue1()+1)) {
		if (Crib[0].GetCardValue1()==(Crib[3].GetCardValue1()+1)) {
			if (Crib[3].GetCardValue1()==(Crib[2].GetCardValue1()+1)) {
				runscore++;
			}
		}
	}
	if (Crib[2].GetCardValue1()==(Crib[3].GetCardValue1()+1)) {
		if (Crib[3].GetCardValue1()==(Crib[1].GetCardValue1()+1)) {
			if (Crib[1].GetCardValue1()==(Crib[0].GetCardValue1()+1)) {
				runscore++;
			}
		}
	}
	if (Crib[2].GetCardValue1()==(Crib[3].GetCardValue1()+1)) {
		if (Crib[3].GetCardValue1()==(Crib[0].GetCardValue1()+1)) {
			if (Crib[0].GetCardValue1()==(Crib[1].GetCardValue1()+1)) {
				runscore++;
			}
		}
	}
	if (Crib[2].GetCardValue1()==(Crib[1].GetCardValue1()+1)) {
		if (Crib[1].GetCardValue1()==(Crib[0].GetCardValue1()+1)) {
			if (Crib[0].GetCardValue1()==(Crib[3].GetCardValue1()+1)) {
				runscore++;
			}
		}
	}
	if (Crib[2].GetCardValue1()==(Crib[1].GetCardValue1()+1)) {
		if (Crib[1].GetCardValue1()==(Crib[3].GetCardValue1()+1)) {
			if (Crib[3].GetCardValue1()==(Crib[0].GetCardValue1()+1)) {
				runscore++;
			}
		}
	}
	if (Crib[2].GetCardValue1()==(Crib[0].GetCardValue1()+1)) {
		if (Crib[0].GetCardValue1()==(Crib[1].GetCardValue1()+1)) {
			if (Crib[1].GetCardValue1()==(Crib[3].GetCardValue1()+1)) {
				runscore++;
			}
		}
	}
	if (Crib[2].GetCardValue1()==(Crib[0].GetCardValue1()+1)) {
		if (Crib[0].GetCardValue1()==(Crib[3].GetCardValue1()+1)) {
			if (Crib[3].GetCardValue1()==(Crib[1].GetCardValue1()+1)) {
				runscore++;
			}
		}
	}
	if (Crib[3].GetCardValue1()==(Crib[0].GetCardValue1()+1)) {
		if (Crib[0].GetCardValue1()==(Crib[1].GetCardValue1()+1)) {
			if (Crib[1].GetCardValue1()==(Crib[2].GetCardValue1()+1)) {
				runscore++;
			}
		}
	}
	if (Crib[3].GetCardValue1()==(Crib[0].GetCardValue1()+1)) {
		if (Crib[0].GetCardValue1()==(Crib[2].GetCardValue1()+1)) {
			if (Crib[2].GetCardValue1()==(Crib[1].GetCardValue1()+1)) {
				runscore++;
			}
		}
	}
	if (Crib[3].GetCardValue1()==(Crib[1].GetCardValue1()+1)) {
		if (Crib[1].GetCardValue1()==(Crib[2].GetCardValue1()+1)) {
			if (Crib[2].GetCardValue1()==(Crib[0].GetCardValue1()+1)) {
				runscore++;
			}
		}
	}
	if (Crib[3].GetCardValue1()==(Crib[1].GetCardValue1()+1)) {
		if (Crib[1].GetCardValue1()==(Crib[0].GetCardValue1()+1)) {
			if (Crib[0].GetCardValue1()==(Crib[2].GetCardValue1()+1)) {
				runscore++;
			}
		}
	}
	if (Crib[3].GetCardValue1()==(Crib[2].GetCardValue1()+1)) {
		if (Crib[2].GetCardValue1()==(Crib[1].GetCardValue1()+1)) {
			if (Crib[1].GetCardValue1()==(Crib[0].GetCardValue1()+1)) {
				runscore++;
			}
		}
	}
	if (Crib[3].GetCardValue1()==(Crib[2].GetCardValue1()+1)) {
		if (Crib[2].GetCardValue1()==(Crib[0].GetCardValue1()+1)) {
			if (Crib[0].GetCardValue1()==(Crib[1].GetCardValue1()+1)) {
				runscore++;
			}
		}
	}
	
	return 3*runscore;
}


}