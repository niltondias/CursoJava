package curso.string;


public class ExemplosClasseString3 {

	public static void main(String[] args) {
		String s = "Cursos online";
		
		System.out.println(s.length());
	
		System.out.println(s.charAt(12));

		System.out.println(s);
		
		for( int x = 0; x <= s.length(); x++ ) {
			 if(x == 0 || (x % 2 ) == 0 ) {
				 System.out.println("Conteudo da s: " + s.substring(x,x+1).toUpperCase() + " " + x );
			 }
		}
		
	}
	
}