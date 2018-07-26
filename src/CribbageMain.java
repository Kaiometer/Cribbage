import java.util.Scanner;

//Cribbage: A predominantly Canadian game which has uncertain origins but is known to date back over 500 years.
/* Instructions if you don't know how to play, from en.wikipedia.org/wiki/Cribbage :
* NOTE: After you input a number any time in this game click enter for the game to continue running. Illegal player moves may compromise the integrity of the program and cause false cards to be displayed at future instances in the game.
* 	1. Chose where to split or cut the deck
* 	2. Chose two cards to add to the crib, depending on who is the dealer either you or the computer player will get the crib, an extra set of cards that you can later draw point from.
*  Now for the count off:
*  You and the computer will go back and forth taking cards out of your hands and adding them to the center. The total value of the cards cannot go over 31. When it does a new round will be started.
*  	How to earn points in the count off:
*  		1. Place down a card that brings the total value of the cards to 15
*  		2. Place down a card that brings the total value of the cards to 31
*  		3. Being the one to put the last card
*  		4. Forming a card pair with an already played card
*  		5. When the other player has to go, which is when they do not have any cards that when added keep the total card value under 31. If a player has no more cards a point is awarded to the opposition and a new round may commence
* After the count off both sides take back their cards for the counting:
* You and the computer count the number of points you have from your hand and then the dealer counts the amount of points in their crib. 
* Points then translate into the number of pegs you move up the board. 
*How to earn point in the counting:
*		1. Have two cards that are of the same number. Example: six of hearts, and six of clubs
*		2. Have a run which are a series of cards that increases by one point. Example: one of hearts, 2 of clubs, 3 of diamonds.
*		3. Have a pair of cards that adds to 15.
*How to win:
*Get your peg value to exceed 121. To skunk (crush) your opponent, get to the hundred twenty-first peg before they reach peg 91! (Gives boasting rights :P)
*
*In the unlikely event that the program displays either a completely white screen or some other bug, (we had a corrupted class on Thursday evening which we believe to have found and deleted,) please restart Eclipse.  
*Please do not hesitate to re-download this program or Eclipse if the issue is not resolved: the corruption appeared to be isolated and should not affect anything outside of Eclipse.
*
*We hope you enjoy. 
*
*-Kaya
*-Max
*
*/

