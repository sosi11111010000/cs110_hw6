import shapes.Square;
import shapes.Rectangle;
import utils.Math;
public class Driver {
	
	public static void main(String[] args){
		Square sq = new Square(100);
		System.out.println(sq.getArea());
		
		Rectangle re = new Rectangle(50,80);
		System.out.println(re.getArea());
		
		double n = 15.6;
		System.out.println(Math.factorial((int)n));
		System.out.println(Math.factorialLoop((int)n));
	
	}
}