package GUI_LightsOut;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import uniandes.dpoo.taller4.modelo.Tablero;


/**
 * Esta es la clase donde está definido el menú de la aplicación
 */

public class PanelOpciones extends JPanel implements ActionListener {
	
	private static final String NUEVO_JUEGO = "NUEVO";
	 
	private static final String REINICIAR = "REINICIAR";
	 
	private static final String TOP_JUEGO = "TOP-10";
	 
	private static final String CAMBIAR_JUGADOR = "CAMBIAR JUGADOR";
	 
	//ATRIBUTOS
	 
	private InterfazJugador principal;
	 
	private JButton botonNuevoJuego;

	private JButton botonReiniciar;

	private JButton botonTopJuego;

	private JButton botonCambiarJugador;
    
    public PanelOpciones( InterfazJugador ventanaPrincipal )
    {
        principal = ventanaPrincipal;
        
        Color azulClaro = new Color(72, 156, 225);

        setLayout(new BorderLayout());

		JPanel panelBotones = new JPanel(new GridLayout(4, 1));

		botonNuevoJuego = new JButton("Nuevo Juego");
		botonNuevoJuego.setActionCommand(NUEVO_JUEGO);
		botonNuevoJuego.addActionListener(this);
		botonNuevoJuego.setBackground(azulClaro);
		botonNuevoJuego.setBorderPainted(false);
		botonNuevoJuego.setOpaque(true);
		botonNuevoJuego.setForeground(Color.WHITE);
		panelBotones.add(botonNuevoJuego);

		botonReiniciar = new JButton("Reiniciar");
		botonReiniciar.setActionCommand(REINICIAR);
		botonReiniciar.addActionListener(this);
		botonReiniciar.setBackground(azulClaro);
		botonReiniciar.setBorderPainted(false);
		botonReiniciar.setOpaque(true);
		botonReiniciar.setForeground(Color.WHITE);
		panelBotones.add(botonReiniciar);

		botonTopJuego = new JButton("TOP-10");
		botonTopJuego.setActionCommand(TOP_JUEGO);
		botonTopJuego.addActionListener(this);
		botonTopJuego.setBackground(azulClaro);
		botonTopJuego.setBorderPainted(false);
		botonTopJuego.setOpaque(true);
		botonTopJuego.setForeground(Color.WHITE);
		panelBotones.add(botonTopJuego);

		botonCambiarJugador = new JButton("Cambiar Jugador");
		botonCambiarJugador.setActionCommand(CAMBIAR_JUGADOR);
		botonCambiarJugador.addActionListener(this);
		botonCambiarJugador.setBackground(azulClaro);
		botonCambiarJugador.setBorderPainted(false);
		botonCambiarJugador.setOpaque(true);
		botonCambiarJugador.setForeground(Color.WHITE);
		panelBotones.add(botonCambiarJugador);
		
		add(panelBotones, BorderLayout.EAST);
		panelBotones.setBackground(Color.WHITE);
		panelBotones.setOpaque(true);
	}
    
    
    public void actionPerformed(ActionEvent evento) {
		String comando = evento.getActionCommand();

		if (NUEVO_JUEGO.equals(comando)) 
		{
			// TODO poner dificultad
			principal.desordenar();
		} 
		else if (REINICIAR.equals(comando)) 
		{
			principal.reiniciar();
		} 
		else if (TOP_JUEGO.equals(comando)) 
		{
			// TODO crear funcion topjugadores
			principal.mostrarTopJugadores();
		} 
		else if (CAMBIAR_JUGADOR.equals(comando)) 
		{
			// TODO
		}
	}

}
