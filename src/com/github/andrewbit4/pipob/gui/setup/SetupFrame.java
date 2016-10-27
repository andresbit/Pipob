package com.github.andrewbit4.pipob.gui.setup;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.github.andrewbit4.pipob.gui.creation.CreationInfo;

public class SetupFrame extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel[] textLabels = new JLabel[101];
	private JTextField[] textFieldsMan = new JTextField[101];
	private JTextField[] textFieldsWoman = new JTextField[101];
	private JButton createButton = new JButton("Crear pirámide");
	

	public SetupFrame() {
		setVisible(true);
		setTitle("Pipop - Configuración pirámide");
		setResizable(true);
		setSize(1200, 1000);
		setLayout(new GridLayout(51, 51));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int i = 0; i < 100; i++) {
			textLabels[i] = new JLabel(i + " año(s): ");
			textFieldsMan[i] = new JTextField(9);
			textFieldsWoman[i] = new JTextField(9);
			if(i == 0 || i == 1) {
				textFieldsMan[i].setText("Hombres");
				textFieldsWoman[i].setText("Mujeres");
			}
			else {
				textFieldsMan[i].setText("1");
				textFieldsWoman[i].setText("1");
			}
			add(textLabels[i]);
			add(textFieldsMan[i]);
			add(textFieldsWoman[i]);
		}
		textLabels[100] = new JLabel("+100 años");
		textFieldsMan[100] = new JTextField(9);
		textFieldsMan[100].setText("1");
		textFieldsWoman[100] = new JTextField(9);
		textFieldsWoman[100].setText("1");
		add(textLabels[100]);
		add(textFieldsMan[100]);
		add(textFieldsWoman[100]);
		createButton.addActionListener(this);
		add(createButton);
	}

	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == createButton) {
			new CreationInfo(textFieldsMan, textFieldsWoman);
		}
	}

}
