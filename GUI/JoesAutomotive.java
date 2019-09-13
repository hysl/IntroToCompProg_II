/*
Helen Li
April 22, 2019
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class JoesAutomotive extends JFrame
{
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JLabel sparePartsLabel;
	private JTextField sparePartsText;
	private JLabel laborHoursLabel;
	private JTextField laborHoursText;
	private JButton calcButton;

	public final double OIL_CHANGE = 26.0;
	public final double LUBE_JOB = 18.0;
	public final double RADIATOR_FLUSH = 30.0;
	public final double TRANSMISSION_FLUSH = 80.0;
	public final double INSPECTION = 15.0;
	public final double MUFFLER_REPLACEMENT = 100.0;
	public final double TIRE_ROTATION = 20.0;
	public final double LABOR_PER_HOUR = 20.0;

	private JCheckBox oilChange;
	private JCheckBox lubeJob;
	private JCheckBox radiatorFlush;
	private JCheckBox transmissionFlush;
	private JCheckBox inspection;
	private JCheckBox mufflerReplacement;
	private JCheckBox tireRotation;

	public JoesAutomotive()
	{
		setTitle("Joe's Automotive");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		buildPanel1();
		buildPanel2();
		buildButton();

		add(panel1, BorderLayout.NORTH);
		add(panel2, BorderLayout.CENTER);
		add(panel3, BorderLayout.SOUTH);

		pack();
		setVisible(true);
	}

	private void buildPanel1()
	{
		oilChange = new JCheckBox("Oil Change");
		lubeJob = new JCheckBox("Lube Job");
		radiatorFlush = new JCheckBox("Radiator Flush");
		transmissionFlush = new JCheckBox("Transmission Flush");
		inspection = new JCheckBox("Inspection");
		mufflerReplacement = new JCheckBox("Muffler Replacement");
		tireRotation = new JCheckBox("Tire Rotation");
		
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(7,1));
		panel1.add(oilChange);
		panel1.add(lubeJob);
		panel1.add(radiatorFlush);
		panel1.add(transmissionFlush);
		panel1.add(inspection);
		panel1.add(mufflerReplacement);
		panel1.add(tireRotation);
	}

	private void buildPanel2()
	{
		sparePartsLabel = new JLabel("Spare Parts $");
		sparePartsText = new JTextField(10);
		laborHoursLabel = new JLabel("Labor Hours");
		laborHoursText = new JTextField(10);

		panel2 = new JPanel();
		panel2.setLayout(new GridLayout(3, 2));
		panel2.add(sparePartsLabel);
		panel2.add(sparePartsText);
		panel2.add(laborHoursLabel);
		panel2.add(laborHoursText);
	}

	private void buildButton()
	{
		panel3 = new JPanel();

		calcButton = new JButton("Calculate");
		calcButton.addActionListener(new CalcButtonListener());

		panel3.setLayout(new GridLayout(1, 1));

		panel3.add(calcButton);
	}

	private class CalcButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double total = 0.0;
			String input1, input2;

			if(oilChange.isSelected())
				total += OIL_CHANGE;
			if(lubeJob.isSelected())
				total += LUBE_JOB;
			if(radiatorFlush.isSelected())
				total += RADIATOR_FLUSH;
			if(transmissionFlush.isSelected())
				total += TRANSMISSION_FLUSH;
			if(inspection.isSelected())
				total += INSPECTION;
			if(mufflerReplacement.isSelected())
				total += MUFFLER_REPLACEMENT;
			if(tireRotation.isSelected())
				total += TIRE_ROTATION;

			input1 = sparePartsText.getText();
			input2 = laborHoursText.getText();

			if(!input1.isEmpty())
				total += Double.parseDouble(input1);
			if(!input2.isEmpty())
				total += (Double.parseDouble(input2) * LABOR_PER_HOUR);

			DecimalFormat dollar = new DecimalFormat("0.00");

			JOptionPane.showMessageDialog(null, "The total cost is $" +
					dollar.format(total));
		}
	}

	public static void main(String[] args)
	{
		new JoesAutomotive();
	}
}
