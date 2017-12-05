import javax.swing.JOptionPane;


public class UnBirthday {
	public static void main(String[] args) {
		
	
	String input=JOptionPane.showInputDialog("What is your birthday? (mm/dd)");
	if(input.equals("12/04")) {
	JOptionPane.showMessageDialog(null, "Happy Birthday!");
	}else {
		JOptionPane.showMessageDialog(null, "Have a very merry Unbirthday");
}}}
