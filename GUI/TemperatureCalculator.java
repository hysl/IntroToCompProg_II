/*
Helen Li
April 22, 2019
*/

import javax.swing.*;
import java.awt.event.*;

public class TemperatureCalculator extends JFrame
{
	private JPanel panel;
	private JLabel messageLabel;
	private JTextField tempTextField;
	private JButton calcButtonC;
	private JButton calcButtonF;
	private final int WINDOW_WIDTH = 330;
	private final int WINDOW_HEIGHT = 150;

	public TemperatureCalculator()
	{
		setTitle("Temperature Calculator");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}

	private void buildPanel()
	{
		messageLabel = new JLabel("Enter a tempertaure");
		tempTextField = new JTextField(10);
		calcButtonC = new JButton("Convert to °C");
		calcButtonC.addActionListener(new CalcButtonListener());
		calcButtonF = new JButton("Convert to °F");
		calcButtonF.addActionListener(new CalcButtonListener());
		panel = new JPanel();
		panel.add(messageLabel);
		panel.add(tempTextField);
		panel.add(calcButtonC);
		panel.add(calcButtonF);
	}

	private class CalcButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String input;
			Double convertedTemp;
			String actionCommand = e.getActionCommand();

			input = tempTextField.getText();

			if(actionCommand.equals("Convert to °C"))
			{
				convertedTemp = (Double.parseDouble(input) - 32.0) * 5/9;
				JOptionPane.showMessageDialog(null, input + " °F = " + 
						convertedTemp + " °C");
			}
			else
			{
				convertedTemp = (Double.parseDouble(input) * 9/5) + 32.0;
				JOptionPane.showMessageDialog(null, input + " °C = " + 
						convertedTemp + " °F");
			}
		}
	}

	public static void main(String[] args)
	{
		new TemperatureCalculator();
	}
}
