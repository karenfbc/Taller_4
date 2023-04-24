package GUI_LightsOut;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelEditarTablero extends JPanel {
	
	//ATRIBUTOS

	public PanelEditarTablero() {
		JPanel panelSettings = new JPanel(new GridLayout(1,3)); 
		
		JLabel tamanoLabel = new JLabel("Tamaño:");
		panelSettings.add(tamanoLabel);
		
		String tamanoOpciones[]={"5x5","6x6","7x7"};   
		JComboBox cb = new JComboBox(tamanoOpciones);
		panelSettings.add(cb);
		
		JPanel dificultadPanel = new JPanel(new BorderLayout());
		JLabel dificultadLabel = new JLabel("Dificultad:");
		dificultadPanel.add(dificultadLabel, BorderLayout.WEST);
		
		JPanel radioButtonsPanel = new JPanel();
		JRadioButton facilRadioButton = new JRadioButton("Fácil");
		JRadioButton medioRadioButton = new JRadioButton("Medio");
		JRadioButton dificilRadioButton = new JRadioButton("Difícil");
		radioButtonsPanel.add(facilRadioButton);
		radioButtonsPanel.add(medioRadioButton);
		radioButtonsPanel.add(dificilRadioButton);
		
		dificultadPanel.add(radioButtonsPanel, BorderLayout.CENTER);
		
		panelSettings.add(dificultadPanel);
		
		add(panelSettings, BorderLayout.NORTH);
	}
	
}