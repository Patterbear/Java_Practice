import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyFrame() {
		
		this.setTitle("JFrame Title"); //Sets title of this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Sets close operation to kill the window
		this.setResizable(false); //Fixes size of window
		this.setSize(420, 420); //Sets x and y dimension of this
		this.setVisible(true); //Makes this visible
		
		ImageIcon image = new ImageIcon("src/logo.png"); //Creates ImageIcon object
		this.setIconImage(image.getImage()); //Sets this's icon
		this.getContentPane().setBackground(Color.lightGray); //Changes colour of background

	}
}
