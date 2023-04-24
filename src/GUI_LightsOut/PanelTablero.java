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
	
	private Tablero tablero;
    private JButton[][] botones;
    private static int tamano;

    public PanelTablero() {
        tablero = new Tablero(tamano);
        botones = new JButton[tamano][tamano];
        
        setLayout(new GridLayout(tamano, tamano));
        
        for (int row = 0; row < tamano; row++) {
            for (int col = 0; col < tamano; col++) {
                JButton boton = new JButton();
                boton.setBackground(tablero.darTablero()[row][col] ? Color.YELLOW : Color.GRAY);
                botones[row][col] = boton;
                add(boton);
            }
        }
    }
	
	public static void setTamano(int nuevoTamano) 
	{
	    tamano = nuevoTamano;
	    
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
