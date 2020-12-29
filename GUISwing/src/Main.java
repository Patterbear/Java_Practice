import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		
		ImageIcon image = new ImageIcon("src/building.JPG"); //Creates ImageIcon object
		Border border = BorderFactory.createLineBorder(Color.green, 3); //Creates Border object
		
		JLabel label = new JLabel(); //Creates a JLabel object
		label.setText("The Fielding Johnson Building"); //Sets text of label
		label.setIcon(image); //Adds image to label
		label.setHorizontalTextPosition(JLabel.CENTER); //Sets horizontal position of text (LEFT/CENTER/RIGHT)
		label.setVerticalTextPosition(JLabel.TOP); //Sets vertical position of text (TOP/BOTTOM/CENTER)
		label.setForeground(Color.GREEN); //Sets colour of text
		label.setFont(new Font("Segoe UI", Font.PLAIN, 20)); //Sets font of text
		label.setIconTextGap(12); //Sets distance between text and image
		label.setBackground(Color.BLACK); //Set background colour
		label.setOpaque(true); //Display background colour
		label.setBorder(border); //Sets label border
		label.setVerticalAlignment(JLabel.CENTER); //Sets vertical alignment of label
		label.setHorizontalAlignment(JLabel.CENTER); //Sets horizontal alignment of label
		//label.setBounds(100, 100, 350, 350); //Sets x and y position of label in frame as well as its dimensions
		
		JFrame frame = new JFrame(); //Creates a frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Sets close operation to kill the window
		frame.setSize(500, 500); //Sets x and y dimension of frame
		//frame.setLayout(null); //Sets layout manager to 'null'
		frame.setVisible(true); //Makes frame visible
		frame.add(label); //Adds label to frame
		frame.pack(); //Resizes frame to accomodate all elements within it (must be done after all elements added)
	}

}
