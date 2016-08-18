package curso.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalculadoraGravidez {
	private Date dataUltimoPeriodoMenstrual;
	
	public CalculadoraGravidez(Date dataUltimoPeriodoMenstrual ) {
		this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;

	}
	
	public Calendar converteDateParaCalendar( Date data ) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(data);
		return calendar;
	}
	
	public Date calcularDataEstimadaConcepcao() {
		// implementa calculo de data estimada da concepcao
		// 2 semanas apos a data do ultimo periodo menstrual
		
		Date data = new Date();
		
		Calendar calendar = this.converteDateParaCalendar(dataUltimoPeriodoMenstrual);
		
		calendar.set(Calendar.WEEK_OF_MONTH, 2 );
		
		data = calendar.getTime();
		
		return data;
	}
	
	public Date calculaDataEstimadaParto() {
		// implementa o calculo da data estimada do parto
		// 40 semanas apos a data do ultimo periodo menstrual
		
		Calendar calendar = this.converteDateParaCalendar(dataUltimoPeriodoMenstrual);
		calendar.set(Calendar.WEEK_OF_MONTH, 40);
		Date data = calendar.getTime();
		return data;
	}
	
}
