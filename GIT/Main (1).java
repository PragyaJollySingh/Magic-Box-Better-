import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter your number");
		int n = Integer.parseInt(input);
		
		View v = new View(n);
		Model m = new Model(n);
		Controller c = new Controller(m,v,n);
	}
	
}
