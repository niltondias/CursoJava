package curso.JOptionPaneExemplos;

import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class JOptionPaneTeste2 {
	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		
		JOptionPane.showMessageDialog(null, "Seu cadastro foi efetuado com sucesso!");
		
		JOptionPane.showMessageDialog(null, "Não foi possível acessar o recurso!", "Erro",
								JOptionPane.ERROR_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Senha inválida!", "Atenção", 
								JOptionPane.WARNING_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Obrigado", "Obrigado",
								JOptionPane.PLAIN_MESSAGE);
		
		URL url = JOptionPaneTeste2.class.getResource("algaworks.png");
		
		Icon icone = new ImageIcon(url);
		
		JOptionPane.showMessageDialog(null, "Obrigado volte sempre!", "Até logo", 
								JOptionPane.INFORMATION_MESSAGE, icone);
		
		
		
	}

}
