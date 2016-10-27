package com.github.andrewbit4.pipob.gui.startup;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.github.andrewbit4.pipob.gui.setup.SetupFrame;

public class InitialFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JButton continueButton = new JButton("Continuar");

	public InitialFrame() {
		setTitle("Pipob - Andres R. Arias");
		setResizable(false);
		setSize(250, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		continueButton.setBounds(50, 150, 150, 40);
		continueButton.addActionListener(this);
		add(continueButton);
	}

	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == continueButton) {
			setTitle("Enviando a la siguiente ventana.");
			new SetupFrame();
		}
	}

}
