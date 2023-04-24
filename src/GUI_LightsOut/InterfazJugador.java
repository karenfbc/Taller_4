package GUI_LightsOut;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.formdev.flatlaf.FlatLightLaf;

import uniandes.dpoo.taller4.modelo.Tablero;

//Esta es la ventana principal de la aplicaci�n.

public class InterfazJugador extends JFrame {
	
	// -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
	
	private Tablero tablero;
	
	private PanelTablero panelTablero;
	
	private PanelOpciones panelOpciones;
	
	private PanelEditarTablero panelEditarTablero;
	
	private PanelRegistro panelRegistro;
	
	private int tamano;
	
	// -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------


	public InterfazJugador() 
	{
		tablero = new Tablero(tamano);
		inicializarVentana( );
				
	}
	
	// -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------
	
	private void inicializarVentana() 
	{
		
		//declarar tama�o
		PanelTablero.setTamano(5);
		
		// Construir los paneles
		this.panelOpciones = new PanelOpciones(this);
		this.panelEditarTablero = new PanelEditarTablero();
		this.panelRegistro = new PanelRegistro();
		this.panelTablero = new PanelTablero();
		

		
		JPanel panelPrincipal = new JPanel(new BorderLayout());
		panelPrincipal.add(panelOpciones, BorderLayout.EAST);
		panelPrincipal.add(panelEditarTablero, BorderLayout.NORTH);
		panelPrincipal.add(panelRegistro, BorderLayout.SOUTH);
		panelPrincipal.add(panelTablero,BorderLayout.WEST);
		
		
		add(panelPrincipal);
		
		setTitle("Lights Out Game");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(900,600);
		
		
	}

	
	// -----------------------------------------------------------------
    // Main
    // -----------------------------------------------------------------
	
	public static void main( String[] args )
	    {
	
		FlatLightLaf.install();
	    InterfazJugador interfaz = new InterfazJugador( );
	    interfaz.setVisible( true );
	        
	    }

}
