
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import java.awt.Component;
import java.awt.Dimension;

public class MAIN {
	
	//vamos a crear el metodo main con un JFrame y vamos a ir aplicando
	//los diferentes metodos JFrame
	
	public static void main (String[] args) throws Exception {
	
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("VIDEOJUEGO COVID DE SANDRA MARTINEZ DELGADO");
		//este va a ser el nombre que se va a mostrar del JFrame en ejecucion
		frame.setVisible(true);
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		
		//creo los diferentes paneles
		PANELESCENARIO PANELESCENARIO = new PANELESCENARIO();
		PANELTITULO PANELTITULO = new PANELTITULO();
		
		//PANELESCENARIO.setPanel();
		
		//a�ado los diferentes frames 
		frame.add(PANELTITULO);
		//frame.add(PANELESCENARIO);
		
		frame.pack();
		
	
	}
	}

