import java.util.Scanner }
class Rectangle;
int length;
int breadth;
int area; 
int perimeter;
void input ();
Scanner in = new Scanner;
System.out.println("enter calculate the perimeter of a rectangle");
length = in.nextint ();
System.out.println("enter the breadth of a rectangle");
breadth = in.nextint ();
void calculate ()  {
	area = (length * breadth);
	perimeter = 2 * (length + breadth);
}
void display () {
	System.out.println("Area of a rectangle = + area");
	System.out.println("Perimeter of a rectangle = + perimeter");
}


}
public class Gec202 {

	public static void main(String[] args) {
Rectangle obj = new rectangle ();
obj.input ();
obj.calculate ();
obj.display ();

	}

}
