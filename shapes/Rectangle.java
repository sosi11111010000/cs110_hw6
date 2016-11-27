package shapes;

public class Rectangle {

public int width;
public int height;

public Rectangle(int w, int h){
	this.width= w;
	this.height= h;
}

public int getArea(){
	return this.width *  this.height;
}

public static void main(String[] args){
	Rectangle r = new Rectangle(5,7);
	System.out.println(r.getArea());
}

}