public class CribbageMain {
public static void main(String[] args) {
		
		ComputerPlayer p1 = new ComputerPlayer();
		Player p2 = new Player();
		WhoDeals wd = new WhoDeals();
		Crib cr = new Crib();
		InPlay game = new InPlay();
		Pegs peg = new Pegs();
		Scanner sc = new Scanner(System.in);
		Hand hand = new Hand();
		
		boolean round2 = true;
		int counter = 1;
		int pt = 0;
		boolean l4 = true;
		boolean l3 = true;
		boolean l2 = true;
		boolean l1 = true;
		boolean c4 = true;
		boolean c3 = true;
		boolean c2 = true;
		boolean c1 = true;
		boolean rvar1 = false;
	
		System.out.println("Welcome to Cribbage!");
		System.out.println("");
			
		
		wd.shuffleDeck();
		System.out.println("Where would you like to cut the deck? (1-50)");
		wd.SetDealer(sc.nextInt());
		
		//game loop start
		while (peg.getPpoints() < 121 && peg.getCpoints() < 121) {
	
				
				
				if (wd.isDealerPlayer() == true) {
					System.out.println("/******** PLAYER DEALER: *********/");
					pt = 0;
					l4 = true;
					l3 = true;
					l2 = true;
					l1 = true;
					c4 = true;
					c3 = true;
					c2 = true;
					c1 = true;
					round2 = true;
					rvar1 = false;
					cr.reset(); 
					p1.reset(); 
					p2.reset(); 
					game.resetInPlay();
					hand.resetCopy_hands();
					p1.shuffleDeck(); 
					
					for (int i=0;i<7;i++) {
					p1.addCardToHand(p1.dealCard());	
					}
					for (int i=0;i<7;i++) {
					p2.addCardToHand(p1.dealCard());	
					}
					
					p2.getHand();
					System.out.println("");
					
					System.out.println("The computer is sending cards to the crib...");
					System.out.println("Which cards would you like to send to the crib? (Input a number between 1 and 6, then press enter and repeat)");
					p1.decideCribCards();
					cr.addCrib(p1.returnCribCards());
					
					p2.decideCribCards(sc.nextInt()-1, sc.nextInt()-1);
					cr.addCrib(p2.returnCribCards());
					
					//MAKE DUPLICATE HANDS
					hand.make_Chand(p1.copy_hand());
					hand.make_Phand(p2.copy_hand());
					
					while (round2 == true) {
		

			
					if (c4 == true)	{
					if (pt == 0 && p1.amountCards() != 1) {
					//computer card choice
					for(int x = 3; x >=0; x--) {
					if (game.canPlay(p1.getCard(x))) {
						game.addcard(p1.getCard(x));
						game.addCardToGame(p1.play4Card(x));
						peg.addCpoints(game.fifteen_thirtyone() + game.doublecheck());
						game.printInPlay();
						pt = 1;
						c4 = false;
						break;
						}
					}
					}
					}
					
					if (l4 == true)	{
					//player card choice
					if (pt == 1 && p2.amountCards() != 1) {
					for(int x = 3; x >=0; x--) {
					if (game.canPlay(p2.getCard(x))) {
						p2.getHand();
						System.out.println("What card would you like to play?");
						int n = sc.nextInt()-1;
						game.addcard(p2.getCard(n));
						int p_card = p2.play4Card(n);
						game.addCardToGame(p_card);
						peg.addPpoints(game.fifteen_thirtyone() + game.doublecheck());
						game.printInPlay();
						pt = 0;
						l1 = false;
						break;
						}
					}
					}
					}
					
					if (c3 == true)	{
					if (pt == 0 && p1.amountCards() != 1) {
					//computer card choice
					for(int x = 2; x >=0; x--) {
					if (game.canPlay(p1.getCard(x))) {
						game.addcard(p1.getCard(x));
						game.addCardToGame(p1.play3Card(x));
						peg.addCpoints(game.fifteen_thirtyone() + game.doublecheck());
						game.printInPlay();
						pt = 1;
						c3 = false;
						break;
						}
					}
					}
					}
					
					if (l3 == true)	{
					if (pt == 1 && p2.amountCards() != 1) {
					//player card choice
					for(int x = 2; x >=0; x--) {
					if (game.canPlay(p2.getCard(x))) {
						p2.getHand();
						System.out.println("What card would you like to play?");
						int n = sc.nextInt()-1;
						game.addcard(p2.getCard(n));
						int p_card = p2.play3Card(n);
						game.addCardToGame(p_card);
						peg.addPpoints(game.fifteen_thirtyone() + game.doublecheck());
						game.printInPlay();
						pt = 0;
						l3 = false;
						break;
						}
					}
					}
					}

					if (c2 == true)	{
						if (pt == 0 && p1.amountCards() != 1) {
						//computer card choice
						for(int x = 1; x >=0; x--) {
						if (game.canPlay(p1.getCard(x))) {
							game.addcard(p1.getCard(x));
							game.addCardToGame(p1.play2Card(x));
							peg.addCpoints(game.fifteen_thirtyone() + game.doublecheck());
							game.printInPlay();
							pt = 1;
							c2 = false;
							break;
							}
						}
						}
						}

					if (l2 == true)	{
					if (pt == 1 && p2.amountCards() != 1) {
					//player card choice
					for(int x = 1; x >=0; x--) {
					if (game.canPlay(p2.getCard(x))) {
						p2.getHand();
						System.out.println("What card would you like to play?");
						int n = sc.nextInt()-1;
						game.addcard(p2.getCard(n));
						int p_card = p2.play2Card(n);
						game.addCardToGame(p_card);
						peg.addPpoints(game.fifteen_thirtyone() + game.doublecheck());
						game.printInPlay();
						pt = 0;
						l2 = false;
						break;
						}
					}
					}
					}
					
					if (c1 == true)	{
					if (pt == 0 && p1.amountCards() != 1) {
					//computer card choice
					for(int x = 0; x >=0; x--) {
					if (game.canPlay(p1.getCard(x))) {
						game.addcard(p1.getCard(x));
						game.addCardToGame(p1.play1Card(x));
						peg.addCpoints(game.fifteen_thirtyone() + game.doublecheck());
						game.printInPlay();
						pt = 1;
						c1 = false;
						break;
						}
					}
					}
					}
					
					if (l1 == true)	{
					if (pt == 1 && p2.amountCards() != 1) {
					//player card choice
					for(int x = 0; x >=0; x--) {
					if (game.canPlay(p2.getCard(x))) {
						p2.getHand();
						System.out.println("What card would you like to play?");
						int n = sc.nextInt()-1;
						game.addcard(p2.getCard(n));
						int p_card = p2.play1Card(n);
						game.addCardToGame(p_card);
						peg.addPpoints(game.fifteen_thirtyone() + game.doublecheck());
						game.printInPlay();
						pt = 0;
						l1 = false;
						break;
						}
					}
					}
					}
					
					
					round2 = false;
					
					
					if(p1.hasCards()==true && p2.hasCards()==true) {
				
						if(p2.amountCards() > p1.amountCards() && counter%2 == 1) {
							System.out.println("You must 'GO'");
							System.out.println("Computer played last card; computer gets a point");
							peg.addCpoints(1);
							pt = 0;
						}

						if(p2.amountCards() == p1.amountCards() && counter%2 == 1) {
							System.out.println("Computer must 'GO'");
							System.out.println("You played last card; you get a point");
							peg.addPpoints(1);
							pt = 1;
						}
						
						if(p2.amountCards() > p1.amountCards() && counter%2 == 0) {
							System.out.println("You must 'GO'");
							System.out.println("Computer played last card; computer gets a point");
							peg.addCpoints(1);
							pt = 0;
						}

						if(p2.amountCards() == p1.amountCards() && counter%2 == 0) {
							System.out.println("Computer must 'GO'");
							System.out.println("You played last card; you get a point");
							peg.addPpoints(1);
							pt = 1;	
						}
						
						System.out.println("Round " + counter + " Complete");
						System.out.println("/*********************************************/");
						System.out.println("Round " + (counter+1) + " Commencing:");
						counter ++;
						game.clearhand();
						round2 = true;
					}
					
					if(p1.hasCards() == false && p2.hasCards()== false && rvar1 == false) {
						
						if(p2.amountCards() > p1.amountCards() && counter%2 == 1) {
							System.out.println("You must 'GO'");
							System.out.println("Computer played last card; computer gets a point");
							peg.addCpoints(1);
							pt = 0;
							rvar1 = true;
						}

						if(p2.amountCards() == p1.amountCards() && counter%2 == 1) {
							System.out.println("Computer must 'GO'");
							System.out.println("You played last card; you get a point");
							peg.addPpoints(1);
							pt = 1;
							rvar1 = true;
						}
						
						if(p2.amountCards() > p1.amountCards() && counter%2 == 0) {
							System.out.println("You must 'GO'");
							System.out.println("Computer played last card; computer gets a point");
							peg.addCpoints(1);
							pt = 0;
							rvar1 = true;
						}

						if(p2.amountCards() == p1.amountCards() && counter%2 == 0) {
							System.out.println("Computer must 'GO'");
							System.out.println("You played last card; you get a point");
							peg.addPpoints(1);
							pt = 1;	
							rvar1 = true;
						}
						
						System.out.println("Round " + counter + " Complete");
						System.out.println("Round " + counter + " Complete");
						System.out.println("/*********************************************/");
						counter ++;
						game.clearhand();
						round2 = true;
						System.out.println("");
						peg.addCpoints(hand.scoreHand_C());
						peg.addCpoints(hand.scoreHand_P());
						System.out.println("");
						peg.addPpoints(cr.scoreCrib());
						cr.getCrib();
						System.out.println("");
						System.out.println("Player is at peg "+ peg.getPpoints());
						System.out.println("Computer is at peg "+ peg.getCpoints());
						System.out.println("");
						System.out.println("******************************");
						System.out.println("NEW ROUND BEGENING - DEALER IS SWITCHING");
						wd.dealerPlayer(); 
						System.out.println("******************************");
						counter = 1;
					}
					
					if(p1.amountCards() == 1 && p2.amountCards() != 1) {
						System.out.println("/*********************************************/");
						System.out.println("The computer has no cards left - player will play and computer must 'GO'");
						System.out.println("Player gets a point");
						peg.addPpoints(1);
						
						System.out.println("");
						peg.addCpoints(hand.scoreHand_C());
						peg.addCpoints(hand.scoreHand_P());
						System.out.println("");
						peg.addPpoints(cr.scoreCrib());
						cr.getCrib();
						System.out.println("");
						System.out.println("Player is at peg "+ peg.getPpoints());
						System.out.println("Computer is at peg "+ peg.getCpoints());
						System.out.println("");
						System.out.println("******************************");
						System.out.println("NEW ROUND BEGENING - DEALER IS SWITCHING");
						wd.dealerComputer(); 
						System.out.println("******************************");
						counter = 1;

					}
					
					if(p2.amountCards() == 1 && p1.amountCards() != 1) {
						System.out.println("/*********************************************/");
						System.out.println("You have no cards left - computer plays and you must 'GO'");
						System.out.println("Computer gets a point");
						peg.addCpoints(1);
						
						System.out.println("");
						peg.addCpoints(hand.scoreHand_C());
						peg.addCpoints(hand.scoreHand_P());
						System.out.println("");
						peg.addPpoints(cr.scoreCrib());
						cr.getCrib();
						System.out.println("");
						System.out.println("Player is at peg "+ peg.getPpoints());
						System.out.println("Computer is at peg "+ peg.getCpoints());
						System.out.println("");
						System.out.println("******************************");
						System.out.println("NEW ROUND BEGENING - DEALER IS SWITCHING");
						wd.dealerComputer(); 
						System.out.println("******************************");
						counter = 1;
					}
					
					}
				}
				
				/**************** PLAYER NOT DEALER: ****************/
				
				
				if (wd.isDealerPlayer() == false) {
					System.out.println("/******** COMPUTER DEALER: *********/");
					pt = 0;
					rvar1 = false;
					l4 = true;
					l3 = true;
					l2 = true;
					l1 = true;
					c4 = true;
					c3 = true;
					c2 = true;
					c1 = true;
					round2 = true;
					cr.reset(); 
					p1.reset(); 
					p2.reset(); 
					game.resetInPlay();
					hand.resetCopy_hands();
					p1.shuffleDeck(); 
					
					p1.shuffleDeck();
					for (int i=0;i<7;i++) {
					p1.addCardToHand(p1.dealCard());	
					}
					for (int i=0;i<7;i++) {
					p2.addCardToHand(p1.dealCard());	
					}
					
					p2.getHand();
					System.out.println("");
					
					System.out.println("The computer is sending cards to the crib...");
					System.out.println("Which cards would you like to send to the crib? (Input a number between 1 and 6, then press enter and repeat)");
					
					p1.decideCribCards();
					cr.addCrib(p1.returnCribCards());
					
					p2.decideCribCards(sc.nextInt()-1, sc.nextInt()-1);
					cr.addCrib(p2.returnCribCards());
					
					//MAKE DUPLICATE HANDS
					hand.make_Chand(p1.copy_hand());
					hand.make_Phand(p2.copy_hand());
					while (round2 == true) {
					
					if (l4 == true)	{
					//player card choice
					if (pt == 0 && p2.amountCards() != 1) {
					for(int x = 3; x >=0; x--) {
					if (game.canPlay(p2.getCard(x))) {
						p2.getHand();
						System.out.println("What card would you like to play?");
						int n = sc.nextInt()-1;
						game.addcard(p2.getCard(n));
						int p_card = p2.play4Card(n);
						game.addCardToGame(p_card);
						peg.addPpoints(game.fifteen_thirtyone() + game.doublecheck());
						game.printInPlay();
						pt = 1;
						l4 = false;
						break;
						}
					}
					}
					}
					
					if (c4 == true)	{
					if (pt == 1 && p1.amountCards() != 1) {
					//computer card choice
					for(int x = 3; x >=0; x--) {
					if (game.canPlay(p1.getCard(x))) {
						game.addcard(p1.getCard(x));
						game.addCardToGame(p1.play4Card(x));
						peg.addCpoints(game.fifteen_thirtyone() + game.doublecheck());
						game.printInPlay();
						pt = 0;
						c4 = false;
						break;
						}
					}
					}
					}
					
					if (l3 == true)	{
					if (pt == 0 && p2.amountCards() != 1) {
					//player card choice
					for(int x = 2; x >=0; x--) {
					if (game.canPlay(p2.getCard(x))) {
						p2.getHand();
						System.out.println("What card would you like to play?");
						int n = sc.nextInt()-1;
						game.addcard(p2.getCard(n));
						int p_card = p2.play3Card(n);
						game.addCardToGame(p_card);
						peg.addPpoints(game.fifteen_thirtyone() + game.doublecheck());
						game.printInPlay();
						pt = 1;
						l3 = false;
						break;
						}
					}
					}
					}
					
					if (c3 == true)	{
					if (pt == 1 && p1.amountCards() != 1) {
					//computer card choice
					for(int x = 2; x >=0; x--) {
					if (game.canPlay(p1.getCard(x))) {
						game.addcard(p1.getCard(x));
						game.addCardToGame(p1.play3Card(x));
						peg.addCpoints(game.fifteen_thirtyone() + game.doublecheck());
						game.printInPlay();
						pt = 0;
						c3 = false;
						break;
						}
					}
					}
					}
					
					if (l2 == true)	{
					if (pt == 0 && p2.amountCards() != 1) {
					//player card choice
					for(int x = 1; x >=0; x--) {
					if (game.canPlay(p2.getCard(x))) {
						p2.getHand();
						System.out.println("What card would you like to play?");
						int n = sc.nextInt()-1;
						game.addcard(p2.getCard(n));
						int p_card = p2.play2Card(n);
						game.addCardToGame(p_card);
						peg.addPpoints(game.fifteen_thirtyone() + game.doublecheck());
						game.printInPlay();
						pt = 1;
						l2 = false;
						break;
						}
					}
					}
					}
					
					if (c2 == true)	{
					if (pt == 1 && p1.amountCards() != 1) {
					//computer card choice
					for(int x = 1; x >=0; x--) {
					if (game.canPlay(p1.getCard(x))) {
						game.addcard(p1.getCard(x));
						game.addCardToGame(p1.play2Card(x));
						peg.addCpoints(game.fifteen_thirtyone() + game.doublecheck());
						game.printInPlay();
						pt = 0;
						c2 = false;
						break;
						}
					}
					}
					}
					
					if (l1 == true)	{
					if (pt == 0 && p2.amountCards() != 1) {
					//player card choice
					for(int x = 0; x >=0; x--) {
					if (game.canPlay(p2.getCard(x))) {
						p2.getHand();
						System.out.println("What card would you like to play?");
						int n = sc.nextInt()-1;
						game.addcard(p2.getCard(n));
						int p_card = p2.play1Card(n);
						game.addCardToGame(p_card);
						peg.addPpoints(game.fifteen_thirtyone() + game.doublecheck());
						game.printInPlay();
						pt = 1;
						l1 = false;
						break;
						}
					}
					}
					}
					
					if (c1 == true)	{
					if (pt == 1 && p1.amountCards() != 1) {
					//computer card choice
					for(int x = 0; x >=0; x--) {
					if (game.canPlay(p1.getCard(x))) {
						game.addcard(p1.getCard(x));
						game.addCardToGame(p1.play1Card(x));
						peg.addCpoints(game.fifteen_thirtyone() + game.doublecheck());
						game.printInPlay();
						pt = 0;
						c1 = false;
						break;
						}
					}
					}
					}
					
					round2 = false;
					
					if(p1.hasCards()==true && p2.hasCards()==true) {
				
						if(p1.amountCards() > p2.amountCards() && counter%2 == 1) {
							System.out.println("Computer must 'GO'");
							System.out.println("You played last card; you get a point");
							peg.addPpoints(1);
							pt = 0;
						}

						if(p1.amountCards() == p2.amountCards() && counter%2 == 1) {
							System.out.println("You must 'GO'");
							System.out.println("Computer played last card; Computer gets a point");
							peg.addCpoints(1);
							pt = 1;
						}
						
						if(p1.amountCards() > p2.amountCards() && counter%2 == 0) {
							System.out.println("Computer must 'GO'");
							System.out.println("You played last card; you get a point");
							peg.addPpoints(1);
							pt = 0;
						}

						if(p1.amountCards() == p2.amountCards() && counter%2 == 0) {
							System.out.println("You must 'GO'");
							System.out.println("Computer played last card; computer gets a point");
							peg.addCpoints(1);
							pt = 1;
						}
						
						System.out.println("Round " + counter + " Complete");
						System.out.println("/*********************************************/");
						System.out.println("Round " + (counter+1) + " Commencing:");
						counter ++;
						game.clearhand();
						round2 = true;
					}
					
					if(p1.hasCards()==false && p2.hasCards()==false && rvar1 == false) {
						
						if(p1.amountCards() > p2.amountCards() && counter%2 == 1) {
							System.out.println("Computer must 'GO'");
							System.out.println("You played last card; you get a point");
							peg.addPpoints(1);
							pt = 0;
							rvar1 = true;
						}

						if(p1.amountCards() == p2.amountCards() && counter%2 == 1) {
							System.out.println("You must 'GO'");
							System.out.println("Computer played last card; Computer gets a point");
							peg.addCpoints(1);
							pt = 1;
							rvar1 = true;
						}
						
						if(p1.amountCards() > p2.amountCards() && counter%2 == 0) {
							System.out.println("Computer must 'GO'");
							System.out.println("You played last card; you get a point");
							peg.addPpoints(1);
							pt = 0;
							rvar1 = true;
						}

						if(p1.amountCards() == p2.amountCards() && counter%2 == 0) {
							System.out.println("You must 'GO'");
							System.out.println("Computer played last card; computer gets a point");
							peg.addCpoints(1);
							pt = 1;
							rvar1 = true;
						}
						
						System.out.println("Round " + counter + " Complete");
						System.out.println("/*********************************************/");
						counter ++;
						game.clearhand();
						round2 = true;
						System.out.println("");
						peg.addCpoints(hand.scoreHand_C());
						peg.addCpoints(hand.scoreHand_P());
						System.out.println("");
						peg.addPpoints(cr.scoreCrib());
						cr.getCrib();
						System.out.println("");
						System.out.println("Player is at peg "+ peg.getPpoints());
						System.out.println("Computer is at peg "+ peg.getCpoints());
						System.out.println("");
						System.out.println("******************************");
						System.out.println("NEW ROUND BEGENING - DEALER IS SWITCHING");
						wd.dealerPlayer(); 
						System.out.println("******************************");
						counter = 1;
					}
					
					if (p1.amountCards() == 1 && p2.amountCards() != 1) {
						System.out.println("/*********************************************/");
						System.out.println("The computer has no cards left - player will play and computer must 'GO'");
						System.out.println("Player gets a point");
						peg.addPpoints(1);
						
						System.out.println("");
						peg.addCpoints(hand.scoreHand_C());
						peg.addCpoints(hand.scoreHand_P());
						System.out.println("");
						peg.addPpoints(cr.scoreCrib());
						cr.getCrib();
						System.out.println("");
						System.out.println("Player is at peg "+ peg.getPpoints());
						System.out.println("Computer is at peg "+ peg.getCpoints());
						System.out.println("");
						System.out.println("******************************");
						System.out.println("NEW ROUND BEGENING - DEALER IS SWITCHING");
						wd.dealerPlayer(); 
						System.out.println("******************************");
						counter = 1;

							}
					
					if(p2.amountCards() == 1 && p1.amountCards() != 1) {
						System.out.println("/*********************************************/");
						System.out.println("You have no cards left - computer plays and you must 'GO'");
						System.out.println("Computer gets a point");
						peg.addCpoints(1);
						
						System.out.println("");
						peg.addCpoints(hand.scoreHand_C());
						peg.addCpoints(hand.scoreHand_P());
						System.out.println("");
						peg.addPpoints(cr.scoreCrib());
						cr.getCrib();
						System.out.println("");
						System.out.println("Player is at peg "+ peg.getPpoints());
						System.out.println("Computer is at peg "+ peg.getCpoints());
						System.out.println("");
						System.out.println("******************************");
						System.out.println("NEW ROUND BEGENING - DEALER IS SWITCHING");
						wd.dealerPlayer(); 
						System.out.println("******************************");
						counter = 1;
							}
					}
				}
				
				
				}
		
		if (peg.getCpoints() >=121 && peg.getPpoints() < 91 ) {
			System.out.println("Player got skunk'd");
		}
		
		if (peg.getPpoints() >=121 && peg.getCpoints() < 91 ) {
			System.out.println("Computer got skunk'd");
		}
		

				}
		}
			
			
			

