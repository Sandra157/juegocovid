
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PANELESCENARIO extends JPanel{
	
	//EN ESTA CLASE ES DONDE VAMOS A CREAR EL ESCENARIO DE NUESTRO JUEGO:
		//FONDO
		//COVIDS
		//VACUNA
		//PERSONAJE
		//ESCALERAS
	
	//Vamos a definir los parametros y atributos del escenario
	
	private int NCOVID; //numero de bichitos Covid
	private final int WIDTH= 600, HEIGHT=700; //son las dimensiones del escenario
	private ImageIcon IMAGEN;
	private ImageIcon[] VECTOR_COVID; 
	private int[] POS_X;
	private int[] POS_Y;
	private Dimension AJUSTE;
	
	
	public PANELESCENARIO() {
		
		IMAGEN = new ImageIcon("images_background.png");
		//as? tenemos la imagen que utilizamos como fondo del escenario
		
		NCOVID = 1; //numero inicial de bichitos Covid
		
		VECTOR_COVID = new ImageIcon[3]; 
		//hemos creado un vector de imagenes para los 3 bichos Covid que vamos a tener que incluir
		POS_X= new int[3]; //para almacenar la coordenada X de los 3 bichos Covid
		POS_Y = new int[3]; //para almacenar la coordenada Y de los 3 bichos Covid
		
		
		//Vamos a situar el primero de los bichillos Covid
		
		VECTOR_COVID[0] = new ImageIcon("images_covid.png"); 
		//tenemos el primer bichito Covid en el vector de imagenes
		POS_X[0]= 400; //coordenada X del primer bicho Covid
		POS_Y[0]= 100; //coordenada Y del primer bicho Covid
		
		//vamos a a?adir el tama?o del panel preferido
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
				
	}
	
	//Ahora vamos a escribir la rutina para a?adir los otros bichitos Covid
	
	public void A?ADIRBICHITOS(int b) {
	NCOVID = b;
	
	if(b <3) {
		for(int i=1; i < NCOVID; i++) {
		 VECTOR_COVID[i] = new ImageIcon("images_covid.png"); 
		 //esta es la imagen del bichito Covid
		 
		 POS_X[i] = 400;
		 POS_Y[i] = 100*i;
		 
		 repaint();
		}
		}
	else {
		System.out.println("Demasiada concentracion Covid");
	}
	}

	//Ahora vamos a escribir el metodo para pintar el escenario
	
	public void paintComponent(Graphics page) {
	
		super.paintComponent(page);
		AJUSTE =getSize();
		
		page.drawImage(IMAGEN.getImage(), 0, 0, AJUSTE.width, AJUSTE.height, null);
		
		setOpaque(true);
		
		for(int i=0; i<NCOVID; i++) {
		
			VECTOR_COVID[0].paintIcon(this, page, POS_X[i], POS_Y[i]);
		}
		
	}
	}
