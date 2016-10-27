package com.github.andrewbit4.pipob.gui.creation;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class CreationFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JTextField[] textFieldsMan;
	private JTextField[] textFieldsWoman;
	
	public static void main(String[] args) {
		new CreationFrame();
	}
	
	/**
	 * PLEASE, DON'T USE THIS CONSTRUCTOR
	 * 
	 * testing purposes
	 * 
	 * @deprecated
	 */
	public CreationFrame() {
		setTitle("Pipop - Pirámide poblacional");
		setResizable(false);
		setSize(500, 600);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
	
	public CreationFrame(JTextField[] textFieldsMan, JTextField[] textFieldsWoman) {
		this.textFieldsMan = textFieldsMan;
		this.textFieldsWoman = textFieldsWoman;
		setTitle("Pipop - Pirámide poblacional");
		setResizable(false);
		setSize(500, 600);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
	
	public void paint(Graphics graphics) {
		super.paint(graphics);
		
		graphics.drawLine(250, 1, 250, 600);
		
		// hombres
		graphics.drawString("Hombres", 20, 60);
		graphics.drawRect(250, 10, 250, 400);
		
		/*// probando ... cada 1% será 10px
		int age = 1; // cada número representa 5, así que 1 es de 0 a 4 años
		double percentage = 4.00;
		int width = (int) percentage * 10; // calculando el ancho
		int x = (int) 250 - width; // ... calculando la posicion x
		int y = (int) 410 - (10 * age); // calculando y
		graphics.drawRect(x, y, width, 10);*/
		int age = 1;
		
		int totalHumans = 0;
		for(int i = 0; i < 101; i++) {
			totalHumans = totalHumans + Integer.parseInt(textFieldsMan[i].getText());
		}
		
		for(int i = 0; i < 20; i++) {
			int totalPob = 0;
			int min = 0 + 5 * age - 5;
			int max = 0 + 5 * age - 1;
			for(int h = min; h < max; h++) {
				totalPob = totalPob + Integer.parseInt(textFieldsMan[i].getText());
			}
			double percentage = (totalPob * 100) / totalHumans;
			int width = (int) percentage * 10; // calculando el ancho
			int x = (int) 250 - width; // ... calculando la posicion x
			int y = (int) 410 - (10 * age); // calculando y
			graphics.drawRect(x, y, width, 10);
			graphics.drawString("De " + min + " a " + max, 5, y + 2);
			age++;
		}
		
		// mujeres
		graphics.drawString("Mujeres", 430, 60);
		graphics.drawRect(0, 10, 251, 400);
		
		age = 1;
		
		for(int i = 0; i < 20; i++) {
			int totalPob = 0;
			int min = 0 + 5 * age - 5;
			int max = 0 + 5 * age - 1;
			for(int h = min; h < max; h++) {
				totalPob = totalPob + Integer.parseInt(textFieldsWoman[i].getText());
			}
			double percentage = (totalPob * 100) / totalHumans;
			int width = (int) percentage * 10; // calculando el ancho
			int y = (int) 410 - (10 * age); // calculando y
			graphics.drawRect(251, y, width, 10);
			graphics.drawString("De " + min + " a " + max, 425, y + 2);
			age++;
		}
		
	}
	
}
