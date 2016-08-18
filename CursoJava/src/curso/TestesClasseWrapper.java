package curso;

public class TestesClasseWrapper {
	public static void main(String[] args) {
		int x = 10;
		String y = "";
		
		y = Integer.toString(x);
		
		y = "Valor de y ===>" + y;
		System.out.println(y);
		
		double s = new Double(x);
		
		s += 0.25;
		
		System.out.println("Float: " + s );
		
		Character a = new Character('A');
		
		char b = Character.toLowerCase( a.charValue() );
		
		System.out.println( "Valor de b: " + b );
		
	}

}
