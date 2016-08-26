package curso.JOptionPaneExemplos;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class JOptionPaneTeste3 {
	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
	
		Object[] opcoes = {"Sim", "Não", "Talvez"};
		
		int opcao = JOptionPane.showOptionDialog(null, "Quer mandar um e-mail agora?", "Confirmação", 
					JOptionPane.YES_NO_CANCEL_OPTION, 
					JOptionPane.QUESTION_MESSAGE,
					null, opcoes, opcoes[0]);
		
		switch (opcao) {
		case 0:
			JOptionPane.showMessageDialog(null, "Voce respondeu SIM!");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "Voce respondeu NÃO!");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Voce respondeu TALVEZ!");
			break;
	
		default:
			break;
		}
		
		Object[] possibleValues = { "First", "Second", "Third" };
		
		Object selectedValue = JOptionPane.showInputDialog(null, "Escolha um", "Informação", 
				JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
		
		JOptionPane.showMessageDialog(null, (String) selectedValue, 
				 "Informação", JOptionPane.PLAIN_MESSAGE);
		
	}
}
