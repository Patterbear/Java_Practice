import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Main {

	public static void main(String[] args) {
		
		ImageIcon icon = new ImageIcon("flag.png"); //ImageIcon object created
		
		JLabel label = new JLabel(); //Creates JLabel object
		label.setText("Label Text"); //Sets label text
		label.setIcon(icon); //Sets the icon of the label
		//label.setVerticalAlignment(JLabel.BOTTOM); //Sets vertical alignment of label
		//label.setHorizontalAlignment(JLabel.RIGHT); //Sets vertical alignment of label
		label.setBounds(100, 100, 75, 75); //Sets dimensions and coordinates of label
		
		JPanel redPanel = new JPanel(); //Creates JPanel object
		redPanel.setBackground(Color.RED); //Sets background colour of panel
		redPanel.setBounds(0, 0, 250, 250); //Sets panel dimensions and coordinates
		redPanel.setLayout(null); //Sets layout manager to a new BorderLayout object
		
		JPanel bluePanel = new JPanel(); //Creates JPanel object
		bluePanel.setBackground(Color.BLUE); //Sets background colour of panel
		bluePanel.setBounds(250, 0, 250, 250); //Sets panel dimensions and coordinates
		bluePanel.setLayout(null); //Sets layout manager to a new BorderLayout object
		
		JPanel greenPanel = new JPanel(); //Creates JPanel object
		greenPanel.setBackground(Color.GREEN); //Sets background colour of panel
		greenPanel.setBounds(0, 250, 500, 250); //Sets panel dimensions and coordinates
		greenPanel.setLayout(null); //Sets layout manager to a new BorderLayout object
		
		JFrame frame = new JFrame(); //Creates JFrame object
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Sets close operation
		frame.setLayout(null); //Sets layout manager to 'null'
		frame.setSize(750, 750); //Sets dimensions of frame
		frame.setVisible(true); //Makes frame visible
		greenPanel.add(label); //Adds label to panel
		frame.add(redPanel); //Adds panel to frame
		frame.add(bluePanel); //Adds panel to frame
		frame.add(greenPanel);  //Adds panel to frame
		
	}

}
