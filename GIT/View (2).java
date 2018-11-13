import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;

public class View {
	private int n;
	private JFrame f;
	private ArrayList<JButton> buttonArray;
	
	public View(int n) {
		f = new JFrame("Magic Square");
		buttonArray = new ArrayList<JButton>();
		f.setLayout(new GridLayout(n,n));
		for (int i = 1; i <= n*n; i++) {
			JButton b = new JButton(Integer.toString(i));
			buttonArray.add(b);
			f.add(b);
		}
			
		f.setSize(300, 300);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

		
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public JFrame getF() {
		return f;
	}

	public void setF(JFrame f) {
		this.f = f;
	}

	public ArrayList<JButton> getButtonArray() {
		return buttonArray;
	}

	public void setButtonArray(ArrayList<JButton> buttonArray) {
		this.buttonArray = buttonArray;
	}
}
