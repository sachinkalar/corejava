package com.rays.withoutconstuctor;

public class TestShape { 
	public static void main(String[] args) {
//		
//		Shape s =new Triangle();
//		
//	    Triangle t = (Triangle) s;
//		
//		t.setBase(12);
//		t.setheigth(10);
//		
//	    System.out.println(t.getBase());
//	   System.out.println(t.getHeigth());
//		s.area();
		
	//	Shape st =new Rectangle();
	//	Rectangle r = (Rectangle) st;
	//	
	//	r.setLength(10);
	//	r.setWidth(12);
		
	//	System.out.println(r.getLength());
	//	System.out.println(r.getWidth());
	//	st.area();
		
	//	Shape ss = new Circle();
	//	 Circle c = (Circle) ss;
		 
	//	 c.setRadius(2);
	//	ss.area();
		
		
	Shape [] s = new Shape[3];

	
	s[0]= new Rectangle();
	s[1]= new Circle();
	s[0].setBorderWidth(1);
	s[1].setColour("red");
	
	
	for(int i=0;i<s.length;i++) {
		
		//s[i].area();
		
		System.out.println(s[i].getColour());
	}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		 
	}

	private static Shape triangle() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Shape Circle() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Shape Rectangle() {
		// TODO Auto-generated method stub
		return null;
	}

}
