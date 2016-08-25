package curso.JOptionPaneExemplos;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class JOptionPaneTeste1 {
	public static void main(String[] args) throws Exception {
		
		// Deixando a iterface das mensagem com padrão do S.O ( Windows / Mac )
		//
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		
		JOptionPane.showMessageDialog(null, "Obrigado, volte sempre!");
	}

}
