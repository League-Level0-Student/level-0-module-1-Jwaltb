import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle=JOptionPane.showInputDialog("What Disney/Pixar movie will Rick Astley never let you borrow?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(riddle.equalsIgnoreCase("Up")) {
JOptionPane.showMessageDialog(null, "Correct!");
	score++;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {JOptionPane.showMessageDialog(null, "Wrong");
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your scorfe is " +score);
	}
}}

