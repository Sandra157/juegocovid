
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;


//Con esta clase independiente vamos a poder
//tener el titulo de nuestro juego.

public class PANELTITULO  extends JPanel {
	private final int WIDTH= 600, HEIGHT=700;
	private JLabel LABELTITULO; //esta es la label o etiqueta
	private Image img;
	
	public PANELTITULO() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		img = new ImageIcon("images/images_background.png").getImage();
		
		//LABELTITULO = new JLabel(); //creamos la etiqueta titulo tipo etiqueta
		
		//LABELTITULO.setFont(new Font("Lucida Console", Font.BOLD, 20));
		//hemos establecido el tipo, estilo y tama?o de letra
		
		//LABELTITULO.setText("Consigue la vacuna antes de que el Covid te coja a ti");
		//este va a ser el texto fijado que nos va a aparecer
		
		//add(LABELTITULO); //ya lo tenemos a?adido
	}
	
	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		page.drawImage(img, 0, 0, null);
	}

}
