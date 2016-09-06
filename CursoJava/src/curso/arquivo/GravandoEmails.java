package curso.arquivo;

//import java.io.BufferedWriter;
//import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class GravandoEmails {
	public static void main(String[] args) {
		
		String[] emails = {"joel2@email.com", "lucia2@email.com", "marcilia2@email.com"};
		
		//try ( BufferedWriter writer = new BufferedWriter( new FileWriter("emails.txt")) ) {
		try ( PrintStream writer = new PrintStream("emails2.txt") ) {
			for( String email : emails ) {
				// writer.write(email);
				//writer.newLine();
				writer.println(email);
			}
		} catch (IOException e) { 
			System.err.println("Não foi possivel gravar o arquivo "  + e.getMessage());
		}
	}

}
