package GUI_LightsOut;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import uniandes.dpoo.taller4.modelo.Tablero;

public class PanelTablero extends JPanel implements ActionListener {
	
	public static void main(String[] args) 
	{
		PanelTablero pTablero = new PanelTablero();
		pTablero.setVisible(true);					

	}
	
	//atributos del tablero
	private Tablero tablero;
	private JButton[][] botones;
	private JPanel panelTablero;
	private JLabel labelJugadas;
	
	public void interfaz(int tamanoTablero) 
	
	{
		super ("Tablero");
		tablero = new Tablero(tamanoTablero);
		botones = new JButton[tamanoTablero][tamanoTablero];
		panelTablero = new JPanel(new GridLayout(tamanoTablero,tamanoTablero));
		crearBotones();
        crearPanelTablero();
        setVisible(true);
    }
	
	private void crearBotones() {
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                botones[i][j] = new JButton();
                botones[i][j].setBackground(Color.WHITE);            }
        }
    }
	
	private void crearPanelTablero() {
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                panelTablero.add(botones[i][j]);
            }
        }
    }
		
	}
 
}
