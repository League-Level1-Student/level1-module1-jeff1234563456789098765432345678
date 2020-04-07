package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker { 
public static void main(String[] args) {
	
	Microwave m = new Microwave();
	
	String cookTimeInMinutes = JOptionPane.showInputDialog("How many minutes should the popcorn be cooked for?");
	int i = Integer.parseInt(cookTimeInMinutes);
	m.setTime(i);
	String flavor = JOptionPane.showInputDialog("What flavor popcorn do you want?");
	Popcorn corn= new Popcorn(flavor);
	m.putInMicrowave(corn);
	corn.eat();
	
}


}



