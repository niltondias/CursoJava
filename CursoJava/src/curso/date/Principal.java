package curso.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		new Principal();
	}
	
	public Principal() {
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println("Informe a data do ultimo periodo menstrual: ( dd/mm/aaaa)");
			String ultimoPeriodoMenstrual = entrada.nextLine();
			Date dataUltimoPeriodoMenstrual = this.converteEmData(ultimoPeriodoMenstrual);
			CalculadoraGravidez calculadora = new CalculadoraGravidez(dataUltimoPeriodoMenstrual);
			
			Date dataEstimadaConcepcao = calculadora.calcularDataEstimadaConcepcao();
			System.out.println("Data estimada da concepcao: " + 
					this.formataData(dataEstimadaConcepcao));
			
			Date dataEstimadaParto = calculadora.calculaDataEstimadaParto();
			System.out.println("Data estimada do parto: " + 
					this.formataData(dataEstimadaParto));
			
		} catch( ParseException pe) {
			System.out.println("Informe a data no formato dd/mm/aaaa");
		} finally {
			entrada.close();
		}
	}
	
	public Date converteEmData( String texto ) throws ParseException {
		DateFormat formata = new SimpleDateFormat("dd/MM/yyyy");
		Date data = formata.parse(texto);
		return data;
	}
	
	public String formataData( Date data ) {
		DateFormat formata = new SimpleDateFormat("dd/MM/yyyy");
		return formata.format(data);
	}
	
	


}
