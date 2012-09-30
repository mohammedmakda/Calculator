package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import calculator.Calculator;

public class CalculatorGUI extends javax.swing.JFrame implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private javax.swing.JTextField _display;
	protected Calculator _calculator;
	
	
	//Constructor
	public CalculatorGUI() {
		super("CSE116 State Pattern Calculator");
	}
	
	public void run() {
		_calculator = new Calculator();
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
		_display = new javax.swing.JTextField(10); // size 10
		JPanel buttonPanel = new JPanel();	
		buttonPanel.setLayout(new GridLayout(4,4));
//		mainPanel.setLayout(new GridLayout(4,4));
		mainPanel.add(_display);
		mainPanel.add(buttonPanel);
		
		/*
		 * Adding buttons and their events that are supposed to be done. 
		 * 
		 */
		addButton(buttonPanel, "7", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				_calculator.pressDigitKey(7);
				updateDisplay();
			}
		});
		addButton(buttonPanel, "8", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				_calculator.pressDigitKey(8);
				updateDisplay();
			}
		});
		addButton(buttonPanel, "9", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				_calculator.pressDigitKey(9);
				updateDisplay();
			}
		});
		addButton(buttonPanel, "*", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				_calculator.pressTimesKey();
				updateDisplay();
			}
		});
		addButton(buttonPanel, "4", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				_calculator.pressDigitKey(4);
				updateDisplay();
			}
		});
		addButton(buttonPanel, "5", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				_calculator.pressDigitKey(5);
				updateDisplay();
			}
		});
		addButton(buttonPanel, "6", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				_calculator.pressDigitKey(6);
				updateDisplay();
			}
		});
		addButton(buttonPanel, "/", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				_calculator.pressDivideKey();
				updateDisplay();
			}
		});
		addButton(buttonPanel, "1", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				_calculator.pressDigitKey(1);
				updateDisplay();
			}
		});
		addButton(buttonPanel, "2", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				_calculator.pressDigitKey(2);
				updateDisplay();
			}
		});
		addButton(buttonPanel, "3", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				_calculator.pressDigitKey(3);
				updateDisplay();
			}
		});
		addButton(buttonPanel, "+", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				_calculator.pressPlusKey();
				updateDisplay();
			}
		});
		addButton(buttonPanel, "C", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				_calculator.pressClearKey();
				updateDisplay();
			}
		});
		addButton(buttonPanel, "0", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				_calculator.pressDigitKey(0);
				updateDisplay();
			}
		});
		addButton(buttonPanel, "=", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				_calculator.pressEqualsKey();
				updateDisplay();
			}
		});
		addButton(buttonPanel, "-", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				_calculator.pressMinusKey();
				updateDisplay();
			}
		});
		this.add(mainPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
	}
	
	// method to update display in the text field
	private void updateDisplay() {
		_display.setText(""+_calculator.getValue());
	}

	// method to create buttons
	private void addButton(JPanel panel, String label, ActionListener eventHandler) {
		JButton b = new JButton(label);
		b.addActionListener(eventHandler);
		panel.add(b);
	}

	public static void main (String[] Args){
        SwingUtilities.invokeLater(new CalculatorGUI());
	} 
}
