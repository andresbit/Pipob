package com.github.andrewbit4.pipob.gui.creation;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CreationInfo {
	
	private JTextField[] textFieldsMan;
	private JTextField[] textFieldsWoman;
	
	public CreationInfo(JTextField[] textFieldsMan, JTextField[] textFieldsWoman) {
		this.textFieldsMan = textFieldsMan;
		this.textFieldsWoman = textFieldsWoman;
		writePyramid();
	}

	private static boolean isNumeric(String string){
		try {
			Integer.parseInt(string);
			return true;
		} catch (NumberFormatException exception){
			return false;
		}
	}
	
	private void writePyramid() {
		boolean valid = true;
		for(int i = 0; i < 101; i++) {
			if(!(isNumeric(textFieldsMan[i].getText()) && isNumeric(textFieldsWoman[i].getText()))) {
				valid = false;
				break;
			}
		}
		if(valid) {
			new CreationFrame(textFieldsMan, textFieldsWoman);
			JOptionPane.showMessageDialog(null, "Todo está bien");
		}
		else {
			JOptionPane.showMessageDialog(null, "¡Alguno de los valores no es válido!");
		}
	}
	
}
