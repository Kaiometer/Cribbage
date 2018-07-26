
public class Pegs {

	int c_points = 0;
	int p_points = 0;
	
	public void addCpoints(int x) {
	c_points += x;
	}
	
	public void addPpoints(int x) {
	p_points += x;
	}
	
	public int getCpoints() {
	
		if (c_points >= 121) {
			System.out.println("COMPUTER WINS!");
		}
		
	return c_points;
	}
	
	public int getPpoints() {
		
		if (p_points >= 121) {
			System.out.println("PLAYER WINS!");
		}
	return p_points;
	}
	
}
