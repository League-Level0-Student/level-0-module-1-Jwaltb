//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
String mattspower="talking with cats";
String MaClarynspower="flying";
String nolanspower="fat manipulation";
String daelynspower="turning into a fox";
String jensenspower="crustacean mimicry";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String name=JOptionPane.showInputDialog("Enter Name");
	if(name.equalsIgnoreCase("Matt")){
		JOptionPane.showMessageDialog(null, "Matt's super powers is " + mattspower);
	}
	else if(name.equalsIgnoreCase("MaClaryn")){
		JOptionPane.showMessageDialog(null, "MaClaryn's super power is " + MaClarynspower);
	}
	else if(name.equalsIgnoreCase("Nolan")){
		JOptionPane.showMessageDialog(null, "Nolan's super power is " + nolanspower);
	}
	else if(name.equalsIgnoreCase("daelyn")) { 
		JOptionPane.showMessageDialog(null, "Daelyn's super powers is " + daelynspower);
	}
	else if(name.equalsIgnoreCase("jensen")) {
		JOptionPane.showMessageDialog(null, "Jensen's super power is " + jensenspower);
	}
		// 3. Show the superpower in a pop-up, depending on the name entered. 
	else {
		JOptionPane.showMessageDialog(null, "You don't have a super power");
	}
	}
}

