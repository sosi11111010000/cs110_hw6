package shapes;

public class Square{


	private int length;
	
	public Square(int len) {
		this.length = len;
	}
	
	public int getArea(){
		return this.length * this.length;
	}


     public static void main(String []args){
        
		Square s = new Square(7);
		System.out.println(s.getArea());    
        
     }
}