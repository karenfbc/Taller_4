package GUI_LightsOut;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelRegistro extends JPanel {
	
	// ATRIBUTOS
	
		private int contadorJugadas;
		private JTextField jugadorTextField;
		private JLabel contadorLabel;

	public PanelRegistro() {
		
	super(new BorderLayout());
			
			contadorJugadas = 0;
			
			JPanel panelJugadas = new JPanel(new GridLayout(1, 2));
			
			// contador
			JPanel contadorPanel = new JPanel(new GridLayout(1, 2));
			
			JLabel jugadasLabel = new JLabel("Jugadas:");
			contadorLabel = new JLabel(Integer.toString(contadorJugadas));
			
			contadorPanel.add(jugadasLabel);
			contadorPanel.add(contadorLabel);
			
			panelJugadas.add(contadorPanel);
			
			// jugador
			JPanel jugadorPanel = new JPanel(new BorderLayout());
			
			JLabel jugadorLabel = new JLabel("Jugador:");
			jugadorTextField = new JTextField(10);
			
			jugadorPanel.add(jugadorLabel, BorderLayout.WEST);
			jugadorPanel.add(jugadorTextField, BorderLayout.CENTER);
			
			panelJugadas.add(jugadorPanel);
			
			add(panelJugadas, BorderLayout.SOUTH);
	}
	
	// MÉTODOS
	
	public void incrementarContadorJugadas() {
		contadorJugadas++;
		contadorLabel.setText(Integer.toString(contadorJugadas));
	}
	
	public void setJugador(String jugador) {
		jugadorTextField.setText(jugador);
	}
	
	public String getJugador() {
		return jugadorTextField.getText();
	}
}