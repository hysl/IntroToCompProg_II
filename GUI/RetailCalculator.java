/*
Helen Li
April 22, 2019
*/

import javax.swing.*;
import java.awt.event.*;

public class RetailCalculator extends JFrame
{
	private JPanel panel;
	private JLabel messageLabel1;
	private JTextField priceTextField1;
	private JLabel messageLabel2;
	private JTextField priceTextField2;
	private JButton calcButton;
	private final int WINDOW_WIDTH = 330;
	private final int WINDOW_HEIGHT = 150;

	public RetailCalculator()
	{
		setTitle("Retail Price Calculator");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}

	private void buildPanel()
	{
		messageLabel1 = new JLabel("Enter a wholesale price");
		priceTextField1 = new JTextField(10);
		messageLabel2 = new JLabel("Enter a markup percentage");
		priceTextField2 = new JTextField(10);
		calcButton = new JButton("Calculate");
		calcButton.addActionListener(new CalcButtonListener());
		panel = new JPanel();
		panel.add(messageLabel1);
		panel.add(priceTextField1);
		panel.add(messageLabel2);
		panel.add(priceTextField2);
		panel.add(calcButton);
	}

	private class CalcButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String input1, input2;
			double retailPrice;

			input1 = priceTextField1.getText();
			input2 = priceTextField2.getText();

			retailPrice = Double.parseDouble(input1) * ((Double.parseDouble(input2)/100) + 1.0);

			JOptionPane.showMessageDialog(null, input1 + " @ " + input2 +
					" = " + retailPrice + "\nRetail Price = " + retailPrice);
		}
	}

	public static void main(String[] args)
	{
		new RetailCalculator();
	}
}
