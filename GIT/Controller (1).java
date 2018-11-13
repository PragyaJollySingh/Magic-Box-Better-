import javax.swing.*;

public class Controller {
	private int n;
	public int getN() {
		return n;
	}


	public void setN(int n) {
		this.n = n;
	}

	private View view;
	private Model model;
	private JButton firstPressed;

	public JButton getFirstPressed() {
		return firstPressed;
	}


	public void setFirstPressed(JButton firstPressed) {
		this.firstPressed = firstPressed;
	}


	public Controller(Model m,View v, int size) {
		view = v;
		model = m;
		n = size;
		initController();
		initModel();
	}
	
	
	private void initController() {
		for (JButton b: view.getButtonArray())
			b.addActionListener(e -> buttonPressed((JButton)e.getSource()));	
	}
	
	private void initModel() {
		updateModelArray();
	}
	
	public void buttonPressed(JButton button) {
		if (firstPressed == null)
			firstPressed = button;
		else {
			String numSave = firstPressed.getText();
			firstPressed.setText(button.getText());
			button.setText(numSave);
			firstPressed = null;
			updateModelArray();
			if(model.checkForWin())
				endGame();
		}
	}
	
	private void updateModelArray() {
		int i = 0;
		int j = 0;
		for (JButton b: view.getButtonArray()) {
			model.getNumArray()[i][j] = Integer.parseInt(b.getText());
			i++;
			if (i == n) {
				i = 0;
				j++;
			}
		}
	}
	
	private void endGame() {
		view.getF().dispose();
		JOptionPane.showMessageDialog(null,"YOU WIN!");
		
		
	}
}
