package _07_binary_converter;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Binary_Converter implements ActionListener {
	
		
	JButton button = new JButton();
	JTextField answer = new JTextField(20);
	JLabel label = new JLabel();
void run() {	
	
JFrame frame = new JFrame();
JPanel panel = new JPanel();
new JPanel();
frame.add(panel);
frame.setTitle("Convert 8 bits of binary to ASCIII");
frame.setVisible(true);
panel.add(button);
panel.add(label);
panel.add(answer);
frame.pack();
button.setText("Convert");



button.addActionListener( this);
}
String convert(String input) {
    if(input.length() != 8){
    	
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	JButton buttonClicked = (JButton) e.getSource();
	if(buttonClicked== button) {
	String awnser = answer.getText();
	String aweserf = convert(awnser);
	label.setText(aweserf);
	}
	
	
}



	}

