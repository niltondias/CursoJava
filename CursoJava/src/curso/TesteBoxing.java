package curso;

public class TesteBoxing {
	public static void main(String[] args) {
		int x = 127;
		int y = 127;
		
		Integer a = 128;
		Integer b = 128;
		
		System.out.println( "X == Y: " + ( x == y ) );
		System.out.println( "A == B: " + ( a.equals(b) ) );
	}

}
