import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {
		
		JButton button; //Declares 'button' object as a global variable
		JLabel label; //Declares 'label' object as a global variable
		int buttonPressed = 0; //Declares 'buttonPressed' variable as a global variable with value '0'
	
		MyFrame() { //Constructor method
			
			ImageIcon icon = new ImageIcon("flag.png"); //Creates ImageIcon object
			ImageIcon icon2 = new ImageIcon("flag2.png"); //Creates ImageIcon object
			
			label = new JLabel(); //Creates JLabel object
			label.setIcon(icon2); //Sets label icon
			label.setBounds(150, 250, 150, 150); //Sets dimensions and coordinates of label
			label.setVisible(false); //Sets label visibility to 'false'
			
			button = new JButton(); //Creates JButton object
			button.setBounds(100, 100, 250, 100); //Sets dimensions and coordinates of button
			button.addActionListener(this); //Adds ActionListener to button
			//button.addActionListener(e -> System.out.println("Button Pressed.")); //Assigning button function using lambda
			button.setText("Button"); //Sets text on button
			button.setFocusable(false); //Removes text outline
			button.setIcon(icon); //Sets button icon
			button.setHorizontalTextPosition(JButton.CENTER); //Sets horizontal text position
			button.setVerticalTextPosition(JButton.BOTTOM); //Sets vertical text position
			button.setFont(new Font("Segoe UI", Font.BOLD, 25)); //Sets font of button text
			button.setIconTextGap(-5); //Sets size of gap between icon and text
			button.setForeground(Color.GRAY); //Selects colour of text
			button.setBackground(Color.WHITE); //Sets colour of button
			button.setBorder(BorderFactory.createEtchedBorder()); //Sets button border
			//button.setEnabled(false); //Disables button
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Sets default close operation
			this.setLayout(null); //Sets layout manager to 'null'
			this.setSize(500, 500); //Sets dimensions of frame
			this.setVisible(true); //Sets visibility to 'true'
			this.add(button); //Adds button to frame
			this.add(label); //Adds label to frame
			
		}
		
		@Override //Override decorator
		public void actionPerformed(ActionEvent e) { //Method to assign button function
			if(e.getSource()==button) { //If button is pressed the below code executes
				//System.out.println("Button pressed."); //Text outputted to console
				//button.setEnabled(false); //Disables button
				if(buttonPressed % 2 ==0) {
					label.setVisible(true); //Makes label visible
				} else {
					label.setVisible(false); //Makes label invisible
				}
				
				buttonPressed++; //Increases integer variable by 1
				
			}
		}
}
