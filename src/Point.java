/*	8/07/188
 *  Quadrant class assignment
 *  Hannah Kelly
 */

public class Point {

//making them private to show encapsulation- 
	//The whole idea behind encapsulation is to hide the implementation details from users.
		private int x;
		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		private int y;

//Constructor
		Point ( int x, int y){
			this.x = x;
			this.y = y; 
}
//***********************************88
		public void shift(){
			++this.x;
			--this.y;
			
			
		}
//Instance Methods

			public String Quadrant() {
				String quad;
				if (x > 0 && y >  0) {
					quad = "is in quadrant 1";
}
				else if (x < 0 && y >  0){
					quad = "is in quadrant 2";
}
				else if (x < 0 && y <  0) {
					quad = "is in quadrant 3";
}
				else if (x > 0 && y <  0) {
					quad = "is in quadrant 4";
}
				else {
					quad = "This is the origin.";
}
				return "(" + (x) +"," + (y) + ")" + " : " + quad;

}	//(this.x - another.x)) + (this.y - another.y)

			//public double Distance(Point another) {
				//double dist;
				//dist = Math.sqrt(Math.pow)
				//return dist;


			public void Shift() {
					//Point. shift(x);
}

}

