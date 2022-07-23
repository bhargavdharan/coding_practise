class RectangleShape 
{
	   int length, breadth; 
	   void setValue(int l, int b) 
	   { 
	       length = l; 
	       breadth = b; 
	   }
	   // get area of rectangle
	   int findArea() 
	   { 
	       return (length * breadth); 
	   }
}
class RectangleAreaDemo
{
	   public static void main(String[] args)
	   {
	      RectangleShape obj = new RectangleShape(); 
	      obj.setValue(10, 5); 
	      System.out.println("Area of rectangle: " + obj.findArea());
	   }
}
